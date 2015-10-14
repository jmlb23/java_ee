import java.sql.*;
public class Conexion1{
  public static void main(String[] args){
    Connection conexion=null;
    try{
      //Carga do controlador JDBC de MySQL
      Class.forName("com.mysql.jdbc.Driver");
      //Crea unha conexion a base de datos
      String url="jdbc:mysql://servidor:porto/bd";
      conexion = DriverManager.getConnection(url,"usuario","clave");
      //Mostra a version do driver JDBC
      DatabaseMetaData meta = conexion.getMetaData();
      System.out.println("A version do driver JDBC e: "+meta.getDriverVersion());
    }
    catch(SQLException erro){
      System.out.println("Erro SQL: "+erro.getMessage());
    }
    catch(Exception erro){
      System.out.println("Erro: "+erro.getMessage());
    }
    finally{
      if (conexion != null){
        try{
          conexion.close();
        }
        catch(SQLException erro){
          System.out.println("Erro o cerrar a conexion: "+erro.getMessage());
        }
      }//if
    }
  }//main
}//class
