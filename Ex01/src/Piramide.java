
public class Piramide extends TresD{

	 private double altura, ab;
	 
	 public Piramide (Triangulo triangulo ,double altura) {
			this.altura = altura;
			this.ab = triangulo.area();
			}
	 
			
		    
	 
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		
		return (ab*altura)/3;
	}

}
