package libro;
import java.io.*;
import java.util.Arrays;
public class UtilidadesLibro{
	private Libro[] l;
	

	public UtilidadesLibro(Libro[] l){
		this.l = l;
	}
	
	public static void xerarDatLibro(Libro[] l){
		try{
		File f = new File("libros.dat");
		FileOutputStream fis = new FileOutputStream(f,true);
		if(f.exists() && f.length()>0 ){
			ObjectOutputStream oos = new ObjectOutputStream(fis){
				@Override
				protected void writeStreamHeader(){
					
				}
			};

			for(Libro li : l){
				oos.writeObject(l);
			}
		}else{
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			for(Libro li : l){
				oos.writeObject(l);
			}
			
		}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void mostrarDat(){

		try{
		File f = new File("libros.dat");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		while(ois.available()>0){
			System.out.println(ois.readObject());
		}
		}catch(IOException | ClassNotFoundException e){
			e.printStackTrace();
		}		
	}
	
	public static void main(String... args){
		Libro[] l = new Libro[6];
		int v = 0;
		for(Libro p : l){
		
			l[v] = p = new Libro(""+(Math.random()*10000),""+(Character.valueOf((char)(Math.random()*127))),new String[]{""+(Character.valueOf((char)(Math.random()*127))),""+(Character.valueOf((char)(Math.random()*127)))},((int)Math.random()*10000));
			v++;
		}
		xerarDatLibro(l);
		mostrarDat();
		System.out.println(Arrays.toString(l));
	
	}

}
