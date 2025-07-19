package com.example.exerciciojava;
import java.util.Locale;

public class Exercicios {
    public static void main(String[] args) {

        String produto1 = "Computador";
        String produto2 = "Notebook";
        int idade = 18;
        int codigo = 3315;
        char genero = 'M';
        double preco1 = 2100.00;
        double preco2 = 1500.00;
        double measure = 33.12345;

        System.out.println("Produtos: ");
        System.out.println(produto1 + ", cujo o preço é igual a: $" + preco1);
        System.out.println(produto2 + ", cujo o preço é igual a: $" + preco2);
        System.out.println("Record: " + idade + " anos de idade, code " + codigo + " e genero: " + genero);
        System.out.printf("Measure com 5 decimais: %.5f \n", measure);
        System.out.printf("Measure com 3 decimais: %.3f \n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Measure com 3 decimais e com ponto: %.3f \n", measure);

    }
}
