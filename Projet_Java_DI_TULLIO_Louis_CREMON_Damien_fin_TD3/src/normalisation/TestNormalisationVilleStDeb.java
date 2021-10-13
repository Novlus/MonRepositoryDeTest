package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationVilleStDeb 
{
	@Test
	public void TestVillePrepoStDeb() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "St Metz", "Suisse");
		assertEquals("Saint-Metz",NormalisationVille.setVilleNormaliseStdeb(cl1));
	}
}
