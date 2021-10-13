package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationPrepoLesDeb 
{
	@Test
	public void TestVillePrepoLeDeb() 
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Lès Metz", "Suisse");
		assertEquals("Lès-Metz",NormalisationVille.setVilleNormaliseLesdeb(cl1));
	}
}
