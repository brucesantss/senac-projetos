package prova1;

import java.util.Scanner;

public class PostoGasolina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double valorTotal;
        double valorGasolina = 4.79;
        double valorEtanol = 3.65;
        double litros;
        
        System.out.println("----bem-vindo ao posto de gasolina----");
        
        System.out.println("\ndeseja abastecer: ");
        System.out.println("1.gasolina");
        System.out.println("2.etanol");
        
        System.out.println("\nopção: ");
        Short opcao = input.nextShort();
        
        switch(opcao){
            case 1:
                System.out.println("\nvalor gasolina: " + valorGasolina);
                System.out.println("quantos litros: ");
                litros = input.nextDouble();
                
                if(litros <= 10){
                    valorTotal = (litros * valorGasolina) * 0.95;
                    System.out.println("valor total com 5% de desconto: " + valorTotal);
                }else{
                     valorTotal = (litros * valorGasolina) * 0.93;
                     System.out.println("valor total com 7% de desconto: " + valorTotal);
                }
                break;
            case 2:
                System.out.println("\nvalor Etanol: " + valorEtanol);
                System.out.println("quantos litros: ");
                litros = input.nextDouble();
                
                if(litros <= 5){
                    valorTotal = litros * valorEtanol;
                    System.out.println("valor total ficou: " + valorTotal);
                }else{
                     valorTotal = (litros * valorEtanol) * 0.90;
                     System.out.println("valor total com 10% de desconto: " + valorTotal);
                }
                break;
            default:
                System.out.println("escolha uma opção válida!");
          
        }
         
            
    }
}
