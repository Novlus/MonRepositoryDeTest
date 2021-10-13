package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationVilleSur 
{
	@Test
	public void TestVillePrepoSurmin() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Metz sur beau sur belle", "Suisse");
		assertEquals("Metz-sur-beau-sur-belle",NormalisationVille.setVilleNormalisesur(cl1));
	}

	@Test
	public void TestVillePrepoSurmaj() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Metz Sur beau Sur belle", "Suisse");
		assertEquals("Metz-sur-beau-sur-belle",NormalisationVille.setVilleNormalisesur(cl1));
	}
}
