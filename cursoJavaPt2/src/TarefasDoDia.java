import java.util.Scanner;

public class TarefasDoDia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tarefas[] = new String[5];
        for (int i = 0; i < tarefas.length; i++)
        {
            System.out.print("Digite a tarefa: ");
            tarefas[i] = scanner.nextLine();
        }

        for (int i = 0; i < tarefas.length; i++)
        {
            System.out.println("Tarefa: " + tarefas[i]);
        }
        scanner.close();
    }
}
