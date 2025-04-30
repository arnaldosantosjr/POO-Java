package com.mycompany.aula02b;
public class Aula02b {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.fabricante = "Ford";
        c1.modelo = "Sedan";
        c1.cor = "Preto";
        c1.freio = "ABS";
        c1.motor = 1.0f;
        c1.ano = 2000;
        c1.vendido = true;
        c1.abastecido = false;
        
        c1.status();
        c1.abastecer();
    }
}
