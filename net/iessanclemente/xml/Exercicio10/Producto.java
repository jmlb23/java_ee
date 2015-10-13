package net.iessanclemente.xml.Exercicio10;

public class Producto{
	//atributos
	private int idProducto;
	private String descricion;
	private double prezo;
	
	public Producto(){
		this.idProducto = 0;
		this.descricion = "";
		this.prezo = 0.0;
	}

	public Producto(int idProducto, String descricion, double prezo){
		this.idProducto = idProducto;
		this.descricion = descricion;
		this.prezo = prezo;
	}

	public void setId(int idProducto){
		this.idProducto = idProducto;
	}

	public void setDescricion(String descricion){
		this.descricion = descricion;
	}

	public void setPrezo(double prezo){
		this.prezo = prezo;
	}

	public int getId(){
		return this.idProducto;
	}

	public String getDescricion(){
		return this.descricion;
	}

	public double getPrezo(){
		return this.prezo;
	}

	public String toString(){
		return "id "+this.idProducto+" descricion "+this.descricion+" prezo "+this.prezo;
	}
}
