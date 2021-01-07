import java.util.Scanner;

public class Aposentadoria {
    static final Integer IDADE_MINIMA = 55;
    static final  Integer TEMPO_MINIMO = 25;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite idade: ");
        Integer idade = scanner.nextInt();

        System.out.print("Digite o tempo de contribuição: ");
        Integer tempoDeContribuicao = scanner.nextInt();

        Boolean idadeMinima = idade >= IDADE_MINIMA;
        Boolean tempoMinimo = tempoDeContribuicao >= TEMPO_MINIMO;

        if (idadeMinima && tempoMinimo)
        {
            System.out.println("Pode aposentar");
        }
        else
        {
            System.out.println("Não pode aposentar");
        }
        scanner.close();
    }
}
