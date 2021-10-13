package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationVilleSurDeb 
{
	@Test
	public void TestVillePrepoSurDeb() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Sur Metz", "Suisse");
		assertEquals("Sur-Metz",NormalisationVille.setVilleNormaliseSurdeb(cl1));
	}
}
