
public class NaoQuadrilatero extends Poligono {

	public NaoQuadrilatero(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return (super.getBase()*super.getAltura())/2;
	}
	
	@Override
	public double perimetro() {
		double hipotenusa = Math.sqrt(Math.pow(super.getBase(),2)+ Math.pow(super.getAltura(), 2));
		return (hipotenusa+super.getBase()+super.getAltura());
	}
	
	@Override
	public String toString() {
	return "Perimetro: "+perimetro()+"\nArea: "+area(); 
}
	
}
