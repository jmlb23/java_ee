package net.iessanclemente;
public class Producto implements java.io.Serializable
{
	private int identificador;
	private String nomeProducto;
	private double prezo;

	public Producto(){
		this.identificador = 0;
		this.nomeProducto = "";
		this.prezo = 0.0;
	}
	public Producto(int id, String nome, double prezo){
		this.identificador = id;
		this.nomeProducto = nome;
		this.prezo = prezo;
	}

	public void setIdentificador(int id){
		this.identificador = id;
	}

	public void setNomeProducto(String nome){
		this.nomeProducto = nome;
	}
	
	public void setPrezo(double prezo){
		this.prezo = prezo;
	}


	public int getIdentificador(){
		return this.identificador;
	}

	
	public String getNomeProducto(){
		return this.nomeProducto;
	}

	public double getPrezo(){
		return this.prezo;
	}
	@Override
	public String toString(){
		return this.identificador+" "+this.nomeProducto+" "+this.prezo;
	}
}
