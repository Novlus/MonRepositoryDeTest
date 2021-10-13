package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationPaysPrepoADeb 
{
	@Test
	public void TestVillePrepoADeb() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "A Metz", "Suisse");
		assertEquals("À-Metz",NormalisationVille.setVilleNormaliseadeb(cl1));
	}
}
