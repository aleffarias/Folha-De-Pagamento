package folhapagamento.empregado;

import java.util.Scanner;

public class Comissionado extends Empregado {
	
	private static Scanner input;
	
	// Agenda Padrão
	String agenda = "mensal";
	int dia = 30;
	
	public double salario() {
		
		System.out.println("Digite o salário mensal:");
		double salario = input.nextDouble();
		
		return salario;
	}
}
