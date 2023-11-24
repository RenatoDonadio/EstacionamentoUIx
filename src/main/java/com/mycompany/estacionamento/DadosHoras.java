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
     private String horario;
    private String horarioS;
    private String placa;
    private String Valor;
    
 public DadosHoras() {
        
    }
 
public DadosHoras (String horario, String horarioS) {
        
        this.horario = horario;
        this.horarioS = horarioS;
    }

public DadosHoras (String horario, String horarioS, String placa, String Valor) {
        
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
    
       public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }
    
    
}

   

