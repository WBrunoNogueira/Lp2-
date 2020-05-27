package model.entities;

public abstract class  Product { // classe abstract, não deve ser instanciada..

	private String nome;
	private Double preco;
	
	public Product(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public abstract double tagPreco(); // método sobrescrito

}
