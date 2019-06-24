package folhapagamento.empregado;

import java.util.Scanner;

public class Comissionado extends Empregado {
	
	Scanner input = new Scanner(System.in);
	
	// Construtor 
	public Comissionado(int numeroEmpregado, String nome, String endereco, int tipo, int metodoPagamento,
			int sindicato) {
		super(numeroEmpregado, nome, endereco, tipo, metodoPagamento, sindicato);
	}
	
	// Agenda Padrão
	private String agenda = "bi-semanal";
	private int frequencia = 2;
	
	// Salário
	private double salario;

	@Override
	public void salario() {
		System.out.print("\nInforme o salário:\nExemplo: 1500 - 3000.56\nR$ ");
		double salarioTemp = input.nextDouble();
		
		System.out.println("\nInforme o percentual de comissão:\nExemplo: 1.5 - 0.6");
		double comissao = input.nextDouble();
		
		
		
		
	}	
	
}
