package Main;

public class Calculadora implements ICalculadora {

	@Override
	public Double soma(Double n1, Double n2) {		
		return n1 + n2;
	}

	@Override
	public Double subtrai(Double n1, Double n2) {
		return n1-n2;
	}

	@Override
	public Double divide(Double n1, Double n2) {
		return n1/n2;
	}

	@Override
	public Double multiplica(Double n1, Double n2) {
		return n1*n2;
	}

}
