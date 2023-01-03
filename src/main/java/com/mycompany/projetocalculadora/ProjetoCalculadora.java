package com.mycompany.projetocalculadora;

import java.util.Scanner;

public class ProjetoCalculadora {

    private static int opcao = 0;

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        Calcular valor1 = new Calcular();
        Calcular valor2 = new Calcular();
        Calcular result = new Calcular();

        while (opcao != 0) {
            System.out.println("--------Calculadora--------");
            System.out.println("\nDigite a opção desejada:");
            System.out.println("0 - Sair");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência\n");
            opcao = scan.nextInt();

            switch (opcao) {
                case 0:
                    if (opcao == 0) {
                        System.out.println("Saiu do programa");
                        return;
                    }

                case 1:
                    System.out.println("Digite o primeiro valor: ");
                    valor1.setNumero1(scan.nextInt());
                    System.out.println("Digite o segundo valor: ");
                    valor2.setNumero2(scan.nextInt());
                    result.soma(valor1.getNumero1(), valor2.getNumero2());
                    break;

                case 2:
                    System.out.println("Digite o primeiro valor: ");
                    valor1.setNumero1(scan.nextInt());
                    System.out.println("Digite o segundo valor: ");
                    valor2.setNumero2(scan.nextInt());
                    result.subtracao(valor1.getNumero1(), valor2.getNumero2());
                    break;

                case 3:
                    System.out.println("Digite o primeiro valor: ");
                    valor1.setNumero1(scan.nextInt());
                    System.out.println("Digite o segundo valor: ");
                    valor2.setNumero2(scan.nextInt());
                    result.multiplicacao(valor1.getNumero1(), valor2.getNumero2());
                    break;

                case 4:
                    System.out.println("Digite o primeiro valor: ");
                    valor1.setNumero1(scan.nextInt());
                    System.out.println("Digite o segundo valor: ");
                    valor2.setNumero2(scan.nextInt());
                    result.divisao(valor1.getNumero1(), valor2.getNumero2());
                    break;

                case 5:
                    System.out.println("Digite o valor: ");
                    valor1.setNumero1(scan.nextInt());
                    result.quadrado(valor1.getNumero1());
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
                    break;
            }
        }
    }
}
