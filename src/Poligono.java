//classe pai
public abstract class Poligono extends Figura {

	private double altura;
	private double base;
	
	
	public Poligono(double altura, double base) {
		
		this.altura = altura; //é instanciado aqui
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}



	
}

