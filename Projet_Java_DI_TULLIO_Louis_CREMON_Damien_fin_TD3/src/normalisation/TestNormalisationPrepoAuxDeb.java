package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationPrepoAuxDeb 
{
	@Test
	public void TestVillePrepoAuxDeb() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Aux Metz", "Suisse");
		assertEquals("Aux-Metz",NormalisationVille.setVilleNormaliseauxdeb(cl1));
	}
}
