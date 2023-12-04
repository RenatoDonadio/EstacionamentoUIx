package com.mycompany.estacionamento;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pichau
 * 
 */

public class DadosEstac {
    private String ticket;
    
   public DadosEstac(){
       
   }
    public DadosEstac(String ticket){
       this.ticket=ticket;
   }
    
    public String getTicket(){
        return ticket;
    }
    
    public void setTicket(String ticket){
        this.ticket = ticket;
    }
            
       
   }
   
 
