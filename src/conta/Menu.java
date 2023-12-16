package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		int opcao;
	
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
			
			if(opcao == 9) {
				System.out.println("\nBanco Colchão: Seu conforto financeiro é a nossa prioridade.");
                  		sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println("\n Criar conta");
				
                 break;
			case 2:
				System.out.println("\n Listar todas as contas");
				
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
	public static void sobre() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Projeto Desenvolvido por: Lucas Camargo                     ");
		System.out.println("Apoiado por: Generation Brasil - generation@generation.org  ");
		System.out.println("github.com/camargollucas                                    ");
		System.out.println("------------------------------------------------------------");
	}
}