import java.util.Scanner;

public class Exer01_IdadeDoUsuario {
    /**
     * Este programa solicita o nome e o ano de nascimento do usuário,
     * calcula a idade com base no ano atual e exibe uma mensagem personalizada.
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite seu ano de nascimento:");
        int anoNascimento = scanner.nextInt();

        int anoAtual = java.time.Year.now().getValue();
        int idade = anoAtual - anoNascimento;
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        scanner.close();
    }
}
