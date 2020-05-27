package model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Pedido {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	
	private Cliente cliente; //classe Cliente
	private List<PedidoItem> items = new ArrayList<>(); //composição colocando os pedidos numa lista
	
	public Pedido(Date moment,  Cliente cliente) {
		this.moment = moment;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public Cliente getClient() {
		return cliente;
	}

	public void setClient(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<PedidoItem> getItems() {
		return items;
	}
	
	/*METODOS DE ADICIONAR*/
	
	public void addItem(PedidoItem item) {
		items.add(item);
	}
	/*METODOS DE REMOVER*/
	public void removeItem(PedidoItem item) {
		items.remove(item);
	}
	
	/*METODO RESPONSAVEL POR SOMAR O VALOR DE TODOS OS ITENS DA CLASE PedidoItem*/
	public double total() {
		double sum = 0.0;
		for (PedidoItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();//este objeto serve para facilitar o lançamentos de string
		sb.append("*Data do Pedido: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("*Status do pedido: ");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("\n");
		sb.append("Pedido items:\n");
		for (PedidoItem item : items) {// para cada item da lista intems mostrar o toString
			sb.append(item + "\n");
		}
		sb.append("Total : $");
		sb.append(String.format("%.2f", total()));//exibe oe total do pedido
		return sb.toString();
	}
}
