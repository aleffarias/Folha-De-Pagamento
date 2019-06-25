package folhapagamento;

import java.util.ArrayList;
import java.util.Scanner;

import folhapagamento.empregado.Assalariado;
import folhapagamento.empregado.Comissionado;
import folhapagamento.empregado.Empregado;
import folhapagamento.empregado.Horista;

public class Funcionalidades {
	  static Scanner input = new Scanner(System.in);
	  
	  static int numEmpregado = 01;
	  
	  static ArrayList<Empregado> todosEmpregados = new ArrayList<Empregado>();
	  
	  public static void addEmpregado() {
		  System.out.println("\n**  ADICIONAR EMPREGADO  **\n");
		  
		  System.out.println("Digite o nome do empregado:");
		  String nome = input.nextLine();
		  input.nextLine();
		  
		  System.out.println("\nDigite o endereço do empregado:");
		  String endereco = input.nextLine();
		  input.nextLine();
		  
		  System.out.println("\nMétodo de pagamento:\n(1) - Cheque pelos correios\n(2) - Cheque em mãos\n(3) - Depósito em conta bancária");
		  int metodoPagamento = input.nextInt();
		  input.nextLine();
		  
		  System.out.println("\nPertence ao sindicato?\n(1) - Sim\n(0) - Não");
		  int sindicato = input.nextInt();
		  input.nextLine();
		  
		  System.out.println("\nEscolha o tipo do empregado:\n(1) - Horista\n(2) - Assalariado\n(3) - Comissionado");
		  int tipo = input.nextInt();
		  
		  if (tipo == 1) {
			  Horista horista = new Horista(numEmpregado, nome, endereco, metodoPagamento, sindicato, tipo);
			 			  
			  todosEmpregados.add(horista);
			  
		  } else if (tipo == 2) {
			  Assalariado assalariado = new Assalariado(numEmpregado, nome, endereco, metodoPagamento, sindicato, tipo);
			  
			  assalariado.salario();
			  
			  todosEmpregados.add(assalariado);
			  
		  } else if (tipo == 3) {
			  Comissionado comissionado = new Comissionado(numEmpregado, nome, endereco, metodoPagamento, sindicato, tipo);
			  	  
			  todosEmpregados.add(comissionado);
			  
		  } else {
			  System.out.println("\nErro: Opção Inválida.\\n");
		  }	
		  
		  teste();
		  
		 System.out.println("\nEmpregado cadastrado com sucesso!\n");
		 numEmpregado++;
		
	  }
	  
	// Teste
	 public static void teste() {
		  Assalariado assalariado = (Assalariado) todosEmpregados.get(0);
		  System.out.println(assalariado.getSalario());
		  
		  }
	  
	 /*public void removerEmpregado() {
		  System.out.println("\n\t**  	REMOVER FUNCIONÁRIO  	**\n");
		  
		  System.out.println("Digite o número do Empregado:\n");
		  int nEmpTemp = input.nextInt();
		  
		  System.out.println("\nRemovendo empregado...");
		  
		  for (int i=0; i < todosEmpregados.size(); i++) {
				if (todosEmpregados.get(i).getNumeroEmpregado() == nEmpTemp) {
					todosEmpregados.remove(i);
					
					System.out.println("\nEmpregado removido com sucesso!\n");	
					return;
				}
			} 
		  
		  System.out.println("\nErro: Empregado não encontrado.\n");	
	  }*/
}
