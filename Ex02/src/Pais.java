import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Pais {

	private int id;
	private String nome;
	private long pop;
	private double area;
	
	static {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		throw new RuntimeException(e);
		}
		}
	
	
	public Pais() {}
	public Pais(int id, String nome,long pop,double area) {
		this.id=id;
		this.nome=nome;
		this.pop=pop;
		this.area=area;
		
	}
	public Connection obtemConexao() throws SQLException {
		return DriverManager
		.getConnection("jdbc:mysql://localhost/aula02?user=root&password=root");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getPop() {
		return pop;
	}
	public void setPop(long pop) {
		this.pop = pop;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
	
	public void incluir() {
	      String sqlInsert = 
	         "INSERT INTO pais(Id_Pais, Nome_Pais, Populacao_Pais, Area_Pais) VALUES (?, ?, ?,?)";
	   
	      try (Connection conn = obtemConexao();
	    		  PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
	         stm.setInt(1, getId());
	         stm.setString(2, getNome());
	         stm.setLong(3, getPop());
	         stm.setDouble(4, getArea());
	         stm.execute();
	      } 
	      catch (Exception e) {
	         e.printStackTrace();
	         	      } 
	   }
	   // excluir
	   public void excluir() {
	      String sqlDelete = "DELETE FROM pais WHERE  Id_Pais= ?";
	      try (Connection conn = obtemConexao();
	    		  PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
	         stm.setInt(1, getId());
	         stm.execute();
	      } 
	      catch (Exception e) {
	         e.printStackTrace();
	         
	      } 
	   }
		//atualizar Pais
	   public void atualizarPais( String NovoPais) {
	      String sqlUpdate = "UPDATE pais SET Nome_Pais = ? WHERE Id_Pais = ?";
	    
	      try (Connection conn = obtemConexao();
	    		  PreparedStatement stm = conn.prepareStatement(sqlUpdate);){
	         stm.setString(1, NovoPais);
	         stm.setInt(2, getId());
	      
	         stm.execute();
	      } 
	      catch (Exception e) {
	         e.printStackTrace();
	         
	      } 
	   }
	   // carregar
	   public void carregar() {
	      String sqlSelect = 
	         "SELECT * FROM pais WHERE Id_Pais = ?";
	   
	      try (Connection conn = obtemConexao();
	    		  PreparedStatement stm = conn.prepareStatement(sqlSelect);){
	         stm.setInt(1, getId());
	        
	        try (ResultSet rs = stm.executeQuery();){
	         
	            if (rs.next()) {
	               this.setId(rs.getInt("Id_Pais"));
	               this.setNome(rs.getString("Nome_Pais"));
	               this.setArea(rs.getDouble("Area_Pais"));
	               this.setPop(rs.getLong("Populacao_Pais"));
	            }else {
	            	this.setId(-1);
	            }
	         } 
	         catch (Exception e) {
	            e.printStackTrace();
	         }
	      }
	      catch (SQLException e1) {
	         System.out.print(e1.getStackTrace());
	      }
	   } 
	   
	   
	   
	   // listar pais com maior população
	   public void maiorPopulacao() {
	      String sqlSelect = 
	         "SELECT * FROM pais where Populacao_Pais = (select max(Populacao_Pais) from pais) ";
	   
	      try (Connection conn = obtemConexao(); 
	    		  PreparedStatement stm = conn.prepareStatement(sqlSelect);){
	         try (ResultSet rs = stm.executeQuery();){
	         
	            while (rs.next()) {
	            	
	               setId(rs.getInt("Id_Pais"));
	               setNome(rs.getString("Nome_Pais"));
	               setPop(rs.getLong("Populacao_Pais"));
	               setArea(rs.getDouble("Area_Pais"));
	               
	            }
	         
	         } 
	         catch (Exception e) {
	            e.printStackTrace();
	         }
	      }
	      catch (SQLException e1) {
	         System.out.print(e1.getStackTrace());
	      }
	   }
	   public void menorArea() {
		      String sqlSelect = 
		         "SELECT * FROM pais where Area_Pais = (select min(Area_Pais) from pais) ";
		   
		      try (Connection conn = obtemConexao(); 
		    		  PreparedStatement stm = conn.prepareStatement(sqlSelect);){
		         try (ResultSet rs = stm.executeQuery();){
		         
		            while (rs.next()) {
		               
		               setId(rs.getInt("Id_Pais"));
		               setNome(rs.getString("Nome_Pais"));
		               setPop(rs.getLong("Populacao_Pais"));
		               setArea(rs.getDouble("Area_Pais"));
		                }
		         
		         } 
		         catch (Exception e) {
		            e.printStackTrace();
		         }
		      }
		      catch (SQLException e1) {
		         System.out.print(e1.getStackTrace());
		      }
	   }

	   public String[] nomes() {
		      String sqlSelect = 
		         "SELECT Nome_Pais FROM pais order by Nome_Pais ";
		      
		      int cont=0;
		      String[] lista = new String[3];
		      try (Connection conn = obtemConexao(); 
		    		  PreparedStatement stm = conn.prepareStatement(sqlSelect);){
		         try (ResultSet rs = stm.executeQuery();){
		         
		            while (rs.next() && cont< 3) {
		            	
		            	lista[cont] = rs.getString("Nome_Pais");
		            	cont ++;
		            }
		         
		       
		         } 
		         catch (Exception e) {
		            e.printStackTrace();
		         }
		      }
		      catch (SQLException e1) {
		         System.out.print(e1.getStackTrace());
		      }
	   return lista;
	   }
	   
	// toString
	   public String toString() {
	      return "PAIS [id=" + getId() + ", nome=" + nome + ", população="
	         	+ pop +"area ="+area+ "]";
	   }
	

}
