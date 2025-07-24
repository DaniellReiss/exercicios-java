package com.example.exerciciojava;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNumFuncionario05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int func;
        double sal, hora, salhora;

        Locale.setDefault(Locale.US);

        System.out.print("Digite o ID do Funcionário: ");
        func = sc.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        hora = sc.nextDouble();

        System.out.print("Digite o valor do Salário por Hora: ");
        sal = sc.nextDouble();

        salhora = (sal * hora);

        System.out.println("ID do Funcionário: " + func);
        System.out.printf("Salário: U$ %.2f", salhora);

        sc.close();



    }
}
