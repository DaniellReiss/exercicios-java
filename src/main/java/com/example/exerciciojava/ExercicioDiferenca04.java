package com.example.exerciciojava;

import java.util.Scanner;

public class ExercicioDiferenca04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B, C, D, diferenca;

        System.out.print("Digite o primeiro número: ");
        A = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        B = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        C = sc.nextInt();

        System.out.print("Digite o quarto número: ");
        D = sc.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("A diferença da Multiplicação de: " + A + " x " + B + " com " + C + " x " + D + " é igual a: " + diferenca);

        sc.close();
    }
}
