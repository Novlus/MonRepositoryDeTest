package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationVilleSteDeb 
{
	@Test
	public void TestVillePrepoSteDeb() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Ste Metz", "Suisse");
		assertEquals("Sainte-Metz",NormalisationVille.setVilleNormaliseStedeb(cl1));
	}
}
