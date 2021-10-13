package normalisation;

import modele.metier.Client;

public class NormalisationPays 
{

	public static String setPaysNormaliseLux(Client cl1) 
	{
		if (cl1.getPays() == "letzebuerg" || cl1.getPays() =="Letzebuerg")
		{
			cl1.setPays("Luxembourg"); 
		}
		
		return cl1.getPays();
	}
	
	public static String setPaysNormaliseBelg(Client cl1)
	{
		if (cl1.getPays() == "belgium"|| cl1.getPays() =="Belgium")
		{
			cl1.setPays("Belgique");
		}
		return cl1.getPays();
	}
	
	public static String setPaysNormaliseSuisse(Client cl1)
	{
		if (cl1.getPays() =="Switzerland"|| cl1.getPays() == "switzerland")
		{
			cl1.setPays("Suisse");
		}
		return cl1.getPays();
	}
}
