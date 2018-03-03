
public class Retangulo extends Quadrilatero implements Diagonal {

	public Retangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(super.getBase(), 2)*2);
	}
	
	

}
