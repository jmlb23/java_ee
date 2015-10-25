package Exercicio2b.utilidades;

import Exercicio2b.utilidades.obxetosBase.*;
import java.util.*;
import java.sql.*;

public class LibroDao extends AbstractDao<Libro>{
	Connection cnn = new Conexion(null).openConnection("jdbc:mysql://localhost/jesus","root","def456..");	
	public ArrayList<Libro> selectAll(){
		ArrayList<Libro> lista = new ArrayList<>();
		
		try(PreparedStatement ps = cnn.prepareStatement("Select * from libros");
		ResultSet rs = ps.executeQuery();){
			while(rs.next()){
				lista.add(new Libro(rs.getInt("idLibro"),rs.getString("ISBN"),rs.getString("titulo"),new String[]{rs.getString("autores")},rs.getInt("ano")));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return lista;		
	}
        public Libro selectOne(int id){
		Libro l = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
		ps = cnn.prepareStatement("Select * from libros where idLibro = ?");
		ps.setInt(1,id);
                rs = ps.executeQuery();
		
			
                        while(rs.next()){
                                l = new Libro(rs.getInt("idLibro"),rs.getString("ISBN"),rs.getString("titulo"),new String[]{rs.getString("autores")},rs.getInt("ano"));
                        }
                }catch(SQLException e){
                        e.printStackTrace();
                }finally{
			try{
				rs.close();
				ps.close();
				
			}catch(SQLException e){

			}
		}
		return l;
	}
        public int removeOne(int id){
		int numero = 0;
		PreparedStatement ps = null;
		
		try{
		ps = cnn.prepareStatement("Delete from libros where idLibro = ?");
		ps.setInt(1,id);
                numero = ps.executeUpdate();
		
			
                }catch(SQLException e){
                        e.printStackTrace();
                }finally{
                        try{
                                ps.close();
                                
                        }catch(SQLException e){

                        }
                }

		return numero;
	}
	//idLibro int primary key AUTO_INCREMENT, ISBN varchar(20), titulo varchar(200), autores varchar(300), ano int
	
        public int updateOne(Libro element){
		int numero = 0;
                PreparedStatement ps = null;

                try{
                ps = cnn.prepareStatement("Update libros set ISBN = ?,titulo = ?,autores = ?, ano = ? where idLibro = ?");
                pa.setString(1,element.getIsbn());
                ps.setString(2,element.getTitulo());
                ps.setString(3,Arrays.toString(element.getAutores()).replaceAll("\\[\\]",""));
                ps.setInt(4,element.getAno());
		ps.setInt(5,element.getId());
                numero = ps.executeUpdate();


                }catch(SQLException e){
                        e.printStackTrace();
                }finally{
                        try{
                                ps.close();

                        }catch(SQLException e){

                        }
                }

                return numero;
	}
        public int createOne(Libro element){
		int numero = 0;
                PreparedStatement ps = null;

                try{
                ps = cnn.prepareStatement("insert into libros(idLibro,ISBN,titulo,autores,ano) values (?,?,?,?,?)");
		ps.setInt(1,element.getId());
                ps.setString(2,element.getIsbn());
                ps.setString(3,element.getTitulo());
                ps.setString(4,Arrays.toString(element.getAutores()).replaceAll("\\[\\]",""));
                ps.setInt(5,element.getAno());
                numero = ps.executeUpdate();


                }catch(SQLException e){
                        e.printStackTrace();
                }finally{
                        try{
                                ps.close();

                        }catch(SQLException e){

                        }
                }

                return numero;
	}

	
}
