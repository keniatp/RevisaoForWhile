package org.example;

import java.util.Scanner;
public class lacoWHILE01 {
    public static void main(String[] args) {
        int sair = 1;
        Scanner sc = new Scanner(System.in);
        while (sair == 1) {
            System.out.println("\n\n----- LAÇO WHILE ----- \nEscolha um dos exercicios abaixo \n1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 \n11 - 12 - 13 - 14 - 15 - 16 - 17 - 18 - 19 - 20" + "\nDigite 0 (zero) para sair! :\n");
            int escolha = sc.nextInt();
            sc.nextLine(); //Limpar meus scaners
            switch (escolha) {
                case 0:
                    sair = 0;
                    break;

                case 1:
                    System.out.println("======= Questão 1 ======= ");
                    int x = 0;
                    do {
                        System.out.println("Digite um valor maior que zero!");
                        x = sc.nextInt();
                    } while (x > 0);
                    break;

                case 2:
                    System.out.println("======= Questão 2 ======= ");
                    int soma = 0;
                    int valor;
                    do {
                        System.out.println("Digite um valor ou zero para terminar: ");
                        valor = sc.nextInt();
                        soma += valor;
                    } while (valor != 0);
                    System.out.println("A soma de todos os valores digitados: " + soma);
                    break;

                case 3:
                    System.out.println("======= Questão 3 ======= ");
                    int cont = 0;
                    while (cont < 10) {
                        System.out.println(cont);
                        cont++;
                    }
                    break;

                case 4:
                    System.out.println("======= Questão 4 ======= ");
                    int contRe = 10;
                    while (contRe > 0) {
                        System.out.println(contRe);
                        contRe--;
                    }
                    break;

                case 5:
                    System.out.println("======= Questão 5 ======= ");
                    System.out.println("informe um numero: ");
                    int num = sc.nextInt();
                    cont = 0;
                    System.out.println("TABUADA DO " + num);
                    while (cont <= 10) {
                        System.out.println(cont + " x " + num + " = " + (cont * num));
                        cont++;
                    }
                    break;

                case 6:
                    System.out.println("======= Questão 6 ======= ");
                    int somaTudo = 0;
                    cont = 0;
                    while (cont <= 50) {
                        somaTudo += cont;
                        cont++;
                    }
                    System.out.println("A soma de 1 a 50: " + somaTudo);
                    break;

                case 7:
                    System.out.println("======= Questão 7 ======= ");
                    cont = 0;
                    while (cont < 20) {
                        if (cont % 2 == 0) {
                            System.out.println(cont);
                        }
                        cont++;
                    }
                    break;

                case 8:
                    System.out.println("======= Questão 8 ======= ");
                    cont = 0;
                    while (cont < 20) {
                        if (cont % 2 == 1) {
                            System.out.println(cont);
                        }
                        cont++;
                    }
                    break;

                case 9:
                    System.out.println("======= Questão 9 ======= ");
                    x = 0;
                    do {
                        System.out.println("Digite um valor positivo!");
                        x = sc.nextInt();
                    } while (x > 0);
                    break;

                case 10:
                    System.out.println("======= Questão 10 ======= ");
                    valor = 0;
                    int quantidade = 0;
                    while (valor != 0) {
                        System.out.println("Digite um valor ou zero para terminar");
                        valor = sc.nextInt();
                        quantidade++;
                    }
                    System.out.println("Foram digitados " + quantidade + " numeros");
                    break;

                case 11:
                    System.out.println("======= Questão 11 ======= ");
                    System.out.println("Digite uma palavra: ");
                    String palavra = sc.nextLine();
                    cont = 0;
                    while (cont < palavra.length()) {
                        System.out.println(palavra.charAt(cont));
                        cont++;
                    }
                    break;

                case 12:
                    System.out.println("======= Questão 12 ======= ");
                    System.out.println("Digite uma palavra: ");
                    String palavraRe = sc.nextLine();
                    cont = palavraRe.length() - 1;
                    while (cont >= 0) {
                        System.out.println(palavraRe.charAt(cont));
                        cont--;
                    }
                    break;
                case 13:
                    System.out.println("======= Questão 13 ======= ");
                    soma = 0;
                    valor = 1;
                    while (valor != 0){
                        System.out.println("Digite um valor ou zero para terminar: ");
                        valor = sc.nextInt();
                        soma += valor;
                    }
                    System.out.println("A soma de todos os valores digitados: " + soma);

                    break;
                case 14:
                    System.out.println("======= Questão 14 ======= ");
                    System.out.println("Informe uma valor: ");
                    valor = sc.nextInt();
                    cont = 0;
                    while (cont <= valor){
                        if (cont % valor == 0){
                            System.out.println(cont);
                        }
                        cont++;
                    }
                    break;
                case 15:
                    System.out.println("======= Questão 15 ======= ");
                    System.out.println("Digite um valor: ");
                    int fim = sc.nextInt();
                    cont = 1;
                    int fibo = 1;
                    int ant = 0;
                    while (fibo <= fim){
                        if (cont == 1) {
                            fibo = 1;
                            ant = 0;
                        } else {
                            fibo += ant;
                            ant = fibo - ant;
                        }
                        System.out.println(fibo + " ");
                        cont++;
                    }
                    break;

                case 16:
                    System.out.println("======= Questão 16 ======= ");
                    System.out.println("Informe uma valor: ");
                    valor = sc.nextInt();
                    cont = 0;
                    int multiplo = 1;
                    while (cont <= 10){
                        if (valor%multiplo == 0){
                            System.out.println(multiplo);
                        }
                        cont++;
                        multiplo++;
                    }
                    break;
                case 17:
                    System.out.println("======= Questão 17 ======= ");
                    System.out.println("Digite um valor: ");
                    valor = sc.nextInt();
                    int i = 2;
                    while (i < valor){
                        boolean primo = true;
                        int j = 2;
                        while (j < i){
                            if (i%j == 0){
                                primo = false;
                                j = i;
                            }
                            j++;
                        }

                        if (primo){
                            System.out.println(i);
                        }
                        i++;
                    }
                    break;
                case 18:
                    System.out.println("======= Questão 18 ======= ");
                    valor = 1;
                    while (valor != 0){
                        System.out.println("Digite um valor: (zero para sair)");
                        valor = sc.nextInt();
                        if (valor %2 == 0){
                            System.out.println("Par");
                        }else{
                            System.out.println("Impar");
                        }
                    }
                    break;
                case 19:
                    System.out.println("======= Questão 19 ======= ");
                    int senha[] = new int[6];
                    cont = 0;
                    while (cont < senha.length){
                        System.out.println("Digite o " + (cont+1) + " numero: ");
                        senha[cont] = sc.nextInt();
                        cont++;
                    }
                    cont = 0;
                    System.out.print("Senha: ");
                    while (cont < senha.length){
                        System.out.print(senha[cont]);
                        cont++;
                    }
                    break;
                case 20:
                    System.out.println("======= Questão 20 ======= ");
                    int senhaCorreta = 12345;
                    System.out.println("Digite a senha: ");
                    int senhaTentativa = sc.nextInt();

                    while (senhaCorreta != senhaTentativa){
                        System.out.println("Senha incorreta tente novamente!");
                        senhaTentativa = sc.nextInt();
                    }
                    System.out.println("Correta");

                    break;

                default:
                    System.out.println("Valor inválido!\n");
                    break;
            }
        }
        sc.close();
    }
}