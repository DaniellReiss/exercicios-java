package com.example.exerciciojava;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCalculoAreas07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double A, B, C;
        double tria, circ, trap, quad, reta;
        double pi = 3.14159;

        Locale.setDefault(Locale.US);

        System.out.print("Valor do A: ");
        A = sc.nextDouble();
        System.out.print("Valor do B: ");
        B = sc.nextDouble();
        System.out.print("Valor do C: ");
        C = sc.nextDouble();

        tria = (A * C) / 2.0;
        circ = pi * Math.pow(C, 2.0);
        trap = ((A + B) * C) / 2.0;
        quad = (B * B);
        reta = (A * B);

        System.out.printf("TRIÂNGULO: %.3f%n", tria);
        System.out.printf("CÍRCULO: %.3f%n", circ);
        System.out.printf("TRAPÉZIO: %.3f%n", trap);
        System.out.printf("QUADRADO: %.3f%n", quad);
        System.out.printf("RETÂNGULO: %.3f%n", reta);

        sc.close();
    }
}
