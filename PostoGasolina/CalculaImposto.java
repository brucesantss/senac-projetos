package prova1;

import java.util.Scanner;

public class CalculaImposto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salarioAtual;
        double salarioImposto;

        System.out.println("----calcular sálario + imposto (IR)---\n");
        int opcao;

        do {
            System.out.println("\n---menu---\n");

            System.out.println("1.Calcular Imposto (IR)");

            opcao = input.nextInt();

            System.out.println("digite o salário atual:");
            salarioAtual = input.nextDouble();

            if (opcao == 1) {
                if (salarioAtual <= 1903.98) {
                    System.out.println("\nsalário atual: " + salarioAtual);
                } else if (salarioAtual >= 1903.99 && salarioAtual <= 2826.65) {
                    salarioImposto = salarioAtual - (salarioAtual * 0.075);
                    System.out.println("\nsalário liquído: " + salarioAtual);
                    System.out.println("salário total com desconto de 7,5%: " + salarioImposto);
                } else if (salarioAtual >= 2826.66 && salarioAtual <= 3751.05) {
                    salarioImposto = salarioAtual - (salarioAtual * 0.15);
                    System.out.println("\nsalário liquído: " + salarioAtual);
                    System.out.println("salário total com desconto de 15%: " + salarioImposto);
                } else if (salarioAtual >= 3751.06 && salarioAtual <= 4664.68) {
                    salarioImposto = salarioAtual - (salarioAtual * 0.225);
                    System.out.println("\nsalário liquído: " + salarioAtual);
                    System.out.println("salário total com desconto de 22,5%: " + salarioImposto);
                } else {
                    salarioImposto = salarioAtual - (salarioAtual * 0.275);
                    System.out.println("\nsalário liquído: " + salarioAtual);
                    System.out.println("salário total com desconto de 27,5%: " + salarioImposto);
                }

            }else if(opcao > 2){
                System.out.println("Opção inválida!");
            }

        } while (opcao == 1);

    }

}
