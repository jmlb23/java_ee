package net.iessanclemente.xml.utilidades;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.DOMSource;

public class UtilidadeXml{
	

	public static Document creaDomBaleiro(String root){
		Document d= null;
		try{
			DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
			DocumentBuilder df = fac.newDocumentBuilder();
			d = df.newDocument();
			d.setXmlVersion("1.0");
			Element e = d.createElement(root);
			d.appendChild(e);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return d;
	}

	public static Element creaElementoTexto(String nodo,String contido, Document documento){
		Element el = documento.createElement(nodo);
		
		el.appendChild(documento.createTextNode(contido));
		
		return el;
	}
	public static Element creaElementoTexto(String nodo,String contido, Document documento,String atributo, String atribValor){
		Element el = documento.createElement(nodo);
		
		el.appendChild(documento.createTextNode(contido));
		el.setAttribute(atributo, atribValor);
		return el;
	}
	public static Element creaElemento(String nodo, Document documento){
		Element el = documento.createElement(nodo);
		
		return el;
	}
	
	
	public static Document XMLaDOM(String nomeDoc){
		Document d = null;
		try{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			d = db.parse(new File(nomeDoc));
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

	public static Document borraElementosEtiqueta(String nome, Document ondeBorra){
		
		try{
			NodeList nodeList = ondeBorra.getElementsByTagName(nome);
			for (int i = 0; i < nodeList.getLength();) {
             		 		Node n = nodeList.item(0).getParentNode();
					Element el = (Element)n;
         	           		el.removeChild(nodeList.item(0));
            		}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}

		return ondeBorra;
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
			t.setOutputProperty(OutputKeys.INDENT, "yes");
			t.transform(doms,sr);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void amosaDoc(Document doc){
		try{
			//usamos o tranformador para cargar en memoria
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			StreamResult result = new StreamResult(new StringWriter());
			DOMSource source = new DOMSource(doc);
			//cargo o documento no writer
			transformer.transform(source, result);
			//imprimo o buffer
			String xmlString = result.getWriter().toString();
			System.out.println(xmlString);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
