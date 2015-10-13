package probas;

/**
*como funciona ClassFor e relacion co dirver de mysql
*@see <a href="https://github.com/mysql/mysql-connector-j/blob/release/5.1/src/com/mysql/jdbc/Driver.java">mysql Driver.java</a>
*/
public class ClassFor{
	
	//excutase porque esta cargada a clase en memoria e o bloque static xa esta cargado porque
	//os elementos static sempre se cargan o principio
	// driver de mysql precisamente funciona asi
	static{
		System.out.println("hola dende un bloque static");
	}
	//bloque de instancia
	{
		//esto non se executa porque cando se carga hai duas zonas
		//e a zona statica que é para aqueles elementos que son static
		//que so se cargan a primeira vez que se carga en memoria a clase
		//e a zona de instacia que cada vez que se crea unha instancia
		//carga en memoria neste lugar os correspondentes elementos
		//
		System.out.println("non se executa");
	}

	public static void main(String... args){
		try{
			//carga a clase en memoria
		
			Class.forName("probas.ClassFor");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
