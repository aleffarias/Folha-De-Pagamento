package folhapagamento.empregado;

import java.util.Scanner;

public class Horista extends Empregado {
	
	Scanner input = new Scanner(System.in);
	
	// Construtor 
	public Horista(int numeroEmpregado, String nome, String endereco, int tipo, int metodoPagamento, int sindicato) {
		super(numeroEmpregado, nome, endereco, tipo, metodoPagamento, sindicato);
	}
	
	private int hora = 0;
	private int horaExtra = 0;
	
	// Agenda Padrão
	private String agenda = "mensal";
	private int dia = 30;

	// Salário
	private double salarioHorista = 0;
	private double salarioHora = 0;
	
	@Override
	public void salario() {
		System.out.print("\nInforme o salário por hora trabalhada:\nExemplo: 1.5 - 3\nR$ ");
		double salarioTemp = input.nextDouble();
		
		this.salarioHora = salarioTemp;
		
	}
	
	public void cartaoPonto() {
		System.out.println("\n**  	LANÇAR CARTÃO DE PONTO  	**\n");		
		
		System.out.println("\nHorário Entrada:\nDigite sem ':' Exemplo: 0703(07:03) - 1256(12:56)");
		int cartaoPontoE = input.nextInt();
		
		System.out.println("\nHorário Saída:\nDigite sem ':' Exemplo: 0703(07:03) - 1256(12:56)");
		int cartaoPontoS = input.nextInt();
		
		// Calcula o salário
		this.salarioHorista = salarioHorista + (salarioHorista(salarioHora, cartaoPontoE, cartaoPontoS));
		
		System.out.println("\nCartão de Ponto registrado com sucesso!\n");		
	}
	
	public static double salarioHorista(double salarioHora, int entrada, int saida) {
		double salario;
		
		int horaTrabalhada = saida - entrada;
		float minutos = horaTrabalhada % 100;
		
		if (horaTrabalhada <= 800) {
		
			if (minutos < 10) {
				minutos = minutos / 10;
			} else {
				minutos = minutos / 100;
			}
			
			salario = ((horaTrabalhada / 100) * salarioHora) + (minutos * salarioHora);
		} else {
			int horaExtra = horaTrabalhada - 800;
			
			if (minutos < 10) {
				minutos = minutos / 10;
			} else {
				minutos = minutos / 100;
			}
			
			salario = (8 * salarioHora + ((horaExtra / 100) * (salarioHora * 1.5)) + (minutos * (horaExtra * 1.5)));
			
		}
		
		return salario;
	}
	
	//======================================= Get/Set =================================================
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(int horaExtra) {
		this.horaExtra = horaExtra;
	}

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

	public double getSalarioHorista() {
		return salarioHorista;
	}

}
