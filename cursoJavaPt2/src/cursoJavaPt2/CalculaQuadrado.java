package cursoJavaPt2;

import java.util.Scanner;

public class CalculaQuadrado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero: ");
		Integer peso = scanner.nextInt();
		
		Integer quadrado = peso * peso;
		
		System.out.println("O quadrado do numero é: " + quadrado);
		
		scanner.close();
	}

}
