package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationBelg 
{
	@Test
	public void NormalisationBelg() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Nancy", "belgium");
		assertEquals("Belgique",NormalisationPays.setPaysNormaliseBelg(cl1));
	}
	
	@Test
	public void NormalisationBelg2()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Nancy", "Belgium");
		assertEquals("Belgique",NormalisationPays.setPaysNormaliseBelg(cl1));
	}
}
