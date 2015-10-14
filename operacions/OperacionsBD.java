package operacions;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class OperacionsBD{
	/*
	-Connection conexion
	-String erro
	+String getErro()
	+abrirConexion()
	+cerrarConexion()
	+engadeAlumno(Alumno alumno)
	+Alumno consultaAlumno(String DNI)
	+borraAlumno(String DNI)
	+modificaAlumno(Alumno alumno)
	+List listadoAlumnos()

	*/

	private Connection con;
	private String erro;
	private String url;
	private String usuario;
	private String contrasinal;
	
	/**
	*@param java.lang.String fullyQualifiedDriver o nome do driver
	*
	*/
	public OperacionsBD(String fullyQualifiedDriver){
		try{
		Class.forName(fullyQualifiedDriver);
		}catch(ClassNotFoundException e){
			System.out.println("O driver non se puido cargar");
		}
		
	}
	

	public void abrirConexion(){
		try{
			con = DriverManager.getConnection(this.url,this.usuario,this.contrasinal);
		}catch(SQLException e){

			this.erro = e.getMessage();
		}
	}
	
	public void cerraConexion(){
		try{
			this.con.close();
		}catch(SQLException e){
			this.erro = e.getMessage();
		}
	}
	
	public void engadeAlumno(Alumno a){
		try(PreparedStatement stm = con.prepareStatement("insert into alumno(DNI,nome,apelidos,idade) values(?,?,?,?)");){
		
		stm.setString(1,a.getDni());
		stm.setString(2,a.getNome());
		stm.setString(3,a.getApelidos());
		stm.setInt(4,a.getIdade());
		stm.executeUpdate();
		}catch(SQLException e){
			
			this.erro = e.getMessage();
		}
	}

	public Alumno consultaAlumno(String dni){
		Alumno al = null;
		try(PreparedStatement stm = con.prepareStatement("Select * from alumno where DNI = ? ");){
			stm.setString(1,dni);
			ResultSet rs = stm.executeQuery();
			rs.next();
			al = new Alumno(rs.getString("DNI"),rs.getString("nome"),rs.getString("apelidos"),rs.getInt("idade"));
		}catch(SQLException e){
			this.erro = e.getMessage();

		}
		return al;
	}
	
	public void borraAlumno(String dni){
		try(PreparedStatement stm = con.prepareStatement("delete from alumno where DNI = ?");){
                	stm.executeUpdate();
                }catch(SQLException e){

                        this.erro = e.getMessage();
                }
	}

	public void modificarAlumno(Alumno a){
		try(PreparedStatement stm = con.prepareStatement("update alumno set DNI = ?, nome = ?, apelidos = ?, idade = ? ");){

                stm.setString(1,a.getDni());
                stm.setString(2,a.getNome());
                stm.setString(3,a.getApelidos());
                stm.setInt(4,a.getIdade());
                stm.executeUpdate();
                }catch(SQLException e){

                        this.erro = e.getMessage();
                }
	}
	public List<Alumno> listaAlumnos(){
		List<Alumno> lista = new ArrayList<>();
		Alumno a= null;
		 try{
			Statement stm = con.createStatement();
                        ResultSet rs = stm.executeQuery("Select * from alumno");
                        while(rs.next()){
				a= new Alumno(rs.getString("DNI"),rs.getString("nome"),rs.getString("apelidos"),rs.getInt("idade"));
				lista.add(a);
			}
                }catch(SQLException e){
                        this.erro = e.getMessage();

                }

		return lista;
	}
}
