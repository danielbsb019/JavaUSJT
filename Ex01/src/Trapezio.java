
public class Trapezio extends Quadrilatero{

	 double baseMenor,lado;
	 
	public Trapezio(double base, double altura,double baseMenor, double lado) {
		super(base, altura);
		this.baseMenor=baseMenor;
		this.lado=lado;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double area() {
		
		return ((super.getBase()+baseMenor)*(super.getAltura()))/2;
				}
	@Override
	public double perimetro() {
		return (super.getBase()+baseMenor)+lado*2;
	}
	
	@Override
	public String toString() {
	return "Perimetro: "+perimetro()+"\nArea: "+area(); 
}
    
}
