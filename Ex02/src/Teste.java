import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Teste {
	
	Pais pais, copiaPais;
	int id = 6;
	
	@BeforeEach
	void setUp() {
		pais = new Pais(id, "TesteLegalzao",8000,721721.00);
		copiaPais = new Pais(id, "TesteLegalzao",8000,721721.00);
		System.out.println("Setup");
	}
	
	@Test
	void test00Incluir() {
		System.out.println("Teste Incluir");
		Pais teste = new Pais(id,"Uganda",80000,2176281.00);
		Pais teste_copia = new Pais(id,null,0,0);
		
		teste.incluir();
		teste_copia.carregar();
		
		assertEquals(teste.getNome(),teste_copia.getNome(),"Teste inclusao");
	}
	
	@Test
	void test01Excluir() {
		System.out.println("Teste Excluir");
		pais.excluir();
		copiaPais.carregar();
		
		assertEquals(copiaPais.getId(),-1,"Teste Excluir");
	}
	
  @Test
  void test02Carregar() {
	  System.out.println("teste carregar");
	  Pais consulta=new Pais(4,null,0,0);
	  Pais consultaTeste = new Pais();
	  consulta.carregar();
	  consultaTeste.setNome(consulta.getNome());
	  assertEquals(consulta.getNome(), consultaTeste.getNome(),"Teste Carregar");
	  
  }
	@Test
	void test03Update() {
		System.out.println("Teste Atualizar");
		pais=new Pais();
		pais.setId(2);
		pais.atualizarPais("Babilonia");
		
		copiaPais=new Pais();
		copiaPais.setId(2);
		copiaPais.carregar();
		pais.carregar();
		assertEquals(pais.getNome(), copiaPais.getNome(),"Teste Update");
		pais.atualizarPais("Bolivia");
	
	}	
	
	@Test
	void test04MenorArea() {
		System.out.println("Menor Area");
		pais=new Pais();
		copiaPais=new Pais();
		
		pais.menorArea();
		copiaPais.menorArea();
		assertEquals(pais.getArea(),copiaPais.getArea(),"Menor Area");
		
		
	}
	@Test
	void test05MaiorPopulação() {
		
	System.out.println("Maior População");
	pais=new Pais();
	copiaPais=new Pais();
	
	pais.maiorPopulacao();
	copiaPais.maiorPopulacao();
	assertEquals(pais.getPop(),copiaPais.getPop(),"Maior População");
	
	}
	@Test
	void test06Vetor() {
		System.out.println("teste vetor");
		pais=new Pais();
		String nomes[]=pais.nomes();
		
		assertEquals(nomes.length,3,"vetor");
		
	}
	
	
}
