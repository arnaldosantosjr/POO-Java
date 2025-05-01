package com.mycompany.aula02b;
public class Aula02b {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.fabricante = "Chevrolet";
        c1.modelo = "Onix";
        c1.cor = "Cinza";
        //c1.motor = 1.0f;
        //c1.ano = 2013;
        c1.freio = "ABS";
        c1.vendido = true;
        c1.abastecido = true;
        c1.status();
        c1.abastecer();
        
        
        Carro c2 = new Carro();
        c2.fabricante = "Ford";
        c2.modelo = "Fiesta";
        c2.cor = "Preto";
        //c2.motor = 1.6f;
        //c2.ano = 2012;
        c2.freio = "ABS";
        c2.vendido = true;
        c2.abastecido = false;
        c2.status();
        c2.abastecer();
       

    
    }


}
