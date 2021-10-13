package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationPrepoA 
{
	@Test
	public void TestVillePrepoAmin() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Metz à beau à belle", "Suisse");
		assertEquals("Metz-à-beau-à-belle",NormalisationVille.setVilleNormalisea(cl1));
	}

	@Test
	public void TestVillePrepoAmaj() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Metz A beau A belle", "Suisse");
		assertEquals("Metz-à-beau-à-belle",NormalisationVille.setVilleNormalisea(cl1));
	}
}
