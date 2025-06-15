import java.util.Scanner;
/**
 * Este programa exibe a tabuada de um número informado pelo usuário.
 * O usuário deve informar um número inteiro, e o programa calcula e exibe
 * a multiplicação desse número por valores de 1 a 10.
 */

public class List02_Exer01_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
