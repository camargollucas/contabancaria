package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;
		System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_YELLOW_BACKGROUND);
		System.out.println("----------------------------------------------------\r\n"
				+ "                                                    \r\n"
				+ "		BANCO COLCHÃO                       \r\n"
				+ "                                                    \r\n"
				+ "----------------------------------------------------\r\n"
				+ "                                                    \r\n"
				+ "		1. Criar conta                      \r\n" + "		2. Listar todas as contas           \r\n"
				+ "		3. Buscar conta por número          \r\n" + "		4. Atualizar dados da conta         \r\n"
				+ "		5. Encerrar conta                   \r\n" + "		6. Saques                           \r\n"
				+ "		7. Depósitos                        \r\n" + "		8. Transferência entre contas       \r\n"
				+ "		9. Sair do menu                     \r\n"
				+ "                                                    \r\n"
				+ "----------------------------------------------------\r\n"
				+ "                                                    \r\n"
				+ "Entre com a opção desejada:                         \r\n"
				+ "                                                    \r\n" + "" + Cores.TEXT_RESET);

		while (true) {

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nOnde seus sonhos repousam em segurança. Banco Colchão.");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Encerrar a conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre contas\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção inválida!\n");
				break;
			}
		}

	}

	public static void sobre() {
		System.out.println("\n---------------------------------------------------------");
		System.out.println("Projeto desenvolvido por: Lucas Camargo ");
		System.out.println("github.com/camargollucas");
		System.out.println("---------------------------------------------------------");
	}
}
