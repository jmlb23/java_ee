public interface CalculosCentroEstudos extends DatosCentrosEstudos{
	int numeroAprobados(double... notas);
	int numeroSuspensos(double... notas);
	double notaMedia(double... notas);
}
