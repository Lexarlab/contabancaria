package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Colors;

public class Menu {

	public static void main(String[] args) {
		
		ContaController contas = new ContaController();
		
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.view();
		cc1.withdraw(12000.0f);
		cc1.view();
		cc1.deposit(5000.0f);
		cc1.view();
		
        // Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.view();
        cp1.withdraw(1000.0f);
		cp1.view();
		cp1.deposit(5000.0f);
		cp1.view();
		
		Scanner scanner = new Scanner(System.in);
		
		int option, number, agency, type, birthday;
		String holder;
		float balance, limit;
		
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
			
			try{
				option = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				scanner.nextLine();
				option = 0;
			}
			
			if(option == 9) {
				System.out.println(Colors.TEXT_WHITE_BOLD + "\n Banco do Brazil com Z - O seu Futuro começa aqui!");
				about();
				scanner.close();
				System.exit(0);
		}
			switch (option) {
				case 1:
					System.out.println(Colors.TEXT_WHITE_BOLD + "Criar Conta\n\n");
					
					System.out.println("Digite o Número da Agência: ");
					agency = scanner.nextInt();
					System.out.println("Digite o Nome do Tilular: ");
					scanner.skip("\\R?");
					holder = scanner.nextLine();
					
					do {
						System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
						type = scanner.nextInt();
					} while (type < 1 && type > 2);
					
					System.out.println("Digite o Saldo da Conta (R$): ");
					balance = scanner.nextFloat();
					
					switch(type) {
						case 1: {
							System.out.println("Digite o Limite de Crédito (R$): ");
							limit = scanner.nextFloat();
							contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agency, type, holder, balance, limit));
						}
						case 2: {
							System.out.println("Digite o dia do Aniversário da Conta: ");
							birthday = scanner.nextInt();
							contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agency, type, holder, balance, birthday));
						}
					}
					keyPress();
					break;
				case 2: 
					System.out.println(Colors.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
					contas.listarTodas();
					keyPress();
					break;
				case 3:
					System.out.println(Colors.TEXT_WHITE_BOLD + "Consultar dados da Conra - por número\n\n");
					keyPress();
					break;
				case 4:
					System.out.println(Colors.TEXT_WHITE_BOLD + "Atualizar dados da Conta \n\n");
					keyPress();
					break;
				case 5:
					System.out.println(Colors.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");
					keyPress();
					break;
				case 6:
					System.out.println(Colors.TEXT_WHITE_BOLD + "Saque\n\n");
					keyPress();
					break;
				case 7:
					System.out.println(Colors.TEXT_WHITE_BOLD + "Depósito\n\n");
					keyPress();
					break;
				case 8:
					System.out.println(Colors.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");
					keyPress();
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
			public static void keyPress() {
				try {
					System.out.println(Colors.TEXT_RESET + "\n\nPressione Enter para continuar");
					System.in.read();
				} catch (IOException e) {
					System.out.println("Você pressionou uma tecla diferente de enter!");
				}
			}

}
