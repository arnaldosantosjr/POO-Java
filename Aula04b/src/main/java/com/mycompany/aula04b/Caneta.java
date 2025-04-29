
package com.mycompany.aula04b;


public class Caneta {
   public String modelo;
    float ponta;
    private String modedo;
    
    
    public String getModelo()
    {
        return this.modedo;
    }
    public void setModelo(String m){
        this.modelo = m;
        
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void status(){
            System.out.println("Sobrea acaneta: ");
            System.out.println("Modelo: "+ this.getModedo());
            System.out.println("Ponta: " + this.getPonta());
}

    private String getModedo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
