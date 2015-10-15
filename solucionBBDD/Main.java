package solucionBBDD;
import operacions.*;
public class Main{
	public static void main(String... args){

		Alumno s = new Alumno("40601259z","perico","delgado",50);
		Alumno s2 = new Alumno("40601259z","pepe","castaño",60);

		OperacionsBD o = new OperacionsBD("com.mysql.jdbc.Driver","jdbc:mysql://dbalumnos:3312/a10jesuslb","a10jesuslb","");
		o.abrirConexion();
		o.modificarAlumno(s2);
		for(Alumno a : o.listaAlumnos()){
			System.out.println(a);
		}
		o.cerraConexion();

		System.out.println(s);
	}
}
