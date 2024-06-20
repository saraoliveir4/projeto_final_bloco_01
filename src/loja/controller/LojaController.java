package loja.controller;

import java.util.ArrayList;

import loja.model.Loja;
import loja.repository.LojaRepository;

public class LojaController implements LojaRepository {

	private ArrayList<Loja> listaProdutos = new ArrayList<Loja>();
	int id = 0;

	@Override
	public void procurarPorId(int id) {
		var produto = buscarNaCollection(id);

		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO Produto de ID " + id + " não foi encontrado!");

	}

	@Override
	public void listarTodos() {
		for (var loja : listaProdutos) {
			loja.visualizar();
		}

	}

	@Override
	public void cadastrar(Loja loja) {
		listaProdutos.add(loja);
		System.out.println(
				"\nO produto " + loja.getNomeProduto() + " de ID " + loja.getId() + " foi criado com sucesso!");

	}

	@Override
	public void atualizar(Loja loja) {
		var buscaProduto = buscarNaCollection(loja.getId());

		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), loja);
			System.out.println("\nO Produto de ID " + loja.getId() + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO Produto de ID " + loja.getId() + " não foi encontrado!");
	}

	@Override
	public void deletar(int id) {
		var produto = buscarNaCollection(id);

		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO Produto de ID " + id + " foi deletado com sucesso!");
		} else
			System.out.println("\nO Produto de ID " + id + " não foi encontrado!");

	}

	public int gerarId() {
		return ++id;
	}

	public Loja buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}

}
