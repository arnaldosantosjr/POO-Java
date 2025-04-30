package com.mycompany.aula02b;
public class Aula02b {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.fabricante = "Ford";
        c1.modelo = "Gol";
        c1.cor = "Preto";
        c1.freio = "ABS";
        c1.motor = 1.0f;
        c1.ano = 2000;
        c1.vendido = true;
        c1.abastecido = false;
        
        c1.status();
        c1.abastecer();
        
        Carro c2 = new Carro();
        c2.fabricante = "Chevrolet";
        c2.modelo = "Onix";
        c2.cor = "Branco";
        c2.freio = "ABS";
        c2.motor = 1.0f;
        c2.ano = 2020;
        c2.vendido = false;
        c2.abastecido = true;

        c2.status();
        c2.abastecer();
        c2.tanquevazio();

    
    }


}
