package loja.repository;

import loja.model.Loja;

public interface LojaRepository {

	// CRUD da Loja
	public void procurarPorId(int id);

	public void listarTodos();

	public void cadastrar(Loja loja);

	public void atualizar(Loja loja);

	public void deletar(int id);

}
