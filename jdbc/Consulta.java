package jdbc;

import java.sql.*;

public class Consulta{
	public static void main(String... args){
		Connection c = null;
		ResultSet r = null; 
		try{
		
			Class.forName("com.mysql.jdbc.Driver");
							//cadea de conexion          //bbdd			  //taboa
			c = DriverManager.getConnection("jdbc:mysql://dbalumnos:3312/a10jesuslb","a10jesuslb","");
			Statement st = c.createStatement();
			PreparedStatement pst = c.PrepareStatement("insert into alumno values(?,?,?,?)");
			
			String vDni = "3535435";
			String vNome = "Pepe";
			String vApelido = "domingo castaño";
			int vIdade= 15;

			pst.setString(1,vDni);
			pst.setString(2,vNome);
			pst.setString(3,vApelido);
			pst.setInt(4,vIdade);
			String query = "insert into alumno values('6','5','6',6)";
			
			System.out.println(pst.executeUpdate());
			r = st.executeQuery("select * from alumno");
			
			while(r.next()){//devolve true metres haxa tuplas
				//o getString admite o nome do campo ou o indice
				System.out.println("DNI: "+r.getString("DNI")+" Nome: "+r.getString("nome")+" Apelidos: "+r.getString("apelidos"));
			}

			//engadir unha fila insert


		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(c!=null)c.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	}
}
