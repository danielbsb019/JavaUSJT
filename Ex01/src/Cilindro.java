
public  class Cilindro extends TresD {

	private double a,b,c;
	//a=altura
	
	public Cilindro (Circulo circulo,double a) {
		this.b= circulo.getRaio();
		this.c=circulo.getPi();
	    this.a=a;
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return (c * Math.pow(b, 2))* a;
	}

}
