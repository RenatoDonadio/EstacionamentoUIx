/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estacionamento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





/**
 *
 * @author Pichau
 */
public class DadosCarDAO {
   
    private static final String BD_URL = "jdbc:mysql://localhost:3306/bd_estacionamento"; 
    private static final String USER = "root"; // root
    private static final String PASSWORD = "root";
    
    public static boolean inserir(DadosCar carros) {
        final String INSERT_VEHICLE = "insert into veiculos(carro,placa,horario) values( ?, ?, ?)"; 
        // conectar com o BD - desconectar no final
        // try with resources fecha automaticamente ao final toda conexão aberta
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try  {
             connection = DriverManager.getConnection(BD_URL, USER, PASSWORD);
             preparedStatement = 
                connection.prepareStatement(INSERT_VEHICLE);
            preparedStatement.setString(1, carros.getCarro());
            preparedStatement.setString(2, carros.getPlaca());
            preparedStatement.setString(3, carros.getHora());
            // enviar o comando
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                
            }
            

        }
    }
    
    
    public static DadosCar buscarPorTicket(int ticket) {
        
        final String SELECT_TICKET_SQL = "SELECT * FROM veiculos WHERE ticket = ?;";
        try (
            Connection conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_TICKET_SQL)) {
            preparedStatement.setInt(1, ticket);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) { // testa se tem uma próxima linha na tabela
                
                String carro = rs.getString("carro");
                String placa = rs.getString("placa");
                String horario = rs.getString("horario");
                String ValorPago = rs.getString("ValorPago");
                
                DadosCar carros = new DadosCar (carro, placa, horario,ValorPago);
                return carros;
            }
            return null; // não achou o RA
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        
    }
    public static boolean transferir(DadosEstac estacionamento) {
        final String INSERT_ESTACINFO = "insert into estacionamento values(null, ?);"; 
        // conectar com o BD - desconectar no final
        // try with resources fecha automaticamente ao final toda conexão aberta
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try  {
             connection = DriverManager.getConnection(BD_URL, USER, PASSWORD);
             preparedStatement = 
                connection.prepareStatement(INSERT_ESTACINFO);
            preparedStatement.setString(1, estacionamento.getTicket());
            
            // enviar o comando
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                
            }
            

        }
    }
   public static int atualizarCarro(int ticket, String carro) {
        final String ATUALIZAR_CARRO = "UPDATE veiculos SET carro = ? WHERE ticket = ?;";
         try (Connection conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement(ATUALIZAR_CARRO)) {
             preparedStatement.setString(1, carro);
             preparedStatement.setInt(2, ticket);
           
           
            
            int registros = preparedStatement.executeUpdate();
            return registros;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
            
        }
    }
   public static boolean AtualizarValorPago (int ticket, String ValorPago){
       final String ATUALIZAR_VP = "UPDATE veiculos SET ValorPago = ? where ticket = ?;";
       try (Connection conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
             ResultSet resultset = null;
            
            PreparedStatement preparedStatement = conn.prepareStatement(ATUALIZAR_VP)) {
             preparedStatement.setString(1,ValorPago = "Pago");
             preparedStatement.setInt(2, ticket);
             
             
           
           
          
            int registers = preparedStatement.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
            
        }
       
       
   }
   
   public static boolean insert(DadosHoras horarios) {
        final String INSERT_HOURS = "insert into horario values(null, ?, ?, ?);"; 
        
        // conectar com o BD - desconectar no final
        // try with resources fecha automaticamente ao final toda conexão aberta
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try  {
             connection = DriverManager.getConnection(BD_URL, USER, PASSWORD);
             preparedStatement = 
                connection.prepareStatement(INSERT_HOURS);
            preparedStatement.setString(1, horarios.getTicket());
            preparedStatement.setString(2, horarios.getHora());
            preparedStatement.setString(3, horarios.getHoraS());
             
         

          
            // enviar o comando
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                
            }
            

        }
    }
   
   
   
   public static boolean insira(DadosValor valor) {
         
        final String INSERT_VALOR = "Insert into ValordoTicket values (null, ?,?);";
        // conectar com o BD - desconectar no final
        // try with resources fecha automaticamente ao final toda conexão aberta
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try  {
             connection = DriverManager.getConnection(BD_URL, USER, PASSWORD);
             preparedStatement = 
                connection.prepareStatement(INSERT_VALOR);
            preparedStatement.setInt(1, valor.getTicket());
            preparedStatement.setString(2, valor.getValor());
           
            
             connection.prepareStatement(INSERT_VALOR);
         

          
            // enviar o comando
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                
            }
            

        }
        
        
        }
    public static int apagarPorTicketCarros(int ticket) {
        final String DELETE_CARROS = "DELETE FROM veiculos WHERE ticket = ?;";

        try (Connection conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement(DELETE_CARROS)) {
            preparedStatement.setInt(1, ticket);
            int registros = preparedStatement.executeUpdate();
            return registros;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
      public static int apagarPorTicket(int ticket) {
        final String DELETE_TICKET = "DELETE FROM estacionamento WHERE idTicket = ?;";

        try (Connection conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement(DELETE_TICKET)) {
            preparedStatement.setInt(1, ticket);
            int registros = preparedStatement.executeUpdate();
            return registros;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
      public static int apagarPorTicketHorario(int ticket) {
        final String DELETE_TICKET = "DELETE FROM horario WHERE IdTicket = ?;";

        try (Connection conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement(DELETE_TICKET)) {
            preparedStatement.setInt(1, ticket);
            int registros = preparedStatement.executeUpdate();
            return registros;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
      public static int apagarPorTicketValor(int ticket) {
        final String DELETE_TICKET = "DELETE FROM ValordoTicket WHERE Vticket = ?;";

        try (Connection conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement(DELETE_TICKET)) {
            preparedStatement.setInt(1, ticket);
            int registros = preparedStatement.executeUpdate();
            return registros;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}

      
        
      
        




     
    
    

