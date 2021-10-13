package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationVoieAvenue 
{
@Test
	
	public void NormalisationVoieAvenue_avDeb()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "av. de la fortune", "54000", "Metz", "Suisse");
		assertEquals("avenue de la fortune",NormalisationVoie.setVoieNormaliseavenue(cl1));
	}

	@Test
	public void NormalisationVoieAvenue_av()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "l' av. de la fortune", "54000", "Metz", "Suisse");
		assertEquals("l' avenue de la fortune",NormalisationVoie.setVoieNormaliseavenue(cl1));
	}
}
