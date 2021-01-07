import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor do produto: ");
        Double valor = scanner.nextDouble();

        System.out.print("Quantidade: ");
        Double qtd = scanner.nextDouble();

        Boolean qtdDesc = qtd >= 10;
        Double porcenDesc = 0.0;

        if (qtdDesc)
        {
             porcenDesc= 0.1;
        }
        Double desconto = (valor * qtd) * porcenDesc;
        Double total = (valor * qtd) - desconto;

        System.out.println("Total = " + total);
        scanner.close();
    }
}
