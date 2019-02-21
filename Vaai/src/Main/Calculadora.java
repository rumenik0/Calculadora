package Main;

public class Calculadora implements ICalculadora {

	@Override
	public Double somar(String n1, String n2) {
		return Double.valueOf(n1) + Double.valueOf(n1);
	}

	@Override
	public Double dividir(String n1, String n2) {
		return Double.valueOf(n1) / Double.valueOf(n1);
	}

	@Override
	public Double raizQuadrada(String n1) {
		return Double.valueOf(n1) * Double.valueOf(n1) ;
	}



}
