import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero referente a um dia da semana(1-domingo,...,7-sabado): ");
        Integer dia = scanner.nextInt();

        switch (dia)
        {
            case 1 : System.out.println("Domingo");
            break;
            case 2 : System.out.println("Segunda-feira");
            break;
            case 3 : System.out.println("Terça-feira");
            break;
            case 4 : System.out.println("Quarta-feira");
            break;
            case 5 : System.out.println("Quinta-feira");
            break;
            case 6 : System.out.println("Sexta-feira");
            break;
            case 7 : System.out.println("Sabado");
        }
        scanner.close();
    }
}
