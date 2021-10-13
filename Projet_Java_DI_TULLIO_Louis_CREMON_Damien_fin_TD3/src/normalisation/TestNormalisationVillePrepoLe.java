package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationVillePrepoLe 
{
	
	@Test
	public void TestVillePrepolemin() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Metz le beau le belle", "Suisse");
		assertEquals("Metz-le-beau-le-belle",NormalisationVille.setVilleNormalisele(cl1));
	}

	@Test
	public void TestVillePrepolemaj() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Metz Le beau Le belle", "Suisse");
		assertEquals("Metz-le-beau-le-belle",NormalisationVille.setVilleNormalisele(cl1));
	}

}
