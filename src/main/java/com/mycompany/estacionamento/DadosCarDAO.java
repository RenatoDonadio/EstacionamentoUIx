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





/**
 *
 * @author Pichau
 */
public class DadosCarDAO {
   
    private static final String BD_URL = "jdbc:mysql://localhost:3306/bd_estacionamento"; 
    private static final String USER = "root"; // root
    private static final String PASSWORD = "root";
    
    public static boolean inserir(DadosCar carros) {
        final String INSERT_VEHICLE = "insert into veiculos values(null, ?, ?, ?)"; 
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
   public static int atualizarValor(int ticket) {
        final String ATUALIZAR_PAGO = "UPDATE ValordoTicket SET V = ? WHERE IdTicket= ?;";
         try (Connection conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement(ATUALIZAR_PAGO)) {
             preparedStatement.setInt(1, ticket);
           
           
            
            int registros = preparedStatement.executeUpdate();
            return registros;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
            
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
            preparedStatement.setString(1, valor.getPlaca());
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
}

      
        
      
        




     
    
    

