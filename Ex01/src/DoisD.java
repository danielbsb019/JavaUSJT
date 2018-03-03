
public abstract class DoisD extends Figura {
	 
	public abstract double area();
	 public abstract double perimetro();
	 	 
	 @Override
		public String toString() {
		return "Perimetro: "+perimetro()+"\nArea: "+area(); 
	}
}

