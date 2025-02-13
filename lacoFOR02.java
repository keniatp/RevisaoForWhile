package org.example;

import java.util.Scanner;
public class lacoFOR02 {
    public static void main(String[] args) {
        int sair = 1;
        Scanner sc = new Scanner(System.in);
        while (sair == 1) {
            System.out.println("\n\n----- LAÇO FOR ----- \nEscolha um dos exercicios abaixo \n16 - 17 - 18 - 19 - 20 - 21 - 22 - 23 - 24 " +
                    "\n25 - 26 - 27 - 28 - 29 -30 " + "\nDigite 0 (zero) para sair! :\n");
            int escolha = sc.nextInt();
            sc.nextLine(); //Limpar meus scaners
            switch (escolha) {
                case 0:
                    sair = 0;
                    break;

                case 16:
                    System.out.println("======= Questão 16 ======= ");
                    System.out.print("Informe uma string: ");
                    String frase = sc.nextLine();
                    for (int i = 0; i < frase.length(); i++) {
                        System.out.println(frase.charAt(i));
                    }

                    break;

                case 17:
                    System.out.println("======= Questão 17 ======= ");
                    System.out.print("Informe uma string: ");
                    String palavra = sc.nextLine();
                    for (int i = palavra.length()-1; i >= 0 ; i--) {
                        System.out.println(palavra.charAt(i));
                    }
                    break;

                case 18:
                    System.out.println("======= Questão 18 ======= ");
                    System.out.print("Informe uma string: ");
                    String frasePalindromo = sc.nextLine();
                    boolean isPalindromo = true;
                    int tam = frasePalindromo.length();
                        for (int i =0; i < tam/2; i++){
                            if (frasePalindromo.charAt(i) != frasePalindromo.charAt(tam-1-i)){
                                isPalindromo = false;
                                break;
                            }
                        }
                    if (isPalindromo){
                        System.out.println("É palindromo");
                    }else{
                        System.out.println("Nao é palindromo");
                    }
                    break;

                case 19:
                    System.out.println("======= Questão 19 ======= ");
                    System.out.println("Digite um valor: ");
                    int valor = sc.nextInt();
                    int fatorial = 1;
                    for (int i = 1; i <= valor; i++) {
                        fatorial*= i;
                    }
                    System.out.println("O fatorial de "+valor+" é: " + fatorial);
                    break;

                case 20:
                    System.out.println("======= Questão 20 ======= ");
                    for (int i=0; i < 50; i+=5){
                        System.out.println(i + " ");
                    }
                    break;

                case 21:
                    System.out.println("======= Questão 21 ======= ");
                    System.out.println("Informe um valor: ");

                    break;

                case 22:
                    System.out.println("======= Questão 22 ======= ");
                    System.out.print("Digite um valor: ");
                    int x = sc.nextInt();
                    System.out.println("Divisores de " + x);
                    for (int i = 0; i < x; i++) {
                        if (i%x == 0){
                            System.out.println(i);
                        }
                    }
                    break;

                case 23:
                    System.out.println("======= Questão 23 ======= ");
                    for (int i = 1; i <= 200 ; i++) {
                        if (i%4 == 0){
                            System.out.println(i);
                        }
                    }
                    break;
                case 24:
                    System.out.println("======= Questão 24 ======= ");
                    for (int i = 0; i <= 10; i++) {
                        System.out.println((i*(i+1))/2);
                    }
                    break;
                case 25:
                    System.out.println("======= Questão 25 ======= ");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 26:
                    System.out.println("======= Questão 26 ======= ");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = 5; i >= 0; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 27:
                    System.out.println("======= Questão 27 ======= ");
                    int vetor[] = new int[10];
                    int soma = 0;
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Digite um numero: ");
                        vetor[i] = sc.nextInt();
                    }
                    for (int i = 0; i < 10; i++) {
                        soma += vetor[i];
                    }
                    System.out.println("A soma dos valores digitados: " + soma);
                    break;
                case 28:
                    System.out.println("======= Questão 28 ======= ");
                    int vetorMedia[] = new int[10];
                    int somaMedia = 0;
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Digite um numero: ");
                        vetorMedia[i] = sc.nextInt();
                    }
                    for (int i = 0; i < 10; i++) {
                        somaMedia += vetorMedia[i];
                    }
                    System.out.println("A media dos valores digitados : " + (somaMedia/10));

                    break;
                case 29:
                    System.out.println("======= Questão 29 ======= ");
                    int vetorOrdenar[] = new int[5];
                    int menor, idMin = 0;
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Digite um numero: ");
                        vetorOrdenar[i] = sc.nextInt();
                    }

                    for (int i = 0; i < vetorOrdenar.length - 1; i++) {
                        menor = vetorOrdenar[i];
                        for (int j = i+1; j < vetorOrdenar.length ; j++) {
                            if (vetorOrdenar[j] < menor) {
                                menor = vetorOrdenar[j];
                                idMin = j;
                            }
                        }
                        vetorOrdenar[idMin] = vetorOrdenar[i];
                        vetorOrdenar[i] = menor;
                    }
                    System.out.println("Ordenado: ");
                    for (int i = 0; i < 5; i++) {
                        System.out.print(vetorOrdenar[i] + " ");
                    }

                    break;
                case 30:
                    System.out.println("======= Questão 30 ======= ");
                    int vetorPI[] = new int[5];
                    int par = 0;
                    int impar = 0;
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Digite um numero: ");
                        vetorPI[i] = sc.nextInt();
                    }
                    for (int i = 0; i < 5; i++) {
                        if (vetorPI[i] % 2 == 0){
                            par++;
                        }else{
                            impar++;
                        }
                    }

                    System.out.println("Pares: " + par + "\nImpar: " + impar);
                    break;

                default:
                    System.out.println("Valor inválido!\n");
                    break;
            }
        }
        sc.close();
    }
}