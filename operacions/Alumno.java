package operacions;

public class Alumno{
	/*
		Alumno <operacions>
-String DNI
-String nome
-String apelidos
-int idade
+Alumno(...)
+getDNI()*/
	private String dni;
	private String nome;
	private String apelidos;
	private int idade;
	

	public Alumno(){
		this.dni = "";
		this.nome = "";
		this.apelidos = "";
		this.idade = 0;
	}

	public Alumno(String dni, String nome, String apelidos, int idade){
		this.dni = dni;
		this.nome = nome;
		this.apelidos = apelidos;
		this.idade = idade;
	}
	//setters
	public void setDni(String dni){
		this.dni = dni;
	}	
	public void setNome(String nome){
		this.nome = nome;
	}	
	public void setApelidos(String apelidos){
		this.apelidos = apelidos;
	}	
	public void setIdade(int idade){
		this.idade = idade;
	}	
	//getters
	public String getDni(){
		return this.dni;
	}
	public String getNome(){
		return this.nome;
	}
	public String getApelidos(){
		return this.apelidos;
	}
	public int getIdade(){
		return this.idade;
	}
	

	public @Override String toString(){
		return String.format("%s %s %s %i",this.dni,this.nome,this.apelidos,this.idade);
	}
}
