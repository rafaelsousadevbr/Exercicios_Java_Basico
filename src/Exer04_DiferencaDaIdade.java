import java.util.Scanner;

public class Exer04_DiferencaDaIdade {
    /**
     * Este programa calcula a diferença de idade entre duas pessoas.
     * O usuário deve informar o nome e o ano de nascimento de cada pessoa.
     * A diferença de idade é calculada como o valor absoluto da diferença entre as idades.
     */    
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();
        System.out.println("Digite o ano de nascimento da primeira pessoa: ");
        int anoNascimento1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();
        System.out.println("Digite o ano de nascimento da segunda pessoa: ");
        int anoNascimento2 = scanner.nextInt();

        int idade1 = java.time.Year.now().getValue() - anoNascimento1;
        int idade2 = java.time.Year.now().getValue() - anoNascimento2;

        int diferencaIdade = Math.abs(idade1 - idade2);

        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferencaIdade + " anos.");

        scanner.close();
    }
}