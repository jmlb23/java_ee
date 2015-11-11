package modelo.obxetosBase;
import java.util.Arrays;
public class Libro{
	/*
		idLibro | int(11)      | NO   | PRI | NULL    | auto_increment |
		ISBN    | varchar(20)  | YES  |     | NULL    |                |
		titulo  | varchar(200) | YES  |     | NULL    |                |
		autores | varchar(300) | YES  |     | NULL    |                |
		ano
	*/

	private int idLibro;
	private String isbn;
	private String titulo;
	private String[] autores;
	private int ano;
	
	public Libro(){

	}
	public Libro(String isbn, String titulo, String[] autores, int ano){
		this.isbn = isbn;
		this.titulo = titulo;
		this.autores = autores;
		this.ano = ano;
	}
	public Libro(int idLibro, String isbn, String titulo, String[] autores, int ano){
		this.idLibro = idLibro;
		this.isbn = isbn;
		this.titulo = titulo;
		this.autores = autores;
		this.ano = ano;
	}

	public void setId(int idLibro){
		this.idLibro = idLibro;
	}
	public void setIsbn(String isbn){
		this.isbn= isbn;
	}
	public void setAutores(String[] autores){
		this.autores = autores;
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public void setAno(int ano){
		this.ano = ano;
	}

	public int getId(){
		return this.idLibro;
	}
	public String getIsbn(){
		return this.isbn;
	}
	public String getTitulo(){
		return this.titulo;
	}
	public String[] getAutores(){
		return this.autores;
	}
	public int getAno(){
		return this.ano;
	}

	@Override
	public String toString(){
		return String.format("%d %s %s %s %d",this.idLibro,this.isbn,this.titulo,Arrays.toString(this.autores),this.ano);
	}
}
