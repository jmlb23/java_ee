package net.iessanclemente.xml.utilidades;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.DOMSource;

public class UtilidadeXml{
	

	public static Document creaDomBaleiro(){
		Document d= null;
		try{
			DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
			DocumentBuilder df = fac.newDocumentBuilder();
			d = df.newDocument();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return d;
	}

	public static Element creaElementoTexto(String nodo,String contido, Document documento){
		Element el = documento.createElement("nodo");
		
		el.appendChild(documento.createTextNode(contido));
		
		return el;
	}
	
	public static Document XMLaDOM(String nomeDoc){
		Document d = null;
		try{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			db.parse(new File(nomeDoc));
		}catch(Exception e){
			e.printStackTrace();
			d = null;
		}
		return d;
	}
	
	public static void mostraElementoRaiz(Document doc){
		Element e = doc.getDocumentElement();

		//amosar por xanela	
		System.out.println(e.getTagName());
	}
	
	public static void mostraContidoElementos(Element el){
		System.out.println(el.getTagName());
	}

	public static boolean borraElementosEtiqueta(String nome, Document ondeBorra){
		
		try{
			NodeList nd = ondeBorra.getElementsByTagName(nome);

			for(int i = 0; i<nd.getLength();) ondeBorra.removeChild(nd.item(i));
		}catch(Exception e){
			return false;
		}

		return true;
	}
	

	
	public static void DOMaXML(Document doc, String nome){
		try{
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();

			//result entre o transformador e o arquivo
			StreamResult sr = new StreamResult(new File(nome));
			//resource entre o tranformador e o dom
			DOMSource doms = new DOMSource(doc);
			//pasarlle un stream result e un streamSource
			t.transform(doms,sr);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
