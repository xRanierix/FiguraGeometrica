
public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(double altura, double base) {
		super(altura, base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {

		return super.getAltura() * super.getBase();
	}

	@Override
	public double calcDiag() {
		double calc = Math.pow(super.getAltura(), 2)  +   Math.pow(super.getBase(), 2);  // base e altura ao quadrado sendo somados
		return Math.sqrt(calc) ; 	// raiz quadrada do resultado
		}

	@Override
	public double perimetro() {
		
		return 2*super.getBase() + 2*super.getAltura();
	}

	@Override
	public String toString() {
		return "Retangulo [area()=" + area() + ", calcDiag()=" + calcDiag() + ", perimetro()=" + perimetro() + "]";
	}
	
	
}
