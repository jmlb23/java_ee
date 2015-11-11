package modelo.daos;

import modelo.obxetosBase.*;
import java.util.*;
import java.sql.*;

public class PrestamoDao extends AbstractDao<Prestamo>{
	Connection cnn = new Conexion(null).openConnection("jdbc:mysql://localhost/test","root","def456..");
	public PrestamoDao(){
	}
	public ArrayList<Prestamo> selectAll(){
		ArrayList<Prestamo> lista = new ArrayList<>();
		try(PreparedStatement ps = cnn.prepareStatement("Select * from prestamo");
		ResultSet rs = ps.executeQuery();){
			while(rs.next()){
				lista.add(new Prestamo(rs.getInt("idPrestamo"),rs.getInt("idLibro"),rs.getInt("idUsuario"),rs.getDate("data"),rs.getBoolean("devolto")));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return lista;		
	}
        public Prestamo selectOne(int id){
		Prestamo l = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
		ps = cnn.prepareStatement("Select * from prestamo where idPrestamo = ?");
		ps.setInt(1,id);
                rs = ps.executeQuery();
		
			
                        while(rs.next()){
                                l = new Prestamo(rs.getInt("idPrestamo"),rs.getInt("idLibro"),rs.getInt("idUsuario"),rs.getDate("data"),rs.getBoolean("devolto"));
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
		ps = cnn.prepareStatement("Delete from prestamo where idPrestamo = ?");
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
	
        public int updateOne(Prestamo element){
		int numero = 0;
                PreparedStatement ps = null;

                try{
                ps = cnn.prepareStatement("Update prestamo set data = ?,devolto = ? where idPrestamo = ?");
                ps.setDate(1,element.getData());
                ps.setBoolean(2,element.getDevolto());
		ps.setInt(3,element.getIdPrestamo());
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
        public int createOne(Prestamo element){
		int numero = 0;
                PreparedStatement ps = null;

                try{
                ps = cnn.prepareStatement("inset into prestamo(idPrestamo, idLibro, idUsuario, data,devolto) values(?,?,?,?,?)");
                ps.setInt(1,element.getIdPrestamo());
                ps.setInt(2,element.getIdLibro());
                ps.setInt(3,element.getIdUsuario());
                ps.setDate(4,element.getData());
                ps.setBoolean(5,element.getDevolto());
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
