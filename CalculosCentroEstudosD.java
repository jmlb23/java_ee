public interface CalculosCentroEstudos extends DatosCentrosEstudos{
	default int numeroDeAprobados(double... notas){
		return notas.length;
	}
	default int numeroDeSuspensos(double... notas){
		return notas.length;
	}
	default double notaMedia(double... notas){
		return notas/notas.length;
	}
}
