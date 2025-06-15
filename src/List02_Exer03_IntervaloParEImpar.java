import java.util.Scanner;

/**
 * Este programa exibe números pares ou ímpares em um intervalo definido pelo usuário.
 */

public class List02_Exer03_IntervaloParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercício 3: Números em um intervalo (pares ou ímpares)");
        System.out.println("Digite dois números inteiros, onde o segundo é maior que o primeiro, e escolha entre pares ou ímpares.");
        System.out.print("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int segundo = scanner.nextInt();

        while (segundo <= primeiro) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
            System.out.print("Digite o segundo número (maior que o primeiro): ");
            segundo = scanner.nextInt();
        }

        System.out.println("Digite 1 para ímpares ou 2 para pares: ");
        int opcao = scanner.nextInt();

        System.out.println("Números no intervalo em ordem decrescente:");
        for (int i = segundo; i >= primeiro; i--) {
            if (opcao == 1 && i % 2 == 0) {
                System.out.println(i);
            } else if (opcao == 2 && i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}