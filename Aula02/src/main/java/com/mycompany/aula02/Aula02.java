package com.mycompany.aula02;
public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Compactor";
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.carga = 80;
        c2.tampar();
        c2.status();
        c2.rabiscar();
        
        Caneta c3 = new Caneta();
        c3.modelo = "Molin";
        c3.cor = "Vermelha";
        c3.ponta = 1.0f;
        c3.carga = 50;
        c3.destampar();
        c3.status();
        c3.rabiscar();
    }
}
