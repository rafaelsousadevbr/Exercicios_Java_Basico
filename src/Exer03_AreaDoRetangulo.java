import java.util.Scanner;

public class Exer03_AreaDoRetangulo {
    /**
     * Este programa calcula a área de um retângulo.
     * O usuário deve informar a base e a altura do retângulo.
     * A área é calculada como base * altura.
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}
