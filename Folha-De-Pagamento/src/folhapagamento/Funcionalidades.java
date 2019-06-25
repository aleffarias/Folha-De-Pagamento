package folhapagamento;

import java.util.ArrayList;
import java.util.Scanner;

import folhapagamento.empregado.Assalariado;
import folhapagamento.empregado.Comissionado;
import folhapagamento.empregado.Empregado;
import folhapagamento.empregado.Horista;

public class Funcionalidades {
	  static Scanner input = new Scanner(System.in);
	  
	  private static int numEmpregado = 01;
	  
	  static ArrayList<Empregado> listaEmpregados = new ArrayList<Empregado>();
	  
	  public static void addEmpregado() {
		  System.out.println("\n**  ADICIONAR EMPREGADO  **\n");
		  
		  System.out.println("Digite o nome do empregado:");
		  String nome = input.nextLine();
		  
		  System.out.println("\nDigite o endereço do empregado:");
		  String endereco = input.nextLine();
		  
		  System.out.println("\nMétodo de pagamento:\n(1) - Cheque pelos correios\n(2) - Cheque em mãos\n(3) - Depósito em conta bancária");
		  int metodoPagamento = input.nextInt();
		  input.nextLine();
		  
		  System.out.println("\nPertence ao sindicato?\n(1) - Sim\n(0) - Não");
		  int isSindicato = input.nextInt();
		  input.nextLine();
		  
		  if (isSindicato == 1) {
			  System.out.print("Digite o valor da taxa sindical:\nR$ ");
			  double taxaSidicato = input.nextDouble();
			  input.nextLine();
		  }
		  
		  System.out.println("\nEscolha o tipo do empregado:\n(1) - Horista\n(2) - Assalariado\n(3) - Comissionado");
		  int tipo = input.nextInt();
		  input.nextLine();
		  
		  if (tipo == 1) {
			  Horista horista = new Horista(numEmpregado, nome, endereco, metodoPagamento, isSindicato, tipo);
			 			  
			  horista.salario();
			  
			  listaEmpregados.add(horista);
			  
		  } else if (tipo == 2) {
			  Assalariado assalariado = new Assalariado(numEmpregado, nome, endereco, metodoPagamento, isSindicato, tipo);
			  
			  assalariado.salario();
			  
			  listaEmpregados.add(assalariado);
			  
		  } else if (tipo == 3) {
			  Comissionado comissionado = new Comissionado(numEmpregado, nome, endereco, metodoPagamento, isSindicato, tipo);
			  
			  comissionado.salario();
			  
			  listaEmpregados.add(comissionado);
			  
		  } else {
			  System.out.println("\nErro: Opção Inválida.\\n");
		  }	
		  
		 System.out.println("\nEmpregado cadastrado com sucesso!\n");
		 numEmpregado++;
		
	  }
	  
	// Teste
	 public static void teste() {
		  Horista horista = (Horista) listaEmpregados.get(0);
		  System.out.println(horista.getSalarioHorista());
		  
		  }
	  
	 public static void removerEmpregado() {
		  System.out.println("\n\t**  	REMOVER FUNCIONÁRIO  	**\n");
		  
		  System.out.println("Digite o número do Empregado:\n");
		  int nEmpTemp = input.nextInt();
		  input.nextLine();
		  
		  System.out.println("\nRemovendo empregado...");
		  
		  for (int i=0; i < listaEmpregados.size(); i++) {
				if (listaEmpregados.get(i).getNumeroEmpregado() == nEmpTemp) {
					listaEmpregados.remove(i);
					
					System.out.println("\nEmpregado removido com sucesso!\n");	
					return;
				}
			} 
		  
		  System.out.println("\nErro: Empregado não encontrado.\n");	
	  }
	 
	 public static void lancarCartaoPonto() {
		 System.out.println("\n**  	LANÇAR CARTÃO DE PONTO  	**\n");	
		 System.out.println("Digite o número do Empregado:");
		 int nEmpTemp = input.nextInt();
		 input.nextLine();
		 
		 for (int i=0; i < listaEmpregados.size(); i++) {
			 if (listaEmpregados.get(i).getNumeroEmpregado() == nEmpTemp) {		// Procura o empregado solicitado
				 if (listaEmpregados.get(i) instanceof Horista) {				// Verifica se é horista
					 Horista horista = (Horista) listaEmpregados.get(i);
					 
					 horista.cartaoPonto();
					 
				 } else {
					 System.out.println("\nErro: Empregado não é horista.\n");
				 }
			 }
		 }
		 
		 teste();
	 }
	 
	 public static void lancarResultadoVenda() {
		 System.out.println("\n**  	LANÇAR RESULTADO DE VENDA  		**\n");
		 System.out.println("Digite o número do Empregado:");
		 int nEmpTemp = input.nextInt();
		 input.nextLine();
		 
		 for (int i=0; i < listaEmpregados.size(); i++) {
			 if (listaEmpregados.get(i).getNumeroEmpregado() == nEmpTemp) {			// Procura o empregado solicitado
				 if (listaEmpregados.get(i) instanceof Comissionado) {				// Verifica se é comissionado
					 Comissionado comissionado = (Comissionado) listaEmpregados.get(i);
					 
					 comissionado.resultadoVenda();
					 
				 } else {
					 System.out.println("\nErro: Empregado não é comissionado.\n");
				 }
			 }
		 }
	
	 }
	 
	 public static void lancarTaxaServico() {
		System.out.println("\n**  	LANÇAR TAXA DE SERVIÇO  	**\n");
		System.out.println("Digite o número do Empregado:");
		int nEmpTemp = input.nextInt();
		input.nextLine();
		
		for (int i=0; i < listaEmpregados.size(); i++) {
			 if (listaEmpregados.get(i).getNumeroEmpregado() == nEmpTemp) {			// Procura o empregado solicitado
				 if (listaEmpregados.get(i).getIsSindicato() == 1) {				// Verifica se pertence ao sindicato
							 
					 
				 } else {
					 System.out.println("\nErro: Empregado não pertence ao sindicato.\n");
				 }
			 }
		 }
	}
}
