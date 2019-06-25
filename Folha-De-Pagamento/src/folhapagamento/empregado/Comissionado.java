package folhapagamento.empregado;

import java.util.Scanner;

public class Comissionado extends Empregado {
	
	Scanner input = new Scanner(System.in);
	
	// Construtor 
	public Comissionado(int numeroEmpregado, String nome, String endereco, int tipo, int metodoPagamento,
			int sindicato) {
		super(numeroEmpregado, nome, endereco, tipo, metodoPagamento, sindicato);
	}
	
	double valorVenda;
	
	// Agenda Padrão
	private String agenda = "bi-semanal";
	private int frequencia = 2;
	
	// Salário
	private double salarioComissionado;

	@Override
	public void salario() {
		System.out.print("\nInforme o salário:\nExemplo: 1500 - 3000.56\nR$ ");
		double salarioTemp = input.nextDouble();
		
		System.out.println("\nInforme o percentual de comissão:\nExemplo: 15 para 15% 1.5 para 1.5%");
		double comissao = input.nextDouble();
		
		this.salarioComissionado = salarioTemp + ((valorVenda * comissao)/100);
		
	}
	
	public void resultadoVenda() {
		
	}
	
	//======================================= Get/Set =================================================
	
	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	public double getSalarioComissionado() {
		return salarioComissionado;
	}
	
}
