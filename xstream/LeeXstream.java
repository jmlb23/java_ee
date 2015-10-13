package xstream;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import static net.iessanclemente.stream.Producto.*;
import  net.iessanclemente.stream.*;
import com.thoughtworks.xstream.XStream;
public class LeeXstream{
	
	public static ArrayList<Producto> encher(ArrayList<Producto> lista){
		//so existe neste ambito unha vez o avandona pasa o gc
		//porque temos que darnos conta de que actua o new sobre a variable local
		//é como se fixesemos list = this.lista
		//non hai ningunha referencia a list e pasa o gc
		lista = new ArrayList<>();
		for(int i = 0; i<4; i++){
			lista.add(new Producto(i,"nome "+i,Math.random()*100));
		}
		
		return lista;
	}

	public static void escrebe(ArrayList<Producto> lista){
		File f = new File("/home/jesus/Escritorio/acesoAD/xstream/productos.dat");
		try(
		
			OutputStream os = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(os);
		){
		for(Producto p : lista){
			oos.writeObject(p);
		}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static ArrayList<Producto> lee(){
		ArrayList<Producto> p = new ArrayList<>();
		File f = new File("/home/jesus/Escritorio/acesoAD/xstream/productos.dat");

		try(
			InputStream io = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(io);
		){
		
			while(io.available()>0)
				p.add((Producto)ois.readObject());
		}catch(IOException |ClassNotFoundException e){
			e.printStackTrace();
		}
		return p;
	}

	public static void creaXmlPersoas(){

	}

	public static void main(String... args){
		ArrayList<Producto> lista=null;
		lista = encher(lista);
		escrebe(lista);
		ArrayList<Producto> v = lee();
		try{
			XStream xst = new XStream();
			xst.alias("productos",List.class);
			xst.alias("Producto",Producto.class);

			xst.toXML(v, new FileOutputStream("/home/jesus/Escritorio/acesoAD/xstream/productos.xml"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
