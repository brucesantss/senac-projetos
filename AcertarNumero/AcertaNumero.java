import java.util.Random;
import java.util.Scanner;

public class AcertaNumero {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("==== adivinhação de número ====");

        Random rnd = new Random();
        int n = rnd.nextInt(0, 100); //numero aleatorio
        int num = 0; //numero do usuario

        while(num != n){

            System.out.println("\ninsira o palpite: ");
            num = input.nextInt();

            if(num < n){
                System.out.println("para cima");
            }else if(num > n){
                System.out.println("para baixo");
            }else{
                Thread.sleep(1000);
                System.out.println("você venceu!");
                System.out.println("o número aleatório era: " + n);
            }

        }
    }
}
