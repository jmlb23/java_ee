package modelo.obxetosBase;


import java.sql.Date;
/*
idPrestamo | int(11)    | NO   | PRI | NULL    | auto_increment |
| idLibro    | int(11)    | YES  | MUL | NULL    |                |
| idUsuario  | int(11)    | YES  | MUL | NULL    |                |
| data       | date       | YES  |     | NULL    |                |
| devolto    | tinyint(1) | YES  |     | NULL    |            
*/

public class Prestamo{
	private int idLibro;
	private int idUsuario;
	private Date data;
	private boolean devolto;

	public Prestamo(){

	}

	public Prestamo(int idLibro, int idUsuario, Date data, boolean devolto){
		this.idLibro = idLibro;
		this.idUsuario = idUsuario;
		this.data = data;
		this.devolto = devolto;
	}
	public void setId(int idLibro){
		this.idLibro = idLibro;
	}
	
	public void setIdUser(int idUsuario){
		this.idUsuario= idUsuario;
	}
	public void setData(Data data){
		this.data= data;
	}
	public void setId(boolean devolto){
		this.devolto=devolto ;
	}

	public int getId(){
		return this.idLibro;
	}
	public int getIdUser(){
		return this.idLibro;
	}
	public Date getData(){
		return this.idLibro;
	}
	public boolean getId(){
		return this.idLibro;
	}
}
