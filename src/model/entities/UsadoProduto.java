package model.entities;

public  class UsadoProduto  extends Product{

	public UsadoProduto(String nome, Double preco) {
		super(nome, preco);

	}

	@Override
	public double tagPreco() {

		return (getPreco() * 0.10) - getPreco() ; // se produto for usado desconto 10% segundo a regra de negócio
	}
	

}
