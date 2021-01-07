import java.util.Scanner;

public class DescontoFrete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double preco = scanner.nextDouble();

        Double frete = 0.0;
        if (preco < 100.0)
            {
                frete = 15.0;
            }
        Double total = preco + frete;
        System.out.println("Valor total: " + total);
        scanner.close();
    }
}
