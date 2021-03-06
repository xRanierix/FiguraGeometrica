
public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double lado) { // base recebeu lado e altura recebeu lado tamb�m (do Poligono)
		super(lado, lado); // manda pro construtor do pai

	}

	@Override
	public double area() { // subescrevi o m�todo area da classe Figura

		return super.getAltura() * super.getBase();
	}

	@Override
	public double calcDiag() {

		return super.getAltura() * Math.sqrt(2);
	}

	@Override
	public double perimetro() {

		return 4 * super.getBase();
	}

	@Override
	public String toString() {
		return "Quadrado [area()=" + area() + ", calcDiag()=" + calcDiag() + ", perimetro()=" + perimetro() + "]";
	}

}
