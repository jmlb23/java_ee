package net.iessanclemente.xml.axenda;
import net.iessanclemente.xml.utilidades.*;
import org.w3c.dom.*;
import static net.iessanclemente.xml.utilidades.UtilidadeXml.*;

public class CreaAxenda{

	public static void main(String... args){
			
		String[] contactos = {"1","2","3","4","5","6"};
		String[] nome ={"pepe","xoan","ramon","antonio","breixo","ramiro"};
		String[] telefono ={"1111","2222","3333","4444","5555","6666"};
		String[] rua = {"rua 1","rua 2","rua 3", "rua 4", "rua 5", "rua 6"};
		String[] numero = {"1","2","3","4","5","6"};
				
		
		
		Document d = creaDomBaleiro("axenda");
			
		for(int i =0; i<6; i++){
			Element sub = d.createElement("contacto");
			sub.setAttribute("id",contactos[i]);
			//nome
			sub.appendChild(creaElementoTexto("nome",nome[i],d));
			//telefono
			sub.appendChild(creaElementoTexto("telefono",telefono[i],d));
			//enderezo
			Element subSub = d.createElement("enderezo");
			subSub.appendChild(creaElementoTexto("rua",rua[i],d));
			subSub.appendChild(creaElementoTexto("numero",numero[i],d));
			sub.appendChild(subSub);
			d.getFirstChild().appendChild(sub);
		}
		DOMaXML(d,"/home/jesus/Escritorio/AcesoAD/net/iessanclemente/xml/axenda/proba.xml");
		/*

		<axenda>
     			<contacto id="1">
    			<nome>Luis</nome>
			<telefono>222222222</telefono>
			<enderezo>
	      			<rua>rua Nova </rua>
	      			<numero>3</numero>
			</enderezo>
 			 </contacto>
 	 	<contacto id="2">
 		 ....
 	 	</contacto>
		...
		</axenda>
		*/
	}
}
