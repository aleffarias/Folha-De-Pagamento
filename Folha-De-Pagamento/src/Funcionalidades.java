import java.util.ArrayList;
import java.util.Scanner;

public class Funcionalidades {
	  Scanner input = new Scanner(System.in);
	  
	  int numEmpregado = 1;
	  
	  public static ArrayList<PerfilEmpregado> todosEmpregados = new ArrayList<PerfilEmpregado>();
	  
	  public void addEmpregado() {
		  System.out.println("\n**  ADICIONAR EMPREGADO  **\n");
		  
		  PerfilEmpregado empregado = new PerfilEmpregado();
		  
		  empregado.setNumeroEmpregado(numEmpregado);
		  
		  System.out.println("Digite o nome do empregado:");
		  empregado.setNome(input.nextLine());
		  
		  System.out.println("\nDigite o endereço do empregado:");
		  empregado.setEndereco(input.nextLine());
		  
		  System.out.println("\nEscolha o tipo do empregado:\n(1) - Horista\n(2) - Assalariado\n(3) - Comissionado");
		  empregado.setTipo(input.nextInt());
		  
		  
		  System.out.println("\nMétodo de pagamento:\n(1) - Cheque pelos correios\n(2) - Cheque em mãos\n(3) - Depósito em conta bancária");
		  empregado.setMetodoPagamento(input.nextInt());
		  
		  System.out.println("\nPertence ao sindicato?\n(1) - Sim\n(0) - Não");
		  empregado.setSindicato(input.nextInt());
		  
		  todosEmpregados.add(empregado);
		  
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
				}
			}
		  
		  System.out.println("\nEmpregado removido com sucesso!\n");
	  }
}
