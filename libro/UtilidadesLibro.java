package libro;
import java.io.*;
import java.util.*;
import javax.xml.parsers.*;//parser de xml a dom
import javax.xml.transform.*;// parser de dom a xml
import javax.xml.transform.stream.*; //para o resoult e o source
import javax.xml.transform.dom.*; //para o resoult e o source
import org.w3c.dom.*;
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
				oos.writeObject(li);
			}
		}else{
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			for(Libro li : l){
				oos.writeObject(li);
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
		while(true){
			try{
			System.out.println(ois.readObject());
			}catch(EOFException e){
				System.out.println("fin");
				return;
			}
		}
		}catch(IOException | ClassNotFoundException e){
			e.printStackTrace();
		}		
	}
	public static void xerarXmlDom() throws Exception{
		List<Libro> lista = new ArrayList<>();
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document d = db.newDocument();
		
		
		try{
                File f = new File("libros.dat");
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
		Object o=null;
                while(o==null){
                        try{
                        lista.add((Libro)ois.readObject());
			
                        }catch(EOFException e){
                                o=e;
                        }
                }
		ois.close();
                }catch(IOException | ClassNotFoundException e){
                        e.printStackTrace();
                }
		d.setXmlVersion("1.0");
		Element root = d.createElement("libros");
		for(Libro lib : lista){
			Element eLib = d.createElement("libro");
			//isbn
			Element eIsbn = d.createElement("isbn");
			eIsbn.appendChild(d.createTextNode(lib.getIsbn()));
			eLib.appendChild(eIsbn);
			//titulo
			Element eTit = d.createElement("titulo");
			eTit.appendChild(d.createTextNode(lib.getTitulo()));
			eLib.appendChild(eTit);
			
			Element eAtrs = d.createElement("autores");
			for(String autor : lib.getAutores()){
				Element eAut = d.createElement("autor");
				eAut.appendChild(d.createTextNode(autor));
				eAtrs.appendChild(eAut);
			}
			
			eLib.appendChild(eAtrs);
			//ano	
			Element eAno = d.createElement("ano");
			eAno.appendChild(d.createTextNode(lib.getAno().toString()));
			eLib.appendChild(eAno);
			
			root.appendChild(eLib);
			//agrego o documento
		}
		d.appendChild(root);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		DOMSource dr = new DOMSource(d);
		StreamResult ss = new StreamResult(new File("libro.xml"));
		t.transform(dr,ss);
			
        }
	
	public static void main(String... args){
		Libro[] l = new Libro[6];
		int v = 0;
		for(Libro p : l){
		
			l[v] = p = new Libro(""+((int)(Math.random()*10000)),"royo"+v,new String[]{"romo"+v,"roco"+v},((int)(Math.random()*10000)));
			v++;
		}
		xerarDatLibro(l);
		mostrarDat();
		try{
			xerarXmlDom();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
