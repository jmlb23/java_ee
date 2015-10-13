package net.iessanclemente.xml.Exercicio10;

import java.util.ArrayList;
import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import org.w3c.dom.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;


public class XeraXml{
	

	public static void crea(){
		ArrayList<Pedido> lista = new ArrayList<>();
		for(int i = 0; i<10; i++){
			lista.add(new Pedido(i,"a"+i,new Producto(i,"des"+i,Math.random()*10)));
		}
		try{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document d = db.newDocument();
			//raiz
			Element eraiz = d.createElement("pedidos");
			d.appendChild(eraiz);

			for(int i=0; i<10; i++){
			Element pedido = d.createElement("pedido");
			eraiz.appendChild(pedido);
			//id
			Element idpedido = d.createElement("idpedido");
			idpedido.appendChild(d.createTextNode(""+lista.get(i).getId()));
			pedido.appendChild(idpedido);
			//nome
			Element nomecliente = d.createElement("nomecliente");
			nomecliente.appendChild(d.createTextNode(""+lista.get(i).getNome()));
			pedido.appendChild(nomecliente);
			//producto
			Element producto = d.createElement("producto");
			
			//idProducto
			Element idPro = d.createElement("idproducto");
			idPro.appendChild(d.createTextNode(""+lista.get(i).getProducto().getId()));
			producto.appendChild(idPro);
			//descricion
			Element des = d.createElement("descricion");
			des.appendChild(d.createTextNode(""+lista.get(i).getProducto().getDescricion()));
			producto.appendChild(des);
			
			//prezo
			Element pre = d.createElement("prezo");
			pre.appendChild(d.createTextNode(""+lista.get(i).getProducto().getPrezo()));
			producto.appendChild(pre);
			 
			pedido.appendChild(producto);
			}

			

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(d);
			StreamResult result = new StreamResult(new File("hola.xml"));


			transformer.transform(source, result);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String... args){
		crea();
	}
	
	public static void lee(){
		
	}	
}
