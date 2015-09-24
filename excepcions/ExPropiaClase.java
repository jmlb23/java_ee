package excepcions;
public class ExPropiaClase{
	public int enterNum() throws ExPropia{
		int valor = 0;		
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("Introduce un numero:");
		valor = s.nextInt();
	
		if(valor == 0) throw new ExPropia("metiches 0");
		else return valor;
			
	}
}
