import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        Double n1 = scanner.nextDouble();

        System.out.print("Escolha a operação: 1- adição, 2- subtração, 3- multiplicação, 4- divisão: ");
        Integer op = scanner.nextInt();

        System.out.print("Digite o outro numero: ");
        Double n2 = scanner.nextDouble();

        Double resultado;
        if (op == 1)
        {
            resultado = n1 + n2;
        }
        else if (op == 2)
        {
            resultado = n1 - n2;
        }
        else if (op == 3)
        {
            resultado = n1 * n2;
        }
        else
        {
            resultado = n1 / n2;
        }

        System.out.println("O Resultado é: " + resultado);
        scanner.close();
    }
}
