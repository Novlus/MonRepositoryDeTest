package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationVilleSte 
{
	@Test
	public void TestVillePrepoSt() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Metz Ste beau Ste belle", "Suisse");
		assertEquals("Metz-Sainte-beau-Sainte-belle",NormalisationVille.setVilleNormaliseSte(cl1));
	}
}
