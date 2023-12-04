/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estacionamento;

/**
 *
 * @author Pichau
 */
public class DadosValor {
    private int ticket;
    private String Valor;
   
    
   public DadosValor(){

} 
   public DadosValor(int ticket, String Valor){
        this.Valor = Valor;
        this.ticket = ticket;
    
       

} 
       public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }
    
       public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }
    
   
    
    
}
   



