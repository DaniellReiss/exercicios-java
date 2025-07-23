package com.example.exerciciojava;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioCalculoArea03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        //Esse serve pra digitar os numeros com pontos ao invés de vírgula. Padrão EUA.
        Scanner sc = new Scanner(System.in);
        double area, raio;
        double pi = 3.14159;
        System.out.println("Digite o valor do raio do círculo: ");
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2.0);
        System.out.printf("A área do seu círculo é igual à: %.4f \n", area );
        //Print F pra conseguir definir as o valor dos decimais (números depois do ponto)

    }
}
