package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationVilleSt 
{
	@Test
	public void TestVillePrepoSt() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Metz St beau St belle", "Suisse");
		assertEquals("Metz-Saint-beau-Saint-belle",NormalisationVille.setVilleNormaliseSt(cl1));
	}

	

}
