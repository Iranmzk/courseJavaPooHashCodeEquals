package application;

import entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        //Tratamento especial para literais = compila verdadeiro
        //se o String fosse estanciado daria falso pois alocaria
        // referencias diferentes na memória.
        String s1 = "teste";
        String s2 = "teste";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        //Comparando refêrencia do conteúdo = compila verdadeiro
        System.out.println(c1.equals(c2));
        //Comparando refêrencia de memória = compila falso
        System.out.println(c1 == c2);
        System.out.println(s1 == s2);
    }

}
