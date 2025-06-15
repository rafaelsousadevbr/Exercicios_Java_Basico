import java.util.Scanner;

/**
 * Este programa solicita um número inicial e, em seguida, solicita números
 * sucessivos ao usuário. Se o número for menor que o inicial, ele é ignorado.
 * Se o número for divisível pelo inicial, o programa continua solicitando mais
 * números. Se não for divisível, o programa encerra a execução.
 */

public class List02_Exer04_DivisaoComResto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercício 4: Divisão com Resto");
        System.out.print("Informe o número inicial: ");
        int numeroInicial = scanner.nextInt();

        while (true) {
            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();

            if (numero < numeroInicial) {
                System.out.println("Número ignorado (menor que o inicial).");
                continue;
            }

            if (numero % numeroInicial != 0) {
                System.out.println("Execução encerrada. " + numero + " dividido por " + numeroInicial
                        + " tem resto diferente de 0.");
                break;
            } else {
                System.out.println(numero + " é divisível por " + numeroInicial + ".");
            }
        }

        scanner.close();
    }
}
