package loja;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                      LUXO PET                       ");
			System.out.println("        O seu pet com todo o luxo que merece!        ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar Produto por ID                ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Excluir Produto                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();
			
			if(opcao == 6) {
				System.out.println("\nLuxo Pet - O seu pet com todo o luxo que merece!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println("Cadastrar Produto\n\n");
				break;
			case 2:
				System.out.println("Listar todos os Produtos\n\n");
				break;
			case 3:
				System.out.println("Buscar Produto por ID\n\n");
				break;
			case 4:
				System.out.println("Atualizar Produto\n\n");
				break;
			case 5:
				System.out.println("Excluir Produto\n\n");
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
			
			
		}

	}
	public static void sobre() {
		System.out.println("\n*****************************************************");
		System.out.println("Projeto Desenvolvido por: Sara Monteiro Oliveira");
		System.out.println("sara.monteiro1234@gmail.com");
		System.out.println("https://github.com/saraoliveir4");
		System.out.println("*****************************************************");
	}

}
