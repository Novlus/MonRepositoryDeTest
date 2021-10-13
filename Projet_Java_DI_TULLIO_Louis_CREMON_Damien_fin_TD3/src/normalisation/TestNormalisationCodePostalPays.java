package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationCodePostalPays 
{
	@Test
	public void NormalisationCodePostalPays() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "L-4000", "Nancy", "Belgique");
		assertEquals("4000",NormalisationCodePostal.SetCodePostalNormalisePays(cl1));
	}
}
