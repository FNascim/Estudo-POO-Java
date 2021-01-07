import java.util.Scanner;

public class VerificaNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota de Portugues: ");
        Integer notaPortugues = scanner.nextInt();

        System.out.print("Digite a nota de Matematica: ");
        Integer notaMatematica = scanner.nextInt();

        if (notaMatematica < 60 || notaPortugues < 60 || notaPortugues + notaMatematica < 150)
        {
            System.out.println("Reprovado!");
        }
        else
        {
            System.out.println("Aprovado");
        }
        scanner.close();
    }
}
