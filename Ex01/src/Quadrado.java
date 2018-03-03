
public class Quadrado extends Quadrilatero implements Diagonal{

	public Quadrado(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(super.getBase(), 2)*2);
	}
	

}
