import java.util.Scanner;

public class Calculadora {

    public static float entradaDeDados(){
        Scanner input = new Scanner(System.in);
        System.out.println("digite o número: ");
        float n = input.nextInt();
        return n;
    }

    public static int menu(){
        System.out.println("----MENU-----");
        System.out.println("1.adição");
        System.out.println("2.subtração");
        System.out.println("3.multiplicação");
        System.out.println("4.divisão");
        Scanner input = new Scanner(System.in);
        System.out.println("\nopção: ");
        int op = input.nextInt();
        return op;
    }

    public static float adicao(float n1, float n2){
        System.out.println("\n----ADIÇÃO----");
        return n1 + n2;
    }

    public static float subtracao(float n1, float n2){
        System.out.println("\n----SUBTRAÇÃO----");
        return n1 - n2;
    }

    public static float multiplicacao(float n1, float n2){
        System.out.println("\n----MULTIPLOCAÇÃO----");
        return n1 * n2;
    }

    public static float divisao(float n1, float n2){
        System.out.println("\n----DIVISÃO----");
        return n1 / n2;
    }

    public static void imprimir(float resultado){
        System.out.println("----IMPRIMIR----");
        System.out.println("Resultado: " + resultado);
    }

    public static float controlador(float n1, float n2, int op){
        System.out.println("----CONTROLADOR----");
        float resultado = 0;
        switch (op){
            case 1:
                resultado = adicao(n1, n2);
                break;
            case 2:
                resultado = subtracao(n1, n2);
                break;
            case 3:
                resultado = divisao(n1, n2);
            case 4:
                resultado = multiplicacao(n1, n2);
        }
        return resultado;
    }

    public static void main(String[] args) {
        int op = menu();
        float n1 = entradaDeDados();
        float n2 = entradaDeDados();
        float resultado = controlador(n1, n2, op);
        imprimir(resultado);

    }
}
