
 
package com.mycompany.estacionamento;

/**
 *
 * @author Pichau
 */
public class DadosCar {
    private int ticket;
    private String carro;
    private String placa;
    private String horario;
    private String horarioS;
  
    public DadosCar() {
        
    }
    
    public DadosCar (String carro, String placa, String horario) {
        this.carro = carro;
        this.placa = placa;
        this.horario = horario;
    }

    public DadosCar (int ticket, String carro, String placa, String horario) {
         this.ticket = ticket;
         this.carro = carro;
         this.placa = placa;
        
        
    }
    
    
      

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
    
    
    public void CalculoHoras() {
        
    
    }

    @Override
    public String toString() {
        return "DadosCar [Ticket=" + ticket + ", Carro=" + carro + ", Placa=" + placa + ", Horario=" + horario +"]";
    }
}
    

