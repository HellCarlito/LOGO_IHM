package TestsUnitaires;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import model.*;

public class ClasseTest {
	
	 /**
	 * Attributs	
	 */
	  private Classe classe1,classe2;
	  private Enseignant enseignant1;
	  private Eleve eleve1,eleve2;
	  
	  /**
	   * @throws java.lang.Exception
	  */
	  @Before
	  public void setUp() throws Exception {
	   	enseignant1=new Enseignant("Robichon","Yoline");
	   	classe1=new Classe("CM1",enseignant1);
//	   	eleve1=new Eleve("Beaubeyrot","Agathe");
//	   	eleve2=new Eleve("Pouvreau","Chloé");
//	   	classe1.ajouterEleve(eleve1);
//	   	classe1.ajouterEleve(eleve2);
	  }
	  
	  /**
	   * @throws java.lang.Exception
	  */
	  @After
	  public void tearDown() throws Exception {
	  }
	  
	  /*
	   * teste le consructeur et le getNomClasse
	   */
	  @Test
	  public void verifyNomClasse(){
		  assertEquals(classe1.getNomClasse(), "CM1");
	  }
	  
	  /*
	   * teste le consructeur et le getEnseignant
	   */
	  @Test
	  public void verifyNomEnseigantClasse(){
		  assertEquals(classe1.getEnseignant().getNom(), "Robichon");
		  assertEquals(classe1.getEnseignant().getPrenom(), "Yoline");
	  }
	  
//	  /*
//	   * teste le consructeur et le getEnseignant
//	   */
//	  @Test
//	  public void verifyAddEleve(){  
//	  }
	
}
