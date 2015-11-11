package modelo.daos;

import modelo.obxetosBase.*;
import java.util.*;
import java.sql.*;

public class UsuarioDao extends AbstractDao<Usuario>{
	Connection cnn = new Conexion(null).openConnection("jdbc:mysql://localhost/test","root","def456..");	
	public ArrayList<Usuario> selectAll(){
		ArrayList<Usuario> lista = new ArrayList<>();
		try(PreparedStatement ps = cnn.prepareStatement("Select * from usuario");
		ResultSet rs = ps.executeQuery();){
			while(rs.next()){
				lista.add(new Usuario(rs.getInt("idUsuario"),rs.getString("DNI"),rs.getString("nome"),rs.getString("correoe")));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return lista;		
	}
        public Usuario selectOne(int id){
		Usuario l = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
		ps = cnn.prepareStatement("Select * from usuario where idUsuario = ?");
		ps.setInt(1,id);
                rs = ps.executeQuery();
		
			
                        while(rs.next()){
                                l = new Usuario(rs.getInt("idUsuario"),rs.getString("DNI"),rs.getString("nome"),rs.getString("correoe"));
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
		ps = cnn.prepareStatement("Delete from usuario where idUsuario = ?");
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
	
        public int updateOne(Usuario element){
		int numero = 0;
                PreparedStatement ps = null;

                try{
                ps = cnn.prepareStatement("Update libros set ISBN = ?,titulo = ?,autores = ?, ano = ? where idUsuario = ?");
                ps.setString(1,element.getDni());
                ps.setString(2,element.getNome());
                ps.setString(3,element.getCorreoe());
		ps.setInt(4,element.getId());
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
        public int createOne(Usuario element){
		int numero = 0;
                PreparedStatement ps = null;

                try{
                ps = cnn.prepareStatement("inset into usuario(idUsuario, DNI, nome, correoe) values(?,?,?,?)");
                ps.setInt(1,element.getId());
                ps.setString(2,element.getDni());
                ps.setString(3,element.getNome());
                ps.setString(4,element.getCorreoe());
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
