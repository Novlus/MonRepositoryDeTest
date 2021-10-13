package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationVoieBoulevard 
{
	@Test
	
	public void NormalisationVoieBoulevard_bdDeb()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "bd de la fortune", "54000", "Metz", "Suisse");
		assertEquals("boulevard de la fortune",NormalisationVoie.setVoieNormaliseboulevard(cl1));
	}
	@Test
	public void NormalisationVoieBoulevard_bd()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "le bd de la fortune", "54000", "Metz", "Suisse");
		assertEquals("le boulevard de la fortune",NormalisationVoie.setVoieNormaliseboulevard(cl1));
	}
	@Test
	
	public void NormalisationVoieBoulevard_boulDeb()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "boul de la fortune", "54000", "Metz", "Suisse");
		assertEquals("boulevard de la fortune",NormalisationVoie.setVoieNormaliseboulevard(cl1));
	}
	
	@Test
	public void NormalisationVoieBoulevard_boul()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "le boul de la fortune", "54000", "Metz", "Suisse");
		assertEquals("le boulevard de la fortune",NormalisationVoie.setVoieNormaliseboulevard(cl1));
	}
	
	@Test
	
	public void NormalisationVoieBoulevard_boul2Deb()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "boul. de la fortune", "54000", "Metz", "Suisse");
		assertEquals("boulevard de la fortune",NormalisationVoie.setVoieNormaliseboulevard(cl1));
	}
	@Test
	public void NormalisationVoieBoulevard_boul2()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "le boul. de la fortune", "54000", "Metz", "Suisse");
		assertEquals("le boulevard de la fortune",NormalisationVoie.setVoieNormaliseboulevard(cl1));
	}
}
