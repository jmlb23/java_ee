//ollo porque se compilamos sen poñer o package jre recoñece que o .class non esta nun package
package jdbc;
import java.sql.*;
public class Conexion{

	public static void main(String... args){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://localhost/jesus","root","def456..");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("Select * from probas");
			
			System.out.println(rs);
			
		}catch(SQLException | ClassNotFoundException e){
			System.out.println(e.getMessage());
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
