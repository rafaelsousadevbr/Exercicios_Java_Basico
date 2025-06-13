import java.util.Scanner;

public class Exer02_AreaDoQuadrado {
    /**
     * Este programa calcula a área de um quadrado.
     * O usuário deve informar o tamanho do lado do quadrado.
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }
}