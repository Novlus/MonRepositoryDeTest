package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationPrepoAux 
{
	@Test
	public void TestVillePrepoAuxmin() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Metz aux beau aux belle", "Suisse");
		assertEquals("Metz-aux-beau-aux-belle",NormalisationVille.setVilleNormaliseaux(cl1));
	}

	@Test
	public void TestVillePrepoAuxmaj() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Metz Aux beau Aux belle", "Suisse");
		assertEquals("Metz-aux-beau-aux-belle",NormalisationVille.setVilleNormaliseaux(cl1));
	}
}
