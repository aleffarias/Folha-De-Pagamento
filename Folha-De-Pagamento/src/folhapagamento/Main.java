package folhapagamento;

import java.util.Scanner;

public class Main {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			
			menu();
			
			opcao = input.nextInt();
			input.nextLine();
			
			switch(opcao) {
			case 1:
				Funcionalidades.addEmpregado();
				break;
				
			case 2:
				Funcionalidades.removerEmpregado();
				break;
				
			case 3:
				Funcionalidades.cartaoPonto();
				break;
				
			case 0:
				System.exit(0);
			
			default:
				System.out.println("\nErro: Opção Inválida.\n");
			}
			
		}
	}
	
	public static void menu() {
		System.out.println("===============================FOLHA DE PAGAMENTO=====================================");
		System.out.println("\nEscolha uma opção:");
		System.out.println("(1) - Adicionar Empregado");
		System.out.println("(2) - Remover Empregado");
		System.out.println("(3) - Lançar um Cartão de Ponto");
		System.out.println("(4) - Lançar um Resultado Venda");
		System.out.println("(5) - Lançar uma taxa de serviço");
		System.out.println("(6) - Alterar detalhes de um empregado");
		System.out.println("(7) - Rodar a folha de pagamento para hoje (após rodar, avança 1 dia)");
		System.out.println("(8) - Undo/redo");
		System.out.println("(9) - Agenda de Pagamento");
		System.out.println("(10) - Criação de Novas Agendas de Pagamento");
		System.out.println("(0) - Sair");
	}
}
