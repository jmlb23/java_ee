public class CCentroEstudos implements CentroEstudos{
	public int numeroAprobados(double... notas){
		return notas.length;
	}
	public int numeroSuspensos(double... notas){
		return notas.length;
	}
	public double notaMedia(double... notas){
		double valor = 0.0;
		for(double valores : notas){
			valor = valor + valores;
		}
		return valor/(notas.length);
	}
	
}
