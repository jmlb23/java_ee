package libro;
import java.util.Arrays;
public class Libro implements java.io.Serializable{
	private String isbn;
	private String titulo;
	private String[] autores;
	private Integer ano;

	public Libro(String isbn, String titulo, String[] autores, Integer ano){
		this.isbn = isbn;
		this.titulo = titulo;
		this.autores = autores;
		this.ano = ano;
	}

	public void setX(Object valor, String oQue){
		if(oQue.equals("isbn")){
			this.isbn = (String)valor;
		}else if(oQue.equals("titulo")){
			this.titulo = (String)valor;
		}else if(oQue.equals("autores")){
			this.autores = (String[])valor;
		}else if(oQue.equals("ano")){
			this.ano = (Integer)valor;
		}
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
	
	public Integer getAno(){
		return this.ano;
	}
	@Override
	public String toString(){
		return String.format("%s %s %s %d",this.isbn,this.titulo,Arrays.toString(autores),(int)this.ano);
	}

}
