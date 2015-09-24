package excepcions;
public class ExPropiaProba{
	public static void main(String... args){
		System.out.println("Ola");
		while(true){
			try{
				new ExPropiaClase().enterNum();
			}catch(ExPropia e){
				System.out.println(e.getMessage());
			}
		}
	}
}
