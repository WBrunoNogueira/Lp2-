package model.entities;

public class PedidoItem {

	private Integer quantidade;
	private Double preco;
	
	private Product product; // declarada a classe



	public PedidoItem(Integer quantidade, Double preco, Product product) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.product = product;
	}



	public Integer getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}



	public Double getPreco() {
		return preco;
	}



	public void setPreco(Double preco) {
		this.preco = preco;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public double subTotal() {
		return product.tagPreco() * quantidade;
	}
	
	@Override
	public String toString() {
		return product.getNome() 
				+ ", $" 
				+ String.format("%.2f", product.tagPreco()) 
				+ ", Quantidade: " 
				+ quantidade + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
}
