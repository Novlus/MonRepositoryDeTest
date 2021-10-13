package normalisation;

import modele.metier.Client;

public class NormalisationCodePostal 
{
	public static String setCodePostalNormalise(Client cl1)
	{
		if(cl1.getCode_postal().length()< 5)
		{
			Client cl2 = cl1;
			cl1.setCode_postal("0"+cl2.getCode_postal());
		}
		
		return cl1.getCode_postal();
	}
	
	public static String SetCodePostalNormalisePays(Client cl1)
	{
		if(cl1.getCode_postal().startsWith(cl1.getCode_postal().substring(0, 1)) == cl1.getCode_postal().startsWith(cl1.getCode_postal().substring(0, 1).toUpperCase()))
		{
			cl1.setCode_postal(cl1.getCode_postal().substring(2));
		}
		return cl1.getCode_postal();
	}
}
