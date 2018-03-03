
public class Esfera extends TresD {
  
	private double r,p;
	
	public Esfera (Circulo circulo) {
		this.r= circulo.getRaio();
		this.p=circulo.getPi();
	}
	
	   
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return  (p *(Math.pow(r,3)*4))/3;
	}
	

}
