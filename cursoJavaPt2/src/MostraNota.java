import java.util.Scanner;

public class MostraNota {
    static final Integer NOTA_MINIMA = 7;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite nota 1: ");
        Double n1 = scanner.nextDouble();
        System.out.print("Digite nota 2: ");
        Double n2 = scanner.nextDouble();
        System.out.print("Digite nota 3: ");
        Double n3 = scanner.nextDouble();

        Double nota = (n1 + n2 + n3)/3;

        Boolean passouDeAno = nota >= NOTA_MINIMA;

        if (passouDeAno)
        {
            System.out.println("Aprovado! A nota foi: " + nota);
        }
        else
        {
            System.out.println("Reprovado! A nota foi: " + nota);
        }

    }
}
