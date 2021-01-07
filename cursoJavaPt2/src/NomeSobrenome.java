import java.util.Scanner;

public class NomeSobrenome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o sobrenome: ");
        String sobreNome = scanner.nextLine();

        System.out.println(nome + " " + sobreNome);
    }
}
