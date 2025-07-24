package com.example.exerciciojava;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPeca06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int cod1, cod2, quant1, quant2;
        double price1, price2, pricef;

        Locale.setDefault(Locale.US);

        System.out.print("Digite o código da peça 1: ");
        cod1 = sc.nextInt();

        System.out.print("Digite a quantidade da peça 1: ");
        quant1 = sc.nextInt();

        System.out.print("Digite o preço da peça 1: ");
        price1 = sc.nextDouble();

        System.out.print("Digite o código da peça 2: ");
        cod2 = sc.nextInt();

        System.out.print("Digite a quantidade da peça 2: ");
        quant2 = sc.nextInt();

        System.out.print("Digite o preço da peça 2: ");
        price2 = sc.nextDouble();

        pricef = (price1 * quant1) + (price2 * quant2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", pricef);

        sc.close();

    }
}
