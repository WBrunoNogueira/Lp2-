package application;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Cliente;
import model.entities.ImpotadoProduct;
import model.entities.Pedido;
import model.entities.PedidoItem;
import model.entities.Product;
import model.entities.UsadoProduto;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Cadastro de pedidos");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os Dados do Cliente:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data Nascimento (DD/MM/YYYY): ");
		Date nascimento = sdf.parse(sc.next());
		
		Cliente client = new Cliente(name, email, nascimento);
		
		System.out.println("*------Entre com dados do Pedido------*");
		
		
		Pedido pedido = new Pedido(new Date(),client); //instancia a objeto da classe Pedido
		
		System.out.print("Quantos itens serão pedidos? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			
			System.out.println();
			System.out.println("*---------------------------*");
			System.out.println();
			
			System.out.println("Entre com o pedido  #" + i);
			System.out.print("Nome do Produto: ");
			sc.nextLine();
			String productNome = sc.nextLine();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			System.out.print("Preço: ");
			double productPreco = sc.nextDouble();
			System.out.println("Produto importado (taxado 20%) / usado (desconto de 10%)");
			System.out.println("Digite i / u");
			char type = sc.next().charAt(0);
			if (type =='i') {
				Product product = new ImpotadoProduct(productNome, productPreco);//instancia a objeto da classe Produto
				PedidoItem pedidoItem = new PedidoItem(quantidade, productPreco, product); //instancia a objeto da classe Pedido com parametro do objeto produto

				pedido.addItem(pedidoItem);
			} 
			else if (type == 'u'){
				Product product = new UsadoProduto(productNome, productPreco);//instancia a objeto da classe Produto
				PedidoItem pedidoItem = new PedidoItem(quantidade, productPreco, product); //instancia a objeto da classe Pedido com parametro do objeto produto

				pedido.addItem(pedidoItem);
			}
			
	}
		
		System.out.println();
		System.out.println("LISTAGEM: ");
		System.out.println();
		System.out.println(pedido);
		
		sc.close();
	}
}
