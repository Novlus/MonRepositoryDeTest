package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationVilleMaj 
{
	@Test
	public void TestVilleDebSansMaj()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "metz", "Suisse");
		assertEquals("Metz",NormalisationVille.setVilleNormalise(cl1));
	}
	
}
