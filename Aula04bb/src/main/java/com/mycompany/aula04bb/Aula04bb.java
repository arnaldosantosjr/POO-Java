package com.mycompany.aula04bb;
public class Aula04bb {

    public static void main(String[] args) {
        System.out.println("===========================");
            Caneta c1 = new Caneta("Compator", "Verde",0.7f);
            c1.status();
            System.out.println("===========================");
            Caneta c2 = new Caneta("Bic", "Vermelho", 0.7f);
            c2.status();
            System.out.println("===========================");
            Caneta c3 = new Caneta("Bic", "Azul",0.5f);
            c3.status();
            System.out.println("===========================");
            
            //As duas formas abaixo estão corretas
            //c1.setModelo ("BIC");//Usai o método acessor
            //c1.modelo = "BIC";//Acessei diretamente o atribudo
            
       
            //Fazendo o mesmo com a ponta:
            //c1.setPonta (0.5f);
            //c1.ponta =  0.5f; //Aqui teremos um erro, pois ponta tem um acesso pridado em ceneta.
            
            
            
            //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta()); 
    }
}
