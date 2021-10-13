package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationCodePostalLongueur 
{
	@Test
	public void NormalisationCodePostalLongueur() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "4000", "Nancy", "Belgique");
		assertEquals("04000",NormalisationCodePostal.setCodePostalNormalise(cl1));
	}
}
