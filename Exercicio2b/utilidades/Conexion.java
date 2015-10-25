package Exercicio2b.utilidades;


import java.sql.*;


public class Conexion{
	private Connection con;	

	public Conexion(String driver){
		if(driver == null){

			driver = "com.mysql.jdbc.Driver";
		}
		try{
			Class.forName(driver);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	public Connection openConnection(String url, String userName, String password){
		try{
			con = DriverManager.getConnection(url,userName,password);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}

	public void closeConnection(Connection con){
		if(con != null){
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

	

	
}
