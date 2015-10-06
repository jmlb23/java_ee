package net.iessanclemente.xml.axenda;
import static net.iessanclemente.xml.utilidades.UtilidadeXml.*;
import org.w3c.dom.*;
public class LeeAxenda{
	
	/*
		
	15. Escribe unha clase de nome ProcesaAxenda, que usa os métodos da clase UtilidadesXML para realizar as seguintes tarefas (engade na anterior clase os métodos que consideres necesarios):
	1 Carga en memoria usando DOM o ficheiro axenda.xml
	2 Mostra por pantalla o nome do elemento raíz.
	3 Mostra por pantalla o contido do documento.
	4 Borra os elementos de nome telefono e xera axenda1.xml co contido actual do documento en memoria.
	5 Borra os elementos de tipo enderezo e xera axenda2.xml co contido actual do documento en memoria.
	6 Engade elementos de tipo correoe e xera axenda3.xml co contido actual do documento en memoria.
	*/
	public static void main(String... args){
		Document d = XMLaDOM("/home/jesus/Escritorio/AcesoAD/net/iessanclemente/xml/axenda/axenda.xml");

		mostraElementoRaiz(d);
		amosaDoc(d);
		Document borrado = borraElementosEtiqueta("telefono",d);
		DOMaXML(borrado,"/home/jesus/Escritorio/AcesoAD/net/iessanclemente/xml/axenda/axenda1.xml");
		Document borrado2 = borraElementosEtiqueta("enderezo",d);
		DOMaXML(borrado2,"/home/jesus/Escritorio/AcesoAD/net/iessanclemente/xml/axenda/axenda2.xml");
		
		
	}

	
}
