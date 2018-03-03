import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Figura> figuras = new ArrayList<>();
		
		Triangulo triangulo = new Triangulo(5,7);
		Quadrado quadrado = new Quadrado(2,2);
		Retangulo retangulo = new Retangulo(5,7);
		Trapezio trapezio = new Trapezio(5,7.4,5,1);
		Circulo circulo = new Circulo(5);
		Esfera esfera = new Esfera(circulo);
		Cilindro cilindro = new Cilindro(circulo,4);
		Piramide piramide = new Piramide(triangulo,5);
		
		
		figuras.add(cilindro);
		figuras.add(piramide);
		figuras.add(esfera);
		figuras.add(triangulo);
		figuras.add(quadrado);
		figuras.add(retangulo);
		figuras.add(trapezio);
		figuras.add(circulo);
		
		
		for(Figura fig:figuras) {
			
			String nomeClasse = fig.getClass().getName();
			System.out.println("\n"+ nomeClasse + " : "+fig.toString());
			
		}

	}

}
