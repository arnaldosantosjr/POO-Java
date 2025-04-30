package com.mycompany.aula02b;
public class Carro {
    public String fabricante;
    public String modelo;
    public String cor;
    private float motor;
    private int ano;
    protected String freio;
    protected boolean vendido;
    protected boolean abastecido;
    
    void status(){
        System.out.println("========================================");
        System.out.println("O carro da marca: " + this.fabricante);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Motor: " + this.motor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Freio: " + this.freio);
        System.out.println("vendido: " + this.vendido);
        System.out.println("Abastecido: " + this.abastecido);
        System.out.println("=======================================");
    }
    
    
    
    public void abastecer(){
        if (this.abastecido == false){
            System.out.println("ERRO: Precisa Abastecer para Retirar o Veículo!");
        
        }else{
            System.out.println("Carro pronto para retirada");
        }
        System.out.println("=======================================");
    
    }
    void tanquevazio(){
        this.abastecido = false;
        
    }
    void tanquecheio(){
        this.abastecido = true;
    }
}
