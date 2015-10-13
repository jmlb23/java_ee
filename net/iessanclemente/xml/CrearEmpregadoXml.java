package net.iessanclemente.xml;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class CrearEmpregadoXml{
	public static void main(String... args){
		String[] apelido={"Fernandez", "Gil","Lopez", "Ramos","Sevilla"};
		int[] dep = {10,15,5,20,25};
		double[] salario = {1000.5,1200,800,1234.56,2000};

		try{
			DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = fac.newDocumentBuilder();
			DOMImplementation imp = db.getDOMImplementation();

			Document doc = imp.createDocument(null,"Empregados",null);
			doc.setXmlVersion("1.0");
			
			for(int i = 0; i<apelido.length; i++){
				//nodo raiz
				Element e = doc.createElement("empregado");
				//facemos un append o nodo raiz
				doc.getDocumentElement().appendChild(e);
				
				Element eID = doc.createElement("id");
				Element eApelido = doc.createElement("apleido");
				Element eDep = doc.createElement("dep");
				Element eSal = doc.createElement("salario");
				e.appendChild(eID);
				e.appendChild(eApelido);
				e.appendChild(eDep);
				e.appendChild(eSal);
				
				Text textoId = doc.createTextNode(""+(i+1));
				eID.appendChild(textoId);
				eApelido.appendChild(doc.createTextNode(apelido[i]));
				eDep.appendChild(doc.createTextNode(""+dep[i]));
				eSal.appendChild(doc.createTextNode(""+salario[i]));
			
				
			}
			Transformer trf =TransformerFactory.newInstance().newTransformer();
			trf.setOutputProperty(OutputKeys.INDENT,"yes");
			trf.setOutputProperty(OutputKeys.ENCODING,"UTF-8");

			//collemolo obxeto da memoria
			Source src = new DOMSource(doc);
			Result rs = new StreamResult(new java.io.File("./empregados2.xml"));
			trf.transform(src,rs);

			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
