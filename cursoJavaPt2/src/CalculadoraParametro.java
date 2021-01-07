import java.util.Scanner;

public class CalculadoraParametro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        Double n1 = scanner.nextDouble();

        System.out.print("Escolha a operação: 1- adição, 2- subtração, 3- multiplicação, 4- divisão: ");
        Integer op = scanner.nextInt();

        System.out.print("Digite o outro numero: ");
        Double n2 = scanner.nextDouble();

        Double resultado = calcula(op, n1, n2);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
    static Double calcula(Integer op, Double n1, Double n2)
    {
        Double resultado = null;
        switch (op)
        {
            case 1 :
                resultado = soma(n1,n2);
                break;
            case 2 :
                resultado = subtracao(n1, n2);
                break;
            case 3 :
                resultado = multiplicacao(n1, n2);
                break;
            case 4 :
                resultado = divisao(n1, n2);
                break;
            default:
                System.err.println("Escolha uma operação válida!");
                System.exit(0);
        }
        return resultado;
    }
    static Double soma(Double n1, Double n2)
    {
        return  n1 + n2;
    }
    static Double subtracao(Double n1, Double n2)
    {
        return n1 - n2;
    }
    static Double multiplicacao(Double n1, Double n2)
    {
        return n1 * n2;
    }
    static Double divisao(Double n1, Double n2)
    {
        return n1 / n2;
    }
}
