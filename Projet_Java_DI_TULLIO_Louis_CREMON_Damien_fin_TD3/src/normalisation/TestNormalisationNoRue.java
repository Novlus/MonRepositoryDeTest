package normalisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modele.metier.Client;

public class TestNormalisationNoRue 
{
	@Test
	public void TestNormalisationNoRueVirgule()
	{
		Client cl1 = new Client( "CREMON", "Mathieu", "8", "boulevard des lilas", "54000", "Metz", "Suisse");
		assertEquals("8, ",NormalisationNoRue.SetNoRueVirguleFin(cl1));
	}
}
