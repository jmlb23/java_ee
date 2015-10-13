package net.iessanclemente.xml;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import java.io.*;
public class LerEmpregado{
	public static void main(String... args){
		try{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document d = db.parse(new java.io.FileInputStream(new java.io.File("/home/jesus/Escritorio/acesoDatos/net/iessanclemente/xml/empregados.xml")));
			System.out.println(d.getDocumentElement().getNodeName());

			for(int i =0; i< d.getChildNodes().getLength();i++){
				System.out.println(d.getChildNodes().item(i));
			}
		}catch( Exception e){
			e.printStackTrace();
		}
	}
}
