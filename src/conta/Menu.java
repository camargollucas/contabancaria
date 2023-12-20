package conta;

import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		

		ContaController contas = new ContaController();

		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;
		String n;

		System.out.println("Deseja criar contas teste?: S/N");
		n = leia.next();
	
		if(n.contains("S")){ 
		
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "João", 1000f, 100f);
		contas.cadastrar(cc1);
		
		//ContaCorrente cc2 = new ContaCorrente(2, 123, 1, "Maria", 2000f, 100f);
		//contas.cadastrar(cc2);

		ContaPoupanca cp1 = new ContaPoupanca(3, 125, 2, "José", 4000f, 12);
		contas.cadastrar(cp1);
		
	//	ContaPoupanca cp2 = new ContaPoupanca(4, 125, 2, "Helena", 8000f, 15);
	//	contas.cadastrar(cp2);
		
		contas.listarTodas();}
		

		while (true) {

			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("----------------------------------------------------\r\n"
					+ "                                                    \r\n"
					+ "		🛏   BANCO COLCHÃO   🛏	            \r\n"
					+ "                                                    \r\n"
					+ "----------------------------------------------------\r\n"
					+ "                                                    \r\n"
					+ "		1. Criar conta                      \r\n"
					+ "		2. Listar todas as contas           \r\n"
					+ "		3. Buscar conta por número          \r\n"
					+ "		4. Atualizar dados da conta         \r\n"
					+ "		5. Encerrar conta                   \r\n"
					+ "		6. Saques                           \r\n"
					+ "		7. Depósitos                        \r\n"
					+ "		8. Transferência entre contas       \r\n"
					+ "		9. Sair                             \r\n"
					+ "                                                    \r\n"
					+ "----------------------------------------------------\r\n"
					+ "                                                    \r\n"
					+ "Entre com a opção desejada:                         ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco Colchão: Seu conforto financeiro é a nossa prioridade.");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n Criar conta");

				System.out.println("\n Digite o número da agência: ");
				agencia = leia.nextInt();
				System.out.println("\n Digite o nome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o tipo da conta: (1-Corrente ou 2-Poupança): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o saldo da conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o limite de crédito (R$): ");
					limite = leia.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}

				case 2 -> {
					System.out.println("Digite o dia do aniversário da conta: ");
					aniversario = leia.nextInt();
					contas.cadastrar(
							new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
				}
				}

				break;
			case 2:
				System.out.println("\n Listar todas as contas");
				contas.listarTodas();

				break;
			case 3:
				System.out.println("\n Buscar conta por número");

				break;
			case 4:
				System.out.println("\n Atualizar dados da conta");

				break;
			case 5:
				System.out.println("\n Encerrar conta");

				break;
			case 6:
				System.out.println("\n Saques");

				break;
			case 7:
				System.out.println("\n Depósitos");

				break;
			case 8:
				System.out.println("\n Transferências");

				break;
			default:
				System.out.println("\nOpção inválida");
				break;
			}
		}
	}

	private static void keyPress() {

	}

	public static void sobre() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Projeto Desenvolvido por: Lucas Camargo                     ");
		System.out.println("Apoiado por: Generation Brasil - generation@generation.org  ");
		System.out.println("github.com/camargollucas                                    ");
		System.out.println("------------------------------------------------------------");
	}
}