package loja;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import loja.controller.LojaController;
import loja.model.Cama;
import loja.model.Loja;
import loja.model.Roupa;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LojaController produtos = new LojaController();

		Scanner leia = new Scanner(System.in);

		int opcao, id, quantidade, categoria;
		char tamanho;
		String nomeProduto, tipoDeRoupa, cor;
		float valorUn;

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

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println("\nLuxo Pet - O seu pet com todo o luxo que merece!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto\n\n");

				System.out.println("\nDigite o Nome do Produto: ");
				leia.skip("\\R?");
				nomeProduto = leia.nextLine();
				System.out.println("\nDigite a quantidade do Produto: ");
				quantidade = leia.nextInt();
				System.out.println("\nDigite o valor unitário do Produto (R$): ");
				valorUn = leia.nextFloat();

				do {
					System.out.println("\nDigite a Categoria do Produto (1-Cama Pet ou 2-Roupa Pet): ");
					categoria = leia.nextInt();
				} while (categoria < 1 && categoria > 2);

				System.out.println("\nDigite o Tamanho do Produto: ");
				tamanho = leia.next().charAt(0);
				System.out.println("\nDigite a Cor do Produto: ");
				leia.skip("\\R?");
				cor = leia.nextLine();

				switch (categoria) {
				case 1 -> {
					produtos.cadastrar(
							new Cama(produtos.gerarId(), valorUn, nomeProduto, quantidade, categoria, cor, tamanho));
				}
				case 2 -> {
					System.out.println("\nDigite o Tipo de Roupa: ");
					tipoDeRoupa = leia.nextLine();
					produtos.cadastrar(new Roupa(produtos.gerarId(), valorUn, nomeProduto, quantidade, categoria,
							tipoDeRoupa, tamanho, cor));
				}
				}
				keyPress();
				break;
			case 2:
				System.out.println("Listar todos os Produtos\n\n");
				produtos.listarTodos();
				keyPress();
				break;
			case 3:
				System.out.println("Buscar Produto por ID\n\n");

				System.out.println("\nDigite o ID do Produto: ");
				id = leia.nextInt();

				produtos.procurarPorId(id);
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar Produto\n\n");
				System.out.println("\nDigite o ID do Produto: ");
				id = leia.nextInt();

				var buscaProduto = produtos.buscarNaCollection(id);

				if (buscaProduto != null) {

					categoria = buscaProduto.getCategoria();

					System.out.println("\nDigite o Nome do Produto: ");
					leia.skip("\\R?");
					nomeProduto = leia.nextLine();
					System.out.println("\nDigite a quantidade do Produto: ");
					quantidade = leia.nextInt();
					System.out.println("\nDigite o valor unitário do Produto (R$): ");
					valorUn = leia.nextFloat();
					System.out.println("\nDigite o Tamanho do Produto: ");
					tamanho = leia.next().charAt(0);
					System.out.println("\nDigite a Cor do Produto: ");
					leia.skip("\\R?");
					cor = leia.nextLine();

					switch (categoria) {
					case 1 -> {
						produtos.atualizar(new Cama(produtos.gerarId(), valorUn, nomeProduto, quantidade, categoria,
								cor, tamanho));
					}
					case 2 -> {
						System.out.println("\nDigite o Tipo de Roupa: ");
						tipoDeRoupa = leia.nextLine();
						produtos.atualizar(new Roupa(produtos.gerarId(), valorUn, nomeProduto, quantidade, categoria,
								tipoDeRoupa, tamanho, cor));

					}
					default -> {
						System.out.println("\nCategoria de Produto inválida!");
					}
					}
				} else {
					System.out.println("\nO Produto não foi encontrado!");
				}

				keyPress();
				break;
			case 5:
				System.out.println("Excluir Produto\n\n");
				System.out.println("\nDigite o ID do Produto: ");
				id = leia.nextInt();

				produtos.deletar(id);

				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
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

	public static void keyPress() {
		try {
			System.out.println("\n\nPressione Enter para Continuar!");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de Enter. Tente novamente!");
		}
	}

}
