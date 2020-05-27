package model.entities;

public class ImpotadoProduct extends Product{


	public ImpotadoProduct(String nome, Double preco) {
		super(nome, preco);
		
	}
	

	@Override
	public double tagPreco() {
		// TODO Auto-generated method stub
		return (getPreco() * 0.20) + getPreco() ;// se produto for IMPORTADO  20% DE IMPOSTO segundo a regra de negócio
	}
	
	

}
