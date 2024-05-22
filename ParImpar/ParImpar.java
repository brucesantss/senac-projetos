import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.println("\ndigite um número (sair digite 0000):");
            num = sc.nextInt();

            if(num == 0000){
                break;
            }

            int resultado = encontrarParImpar(num);
            if (resultado == 0) {
                System.out.println("\nO número " + num + ", é par.");
            } else {
                System.out.println("\nO número " + num + ", é impar.");
            }


        } while (num != 0000);
    }


    public static int encontrarParImpar(int num) {
        if (num % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
