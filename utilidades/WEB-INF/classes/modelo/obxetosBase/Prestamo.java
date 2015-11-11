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
	private int idPrestamo;
	private int idLibro;
	private int idUsuario;
	private Date data;
	private boolean devolto;

	public Prestamo(){

	}

	public Prestamo(int idPrestamo,int idLibro, int idUsuario, Date data, boolean devolto){
		this.idPrestamo = idPrestamo;
		this.idLibro = idLibro;
		this.idUsuario = idUsuario;
		this.data = data;
		this.devolto = devolto;
	}
	public void setIdPrestamo(int idPrestamo){
		this.idPrestamo = idPrestamo;
	}
	
	public void setIdLibro(int idLibro){
		this.idLibro = idLibro;
	}

	public void setIdUsuario(int idUsuario){
		this.idUsuario= idUsuario;
	}
	public void setData(Date data){
		this.data= data;
	}
	public void setDevolto(boolean devolto){
		this.devolto=devolto ;
	}

	public int getIdPrestamo(){
		return this.idPrestamo;
	}
	public int getIdLibro(){
		return this.idLibro;
	}
	public int getIdUsuario(){
		return this.idUsuario;
	}
	public Date getData(){
		return this.data;
	}
	public boolean getDevolto(){
		return this.devolto;
	}

	public String toString(){
		return String.format(" %d %d %d %s %s",idPrestamo,idLibro,idUsuario,data.toString(),Boolean.toString(devolto));
	}
}
