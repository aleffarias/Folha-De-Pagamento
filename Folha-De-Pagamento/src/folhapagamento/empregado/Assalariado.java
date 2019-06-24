package folhapagamento.empregado;

import java.util.Scanner;

public class Assalariado extends Empregado {
	
	// Construtor 
	public Assalariado(int numeroEmpregado, String nome, String endereco, int tipo, int metodoPagamento,
			int sindicato) {
		super(numeroEmpregado, nome, endereco, tipo, metodoPagamento, sindicato);
	}

	Scanner input = new Scanner(System.in);
	
	// Agenda Padrão
	private String agenda = "mensal";
	private int dia = 30;
	
	
	// Salário
	private double salario;
	
	@Override
	public void salario() {
		System.out.print("\nInforme o salário fixo mensal:\nExemplo: 1500 - 3000.56\nR$ ");
		double aux = input.nextDouble();
		setSalario(aux);
		
	}
	
	//======================================= Get/Set =================================================
	
	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
