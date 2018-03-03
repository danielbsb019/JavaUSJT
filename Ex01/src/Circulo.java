
public class Circulo extends DoisD{

	private double pi,raio;
	
	public Circulo (double raio) {
		this.raio=raio;
		pi=Math.PI;
	}
	
	
	
	public double getPi() {
		return pi;
	}



	public void setPi(double pi) {
		this.pi = pi;
	}



	public double getRaio() {
		return raio;
	}



	public void setRaio(double raio) {
		this.raio = raio;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi*Math.pow(raio,2);
	}

	@Override
	public String toString() {
	return "Perimetro: "+perimetro()+"\nArea: "+area(); 
}


	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*pi*raio;
	}
	
	
 
 
	  
}
