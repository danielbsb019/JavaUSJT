
public class Quadrilatero extends Poligono {
	
	public Quadrilatero(double base, double altura){
		super(base,altura);
	}

	@Override
	public double area() {
		return super.getBase() * super.getAltura();
	}
	
	@Override
	public double perimetro(){
		return (super.getBase() + super.getAltura() )*2;
     }
	@Override
	public String toString() {
	return "Perimetro: "+perimetro()+"\nArea: "+area(); 
}
	}
