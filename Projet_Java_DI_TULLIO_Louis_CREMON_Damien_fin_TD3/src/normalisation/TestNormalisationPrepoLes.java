package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationPrepoLes 
{
	@Test
	public void TestVillePrepolesmin() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Metz lès beau lès belle", "Suisse");
		assertEquals("Metz-lès-beau-lès-belle",NormalisationVille.setVilleNormaliseles(cl1));
	}

	@Test
	public void TestVillePrepolesmaj() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Metz Lès beau Lès belle", "Suisse");
		assertEquals("Metz-lès-beau-lès-belle",NormalisationVille.setVilleNormaliseles(cl1));
	}
}
