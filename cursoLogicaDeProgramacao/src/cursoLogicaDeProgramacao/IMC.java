package cursoLogicaDeProgramacao;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite a altura: ");
		Double altura = scanner.nextDouble();
		
		Double resultado = peso / (altura * altura);
		
		System.out.println("IMC: " + resultado);
		
		scanner.close();
	}
}
