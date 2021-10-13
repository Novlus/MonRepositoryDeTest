package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationVoieFaubourg 
{
	@Test
	
	public void NormalisationVoieFaubourg_faubDeb()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "faub. de la fortune", "54000", "Metz", "Suisse");
		assertEquals("faubourg de la fortune",NormalisationVoie.setVoieNormalisefaubourg(cl1));
	}

	@Test

	public void NormalisationVoieFaubourg_faub()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "le faub. de la fortune", "54000", "Metz", "Suisse");
		assertEquals("le faubourg de la fortune",NormalisationVoie.setVoieNormalisefaubourg(cl1));
	}
	
@Test
	
	public void NormalisationVoieFaubourg_fgDeb()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "fg de la fortune", "54000", "Metz", "Suisse");
		assertEquals("faubourg de la fortune",NormalisationVoie.setVoieNormalisefaubourg(cl1));
	}

	@Test

	public void NormalisationVoieFaubourg_fg()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "le fg de la fortune", "54000", "Metz", "Suisse");
		assertEquals("le faubourg de la fortune",NormalisationVoie.setVoieNormalisefaubourg(cl1));
	}
}
