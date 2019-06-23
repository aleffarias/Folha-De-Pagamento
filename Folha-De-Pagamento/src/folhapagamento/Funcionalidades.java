package folhapagamento;

import java.util.ArrayList;
import java.util.Scanner;

import folhapagamento.empregado.Assalariado;
import folhapagamento.empregado.Comissionado;
import folhapagamento.empregado.Empregado;
import folhapagamento.empregado.Horista;

public class Funcionalidades {
	  Scanner input = new Scanner(System.in);
	  
	  static int numEmpregado = 1;
	  
	  public static ArrayList<Empregado> todosEmpregados = new ArrayList<Empregado>();
	  
	  public void addEmpregado() {
		  System.out.println("\n**  ADICIONAR EMPREGADO  **\n");
		  
		  System.out.println("Digite o nome do empregado:");
		  String nome = input.nextLine();
		  
		  System.out.println("\nDigite o endereço do empregado:");
		  String endereco = input.nextLine();
		  
		  System.out.println("\nEscolha o tipo do empregado:\n(1) - Horista\n(2) - Assalariado\n(3) - Comissionado");
		  int tipo = input.nextInt();
		  
		  if (tipo == 1) {
			  Horista horista = new Horista();
			  
			  // numero funcionario
			  
		  } else if (tipo == 2) {
			  Assalariado assalariado = new Assalariado();
			  
		  } else if (tipo == 3) {
			  Comissionado comissionado = new Comissionado();
			  
		  } else {
			  System.out.println("\nErro: Opção Inválida.\\n");
		  }
		  
		  
		  System.out.println("\nMétodo de pagamento:\n(1) - Cheque pelos correios\n(2) - Cheque em mãos\n(3) - Depósito em conta bancária");
		  int metodoPagamento = input.nextInt();
		  
		  System.out.println("\nPertence ao sindicato?\n(1) - Sim\n(0) - Não");
		  int sindicato = input.nextInt();
		  
		 // todosEmpregados.add();
		  
		// Teste
		  System.out.print(todosEmpregados.get(0).getSindicato());
		  
		 System.out.println("\nEmpregado cadastrado com sucesso!\n");
		 numEmpregado++;
		
	  }
	  
	  public void removerEmpregado() {
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
	  }
}
