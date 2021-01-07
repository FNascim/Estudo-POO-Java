import java.util.Scanner;

public class GastoFamiliar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double gastoFamiliar = 0.0;
        System.out.print("Digite o valor da conta de luz: ");
        Double luz = scanner.nextDouble();
        gastoFamiliar += luz;

        System.out.print("Digite o valor da conta de agua: ");
        Double agua = scanner.nextDouble();
        gastoFamiliar += agua;

        System.out.print("Digite o valor da conta de telefone: ");
        Double telefone = scanner.nextDouble();
        gastoFamiliar += telefone;

        System.out.print("Digite o valor da mensalidade da escola: ");
        Double escola = scanner.nextDouble();
        gastoFamiliar += escola;

        System.out.print("Digite o valor da fatura do cartão: ");
        Double cartao = scanner.nextDouble();
        gastoFamiliar += cartao;

        System.out.print("Digite o valor das compras do supermercado: ");
        Double supermercado = scanner.nextDouble();
        gastoFamiliar += supermercado;

        System.out.println("Valor do gasto familiar: " + gastoFamiliar);
        scanner.close();
    }
}
