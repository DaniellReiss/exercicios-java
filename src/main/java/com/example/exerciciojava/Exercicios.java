package com.example.exerciciojava;
import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, result;

        System.out.println("Digite o primeiro Número:");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo Número:");
        num2 = sc.nextInt();

        result = num1 + num2;

        System.out.println("A soma dos números é: " + result);

        sc.close();

    }
}
