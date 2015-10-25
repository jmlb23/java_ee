package main;
import utilidades.*;
import java.util.*;
public class Main{
	public static void main(String... args){
		
		while(menu()!=0){

		}	
	}

	private static int menu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("1 Xestion de Libros");
		System.out.println("2 Xestion de Usuarios");
		System.out.println("3 Xestion de Prestamos");
		System.out.println("0 sair");
		System.out.print("Introduce o numero da opcion que queres ver: ");
		switch(sc.nextInt()){
			case 1:
				limpa(200);
				System.out.println("1 Listar todo");
				System.out.println("2 Selecion un rexistro por id");
				System.out.println("3 Actuliaza un rexistro");
				System.out.println("4 Crea un rexistro");
				System.out.println("5 Elimina un rexistro");
				faiLibro(sc.nextInt());
			break;

			case 2:
		
			break;

			case 3:

			break;
			
			case 0:
				return 0;
		}
		return 1;
	}

	private static void faiLibro(int opcion){
		switch(opcion){
			case 1:
			
			break;
			
			case 2:
			
			break;
			
			case 3:
			
			break;
			
			case 4:
			
			break;
			
			case 5:
			
			break;

			
		}
	}

	private static void faiPersoa(int opcion){

	}
	private static void limpa(int numeroLiña){
		while(numeroLiña > 0){
			System.out.println();
			numeroLiña--;
		}
	}
}
