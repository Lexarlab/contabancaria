package conta;

import java.util.Scanner;

import conta.util.Colors;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int option;
		
		while(true) {
			
			System.out.println(Colors.TEXT_CYAN + Colors.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Colors.TEXT_RESET);
			
			option = scanner.nextInt();
			
			if(option == 9) {
				System.out.println(Colors.TEXT_WHITE_BOLD + "\n Banco do Brazil com Z - O seu Futuro começa aqui!");
				about();
				scanner.close();
				System.exit(0);
		}
			switch (option) {
				case 1:
					System.out.println(Colors.TEXT_WHITE_BOLD + "Criar Conta\n\n");
					break;
				case 2: 
					System.out.println(Colors.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
					break;
				case 3:
					System.out.println(Colors.TEXT_WHITE_BOLD + "Consultar dados da Conra - por número\n\n");
					break;
				case 4:
					System.out.println(Colors.TEXT_WHITE_BOLD + "Atualizar dados da Conta \n\n");
					break;
				case 5:
					System.out.println(Colors.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");
					break;
				case 6:
					System.out.println(Colors.TEXT_WHITE_BOLD + "Saque\n\n");
					break;
				case 7:
					System.out.println(Colors.TEXT_WHITE_BOLD + "Depósito\n\n");
					break;
				case 8:
					System.out.println(Colors.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");
					break;
				default:
					System.out.println(Colors.TEXT_RED_BOLD + "\nOpção Inválida!\n");
					break;
					
					}
				}
			}
			
			public static void about() {
				System.out.println("\n*********************************************************");
				System.out.println("Projeto Desenvolvido por: ");
				System.out.println("Generation Brasil - generation@generation.org");
				System.out.println("github.com/conteudoGeneration");
				System.out.println("*********************************************************");
	}

}