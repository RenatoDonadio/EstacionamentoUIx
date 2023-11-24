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
    private String placa;
    private String Valor;
    
   public DadosValor(){

} 
   public DadosValor(String placa, String Valor){
        this.Valor = Valor;
        this.placa = placa;
       

} 
       public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
       public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }
    
    
}
   



