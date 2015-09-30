package persoa;
import java.io.Serializable;
public class Persoa implements Serializable{
	private String nome;
	private int idade;
	final static long serialVersionUID=1L;
	public Persoa(String nome, int idade){
		this.nome=nome;
		this.idade=idade;
	}
	public Persoa(){}
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setIdade(int idade){
		this.idade=idade;
	}
	public String getNome(){
		return nome;
	}
	public int getIdade(){
		return idade;
	}
	public String toString(){
		return this.nome+" "+this.idade;
	}
}//class
