package loja.model;

public abstract class Loja {

	private int id;
	private float valorUn;
	private String nomeProduto;
	private int quantidade;
	private int categoria;

	public Loja(int id, float valorUn, String nomeProduto, int quantidade, int categoria) {
		this.id = id;
		this.valorUn = valorUn;
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getValorUn() {
		return valorUn;
	}

	public void setValorUn(float valorUn) {
		this.valorUn = valorUn;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void visualizar() {

		String categoria = "";

		switch (this.categoria) {
		case 1:
			categoria = "Cama Pet";
			break;
		case 2:
			categoria = "Roupa Pet";
			break;
		}
		System.out.println("\n\n*****************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("*****************************************************");
		System.out.println("Categoria do Produto: " + categoria);
		System.out.println("Nome do Produto: " + this.nomeProduto);
		System.out.println("ID do Produto: " + this.id);
		System.out.println("Quantidade em Estoque: " + this.quantidade);
		System.out.println("Valor Unitário: " + this.valorUn);

	}
}
