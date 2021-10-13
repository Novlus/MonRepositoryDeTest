package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationVillePrepoSous 
{
	@Test
	public void TestVillePrepoSousmin() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Metz sous beau sous belle", "Suisse");
		assertEquals("Metz-sous-beau-sous-belle",NormalisationVille.setVilleNormalisesous(cl1));
	}

	@Test
	public void TestVillePrepoSousmaj() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Metz Sous beau Sous belle", "Suisse");
		assertEquals("Metz-sous-beau-sous-belle",NormalisationVille.setVilleNormalisesous(cl1));
	}

}
