/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estacionamento;

/**
 *
 * @author Pichau
 * 
 * 
 */
   
public class DadosHoras {
     private String ticket;
     private String horario;
    private String horarioS;
    private String placa;
    private double Valor;
    
 public DadosHoras() {
        
    }
 
public DadosHoras (String horario, String horarioS) {
        
        this.horario = horario;
        this.horarioS = horarioS;
    }
public DadosHoras (String horario, String horarioS, String ticket) {
        
        this.horario = horario;
        this.horarioS = horarioS;
        this.ticket = ticket;
    }


public DadosHoras (String horario, String horarioS, String placa, double Valor) {
        
        this.horario = horario;
        this.horarioS = horarioS;
        this.placa = placa;
        this.Valor = Valor;
    }




    
    public String getHora() {
        return horario;
    }

    public void setHora(String horario) {
        this.horario = horario;
    }
    
       public String getHoraS() {
        return horarioS;
    }

    public void setHoraS(String horarioS) {
        this.horarioS = horarioS;
    }
    
    
     public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
       public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    
       public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    
    
}

   

