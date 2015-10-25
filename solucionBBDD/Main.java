package solucionBBDD;
import operacions.*;
import java.util.Scanner;
public class Main{
	public static void main(String... args){
		Scanner sca = new Scanner(System.in);
		Alumno s = new Alumno("40601259z","perico","delgado",50);
		Alumno s2 = new Alumno("40601259z","pepe","castaño",60);
		boolean flag = true;
		OperacionsBD o = new OperacionsBD("com.mysql.jdbc.Driver","jdbc:mysql://dbalumnos:3312/a10jesuslb","a10jesuslb","");
		
		o.abrirConexion();
		while(flag){
		switch(menu()){
		
			case 1:
				limpa(100);
				System.out.println("introduce os datos do alumno\nstring\nstring\nstring\nnumero");
				o.engadeAlumno(new Alumno(sca.nextLine(),sca.nextLine(),sca.nextLine(),sca.nextInt()));
			break;
			case 2:
				
				limpa(100);
				System.out.println("introduce o dni do alumno");
				o.borraAlumno(sca.next());
			break;
			case 3:
				limpa(100);
				
				System.out.println("introduce os datos do alumno\nstring\nstring\nstring\nnumero");
				o.modificarAlumno(new Alumno(sca.nextLine(),sca.nextLine(),sca.nextLine(),sca.nextInt()));
			break;
			case 4:
				limpa(100);
				System.out.println("introduce o dni do alumno");
				System.out.println(o.consultaAlumno(sca.next()));
			break;
			case 5:
				limpa(100);
				o.listaAlumnos().stream().forEach(System.out::println);
			break;
			case 6:

			default:
				System.out.println("saindo....");
				flag = false;
			break;
		}
		
		if(o.getErro()!=null)System.out.println(o.getErro());
		}
		o.cerraConexion();

	}

	public static void limpa(int veces){
		for(int i = 0; i< veces; i++)System.out.println();
	}

	public static int menu(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------");
		System.out.println("Elixe a opcion a realizar");
		System.out.println("1 Engade");
		System.out.println("2 borra");
		System.out.println("3 modificar un alumno");
		System.out.println("4 cosultar alumno concreto");
		System.out.println("5 lista todo");
		System.out.println("6 Sair");
		return sc.nextInt();
	}
}
