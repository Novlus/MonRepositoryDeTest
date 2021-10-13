package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationSuisse 
{
	@Test
	public void normalisationSuisse ()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Nancy", "Switzerland");
		assertEquals("Suisse",NormalisationPays.setPaysNormaliseSuisse(cl1));
	}
	
	@Test
	public void normalisationSuisse2 ()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Nancy", "switzerland");
		assertEquals("Suisse",NormalisationPays.setPaysNormaliseSuisse(cl1));
	}
	
}
