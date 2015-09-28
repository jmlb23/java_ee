package net.iessanclemente.xml.Exercicio10;
public class Pedido{
	//atributos
	private int idPedido;
	private String nomeCliente;
        private Producto producto;
	

	public Pedido(){
		this.idPedido = 0;
		this.nomeCliente = "";
		this.producto = null;
	}

	public Pedido(int idPedido, String nomeCliente, Producto producto){
		this.idPedido = idPedido;
		this.nomeCliente = nomeCliente;
		this.producto = producto;
	}

	public void setId(int idPedido){
		this.idPedido = idPedido;
	}

	public void setNome(String nomeCliente){
		this.nomeCliente = nomeCliente;
	}

	public void setProducto(Producto producto){
		this.producto = producto;
	}

	public int getId(){
		return this.idPedido;
	}

	public String getNome(){
		return this.nomeCliente;
	}

	public Producto getProducto(){
		return this.producto;
	}

	@Override
	public String toString(){
		return "id: "+this.idPedido+" nome: "+this.nomeCliente+" Producto: "+this.producto;
	}
}

