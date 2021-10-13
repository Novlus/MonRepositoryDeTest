package normalisation;

import modele.metier.Client;

public class NormalisationNoRue 
{
	public static String SetNoRueVirguleFin(Client cl1)
	{
		if(cl1.getNo_rue().endsWith(",")== false) 
		{
			cl1.setNo_rue(cl1.getNo_rue()+", ");
		}
		return cl1.getNo_rue();
	}
}
