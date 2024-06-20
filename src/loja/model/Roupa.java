package loja.model;

public class Roupa extends Loja {

	private String tipoDeRoupa;
	private char tamanho;
	private String cor;

	public Roupa(int id, float valorUn, String nomeProduto, int quantidade, int categoria, String tipoDeRoupa,
			char tamanho, String cor) {
		super(id, valorUn, nomeProduto, quantidade, categoria);
		// TODO Auto-generated constructor stub
		this.tipoDeRoupa = tipoDeRoupa;
		this.tamanho = tamanho;
		this.cor = cor;
	}

	public String getTipoDeRoupa() {
		return tipoDeRoupa;
	}

	public void setTipoDeRoupa(String tipoDeRoupa) {
		this.tipoDeRoupa = tipoDeRoupa;
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
		System.out.println("Tipo do Produto: " + this.tipoDeRoupa);
		System.out.println("Tamanho do Produto: " + this.tamanho);
		System.out.println("Cor do Produto: " + this.cor);
	}

}
