package persoa;
import java.util.ArrayList;
import java.io.*;
public class CreaDatPersoas{
	
	public static ArrayList<Persoa> encher(ArrayList<Persoa> lista){
		//so existe neste ambito unha vez o avandona pasa o gc
		lista = new ArrayList<>();
		for(int i = 0; i<4; i++){
			lista.add(new Persoa("persoa"+i,(int)(Math.random()*100)));
		}
		
		return lista;
	}

	public static void escrebe(ArrayList<Persoa> lista){
		File f = new File("Persoas.dat");
		try(
		
			OutputStream os = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(os);
		){
		for(Persoa p : lista){
			oos.writeObject(p);
		}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void lee(ArrayList<Persoa> lista){
		File f = new File("Persoas.dat");

		try(
			InputStream io = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(io);
		){
		
			while(io.available()>0)
				System.out.println(ois.readObject());
		}catch(IOException |ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	public static void main(String... args){
		ArrayList<Persoa> lista=null;
		lista = encher(lista);
		escrebe(lista);
		lee(lista);
	}
}
