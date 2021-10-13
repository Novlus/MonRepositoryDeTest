package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationPrepoSousDeb 
{
	@Test
	public void TestVillePrepoSousDeb() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Sous Metz", "Suisse");
		assertEquals("Sous-Metz",NormalisationVille.setVilleNormaliseSousdeb(cl1));
	}
}
