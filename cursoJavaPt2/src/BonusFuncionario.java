import java.util.Scanner;

public class BonusFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a meta de faturamento: ");
        Double meta = scanner.nextDouble();

        System.out.print("Digite o faturamento real no ultimo ano: ");
        Double faturamento = scanner.nextDouble();

        System.out.print("Digite a media salarial do funcionario: ");
        Double mediaSalarial = scanner.nextDouble();
        Double bonus = 0.0;
        if (faturamento >= meta)
        {
            bonus = mediaSalarial;
            System.out.println("O bonus é de : R$"+bonus);
        }
        else  if (faturamento >= meta *0.8)
        {
            bonus = mediaSalarial * 0.8;
            System.out.println("O bonus é de : R$"+bonus);
        }
        else
        {
            System.out.println("Não tem bonus");
        }
        scanner.close();
    }
}
