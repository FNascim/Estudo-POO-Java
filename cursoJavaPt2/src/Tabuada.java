import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        Integer num = scanner.nextInt();
        tabuada(num, 0);

    }

    static void tabuada(Integer num, Integer i)
    {
        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}
