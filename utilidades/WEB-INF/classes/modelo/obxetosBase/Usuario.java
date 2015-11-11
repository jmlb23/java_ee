package modelo.obxetosBase;

/*
idUsuario | int(11)      | NO   | PRI | NULL    | auto_increment |
DNI       | char(9)      | YES  |     | NULL    |                |
nome      | varchar(200) | YES  |     | NULL    |                |
correoe   | varchar(200) | YES  |     | NULL    |                |

*/

public class Usuario{
	private int idUser;
	private String dni;
	private String nome;
	private String correoe;

	public Usuario(){

	}
	public Usuario(String dni, String nome, String correoe){
		this.dni = dni;
		this.nome = nome;
		this.correoe = correoe;
	}
	public Usuario(int idUser,String dni, String nome, String correoe){
		this.idUser = idUser;
		this.dni = dni;
		this.nome = nome;
		this.correoe = correoe;
	}
	public void setId(int id){
		this.idUser = id;
	}
	public void setDni(String dni){
		this.dni = dni;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCorreoe(String correoe){
		this.correoe = correoe;
	}

	public int getId(){
		return this.idUser;
	}
	public String getDni(){
		return this.dni;
	}
	public String getNome(){
		return this.nome;
	}
	public String getCorreoe(){
		return this.correoe;
	}
	
	@Override
	public String toString(){
		return String.format("%d %s %s %s",this.idUser,this.dni,this.nome,this.correoe);
	}
}
