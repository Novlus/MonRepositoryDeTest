package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationVoiePlace 
{
@Test
	
	public void NormalisationVoiePlace_plDeb()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "pl. de la fortune", "54000", "Metz", "Suisse");
		assertEquals("place de la fortune",NormalisationVoie.setVoieNormaliseplace(cl1));
	}

	@Test

	public void NormalisationVoiePlace_pl()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "le pl. de la fortune", "54000", "Metz", "Suisse");
		assertEquals("le place de la fortune",NormalisationVoie.setVoieNormaliseplace(cl1));
	}
}
