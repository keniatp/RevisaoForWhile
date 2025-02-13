package org.example;

import java.util.Scanner;
public class lacoFOR01 {
    public static void main(String[] args) {
        int sair = 1;
        Scanner sc = new Scanner(System.in);
        while (sair == 1) {
            System.out.println("\n\n----- LAÇO FOR ----- \nEscolha um dos exercicios abaixo \n1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 " +
                    "\n10 - 11 - 12 - 13 - 14 - 15 " + "\nDigite 0 (zero) para sair! :\n");
            int escolha = sc.nextInt();
            sc.nextLine(); //Limpar meus scaners
            switch (escolha) {
                case 0:
                    sair = 0;
                    break;

                case 1:
                    System.out.println("======= Questão 1 ======= ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " ");
                    }
                    break;

                case 2:
                    System.out.println("======= Questão 2 ======= ");
                    for (int i = 10; i >= 1; i--) {
                        System.out.print(i + " ");
                    }
                    break;

                case 3:
                    System.out.println("======= Questão 3 ======= ");
                    for (int i = 2; i <= 20; i++) {
                        if (i%2 == 0){
                            System.out.print(i + " ");
                        }
                    }
                    break;

                case 4:
                    System.out.println("======= Questão 4 ======= ");
                    for (int i = 1; i < 20; i++) {
                        if (i%2 == 1){
                            System.out.print(i + " ");
                        }
                    }
                    break;

                case 5:
                    System.out.println("======= Questão 5 ======= ");
                    int soma = 0;
                    for (int i = 1; i <= 100; i++) {
                        soma+= i;
                    }
                    System.out.println("A soma de 1 a 100: " + soma);
                    break;

                case 6:
                    System.out.println("======= Questão 6 ======= ");
                    int somapar = 0;
                    for (int i = 1; i <= 100; i++) {
                        if (i%2 == 0) {
                            somapar += i;
                        }
                    }
                    System.out.println("A soma dos pares de 1 a 100: " + somapar);
                    break;

                case 7:
                    System.out.println("======= Questão 7 ======= ");
                    int somaimpar = 0;
                    for (int i = 1; i <= 100; i++) {
                        if (i%2 == 1) {
                            somaimpar += i;
                        }
                    }
                    System.out.println("A soma dos impares de 1 a 100: " + somaimpar);
                    break;

                case 8:
                    System.out.println("======= Questão 8 ======= ");
                    System.out.println("===== TABUADA DO 7 =====");
                    int ii = 7;
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(i + "x" + ii + "=" + (i*ii));
                    }
                    break;
                case 9:
                    System.out.println("======= Questão 9 ======= ");
                    System.out.println("Digite um valor: ");
                    int valorDoUsuario = sc.nextInt();
                    System.out.println("===== TABUADA DO " + valorDoUsuario + " =====");

                    for (int i = 0; i <= 10; i++) {
                        System.out.println(i + "x" + valorDoUsuario + "=" + (i*valorDoUsuario));
                    }
                    break;
                case 10:
                    System.out.println("======= Questão 10 ======= ");
                    System.out.println("Multiplos de 5");
                    for (int i = 0; i <= 10; i++) {
                        if (i%5 == 0){
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case 11:
                    System.out.println("======= Questão 11 ======= ");
                    System.out.println("Quadrados dos numeros de 1 a 10");
                    for (int i = 1; i < 10; i++) {
                        System.out.print((i*2) + " ");
                    }
                    break;
                case 12:
                    System.out.println("======= Questão 12 ======= ");
                    System.out.println("Cubos dos numeros de 1 a 10");
                    for (int i = 1; i < 10; i++) {
                        double cubo = Math.pow(i, 3);
                        System.out.print(cubo + " ");
                    }
                    break;
                case 13:
                    System.out.println("======= Questão 13 ======= ");
                    System.out.println("--- Fibonacci ---");
                    int fibo = 1;
                    int ant = 0;
                    for (int i = 1; i <= 10; i++) {
                        if (i == 1) {
                            fibo = 1;
                            ant = 0;
                        } else {
                            fibo += ant;
                            ant = fibo - ant;
                        }
                        System.out.println(fibo + " ");
                    }

                    break;
                case 14:
                    System.out.println("======= Questão 14 ======= ");
                   // boolean primo;
                    for (int i = 2; i < 50; i++) {
                        boolean primo = true;
                        for (int j = 2; j < i; j++) {
                            if (i%j == 0){
                                primo = false;
                            }
                        }
                        if (primo){
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case 15:
                    System.out.println("======= Questão 15 ======= ");
                    for (int i = 0; i < 100; i++) {
                        if (i%3 == 0) {
                            System.out.println("Fizz");
                        }else if (i%5 == 0) {
                            System.out.println("Buzz");
                        }else{
                            System.out.println(i);
                        }
                    }
                    break;

                default:
                    System.out.println("Valor inválido!\n");
                    break;
            }
        }
        sc.close();
    }
}