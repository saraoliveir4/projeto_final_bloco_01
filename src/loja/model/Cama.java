package loja.model;

public class Cama extends Loja {

	private char tamanho;
	private String cor;

	public Cama(int id, float valorUn, String nomeProduto, int quantidade, int categoria, String cor, char tamanho) {
		super(id, valorUn, nomeProduto, quantidade, categoria);
		// TODO Auto-generated constructor stub
		this.cor = cor;
		this.tamanho = tamanho;

	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tamanho do Produto: " + this.tamanho);
		System.out.println("Cor do Produto: " + this.cor);
	}

}
