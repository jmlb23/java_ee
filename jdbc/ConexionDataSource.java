import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
public class ConexionDataSource{
  public static void main(String[] args){
    try{
    	//instantiating and configuring one from your database driver directly:
    	com.mysql.jdbc.jdbc2.optional.MysqlDataSource dataSource = new com.mysql.jdbc.jdbc2.optional.MysqlDataSource();
   		dataSource.setUser("usuario");
    	dataSource.setPassword("clave");
    	dataSource.setServerName("servidor");
    	dataSource.setPort(porto);
	dataSource.setDataBaseName(bd);
    	
    	// Then obtain connections from it, same as above:

    	Connection conexion = dataSource.getConnection();
    	
      //String url="jdbc:mysql://dbalumnos:3312/ADT2_A11RodrigoSP";
      //Connection conexion = DriverManager.getConnection(url,"A11RodrigoSP","abc123.");
      //Mostrar version do driver JDBC
      DatabaseMetaData meta = conexion.getMetaData();
      System.out.println("A version do driver JDBC e: "+meta.getDriverVersion());
    }
    catch(SQLException erro){
      System.out.println("Erro SQL: "+erro.getMessage());
    }
    catch(Exception erro){
      System.out.println("Erro: "+erro.getMessage());
    }
  }//main
}//class
