package normalisation;

import modele.metier.Client;

public class NormalisationVoie 
{
	public static String setVoieNormaliseboulevard(Client cl1)
	{
		if (cl1.getVoie().contains("bd ")|| cl1.getVoie().contains(" bd ")||cl1.getVoie().contains("boul ")||cl1.getVoie().contains(" boul ")||cl1.getVoie().contains("boul. ")||cl1.getVoie().contains(" boul. "))
		{
		cl1.setVoie(cl1.getVoie().replace("bd ", "boulevard "));
		cl1.setVoie(cl1.getVoie().replace(" bd ", " boulevard "));
		cl1.setVoie(cl1.getVoie().replace("boul ", "boulevard "));
		cl1.setVoie(cl1.getVoie().replace(" boul ", " boulevard "));
		cl1.setVoie(cl1.getVoie().replace("boul. ", "boulevard "));
		cl1.setVoie(cl1.getVoie().replace(" boul. ", " boulevard "));
		
		}

		
		return cl1.getVoie();
	}
	
	public static String setVoieNormaliseavenue(Client cl1)
	{
		if (cl1.getVoie().contains("av. ")|| cl1.getVoie().contains(" av. "))
		{
		cl1.setVoie(cl1.getVoie().replace("av. ", "avenue "));
		cl1.setVoie(cl1.getVoie().replace(" av. ", " avenue "));
		}
		return cl1.getVoie();
	}
	
	public static String setVoieNormalisefaubourg(Client cl1)
	{
		if (cl1.getVoie().contains("faub. ")|| cl1.getVoie().contains(" faub. ")||cl1.getVoie().contains("fg ")|| cl1.getVoie().contains(" fg "))
		{
		cl1.setVoie(cl1.getVoie().replace("faub. ", "faubourg "));
		cl1.setVoie(cl1.getVoie().replace(" faub. ", " faubourg "));
		cl1.setVoie(cl1.getVoie().replace("fg ", "faubourg "));
		cl1.setVoie(cl1.getVoie().replace(" fg ", " faubourg "));
		}
		return cl1.getVoie();
	}
	
	public static String setVoieNormaliseplace(Client cl1)
	{
		if (cl1.getVoie().contains("pl. ")|| cl1.getVoie().contains(" pl. "))
		{
		cl1.setVoie(cl1.getVoie().replace("pl. ", "place "));
		cl1.setVoie(cl1.getVoie().replace(" pl. ", " place "));
		}
		return cl1.getVoie();
	}
}
