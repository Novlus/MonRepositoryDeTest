
	package normalisation;

	import static org.junit.Assert.assertArrayEquals;
	import static org.junit.Assert.assertEquals;

	import org.junit.Test;

	import modele.metier.Client;
	public class TestNormalisationLux
	{
		@Test
		public void normalisationLux ()
		{
			Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Nancy", "letzebuerg");
			assertEquals("Luxembourg",NormalisationPays.setPaysNormaliseLux(cl1));
		}
		
		@Test
		public void normalisationLux2 ()
		{
			Client cl1 = new Client( "CREMON", "Mathieu", "8 boulevard", "Fauborg", "54000", "Nancy", "Letzebuerg");
			assertEquals("Luxembourg",NormalisationPays.setPaysNormaliseLux(cl1));
		}
	}

