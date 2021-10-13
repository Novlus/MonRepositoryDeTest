package normalisation;

import modele.metier.Client;

public class NormalisationVille 
{
	public static String setVilleNormalise(Client cl1)
	{
		if(cl1.getVille().startsWith(cl1.getVille().substring(0, 1)) == cl1.getVille().startsWith(cl1.getVille().substring(0, 1).toLowerCase()))
			{
				Client cl2 = cl1;
				char c = cl1.getVille().charAt(0);
				String premierCaractereVille = Character.toString(c);
				cl2.setVille(cl2.getVille().substring(1));
				cl1.setVille(premierCaractereVille.toUpperCase()+cl2.getVille());
			}
		
		return cl1.getVille();
	}
	
	public static String setVilleNormaliseLedeb(Client cl1)
	{
		if(cl1.getVille().contains("Le ")||cl1.getVille().contains("le "))
				{
					Client cl2 = cl1;
					cl2.setVille(cl2.getVille().substring(3));
					cl1.setVille("Le-"+cl2.getVille());
				}
		return cl1.getVille();
		
	}
	
	public static String setVilleNormalisele(Client cl1)
	{
		if (cl1.getVille().contains(" le ")|| cl1.getVille().contains(" Le "))
		{
			Client cl2 = cl1;
		cl1.setVille(cl1.getVille().replace(" le ", "-le-"));
		cl1.setVille(cl2.getVille().replace(" Le ", "-le-"));
		
		}

		return cl1.getVille();
	}
	
	public static String setVilleNormaliseLesdeb(Client cl1)
	{
		if(cl1.getVille().contains("Lès ")||cl1.getVille().contains("lès "))
				{
					Client cl2 = cl1;
					cl2.setVille(cl2.getVille().substring(4));
					cl1.setVille("Lès-"+cl2.getVille());
				}
		return cl1.getVille();
		
	}
	
	public static String setVilleNormaliseles(Client cl1)
	{
		if (cl1.getVille().contains(" lès ")|| cl1.getVille().contains(" Lès "))
		{
			Client cl2 = cl1;
			cl1.setVille(cl1.getVille().replace(" lès ", "-lès-"));
			cl1.setVille(cl2.getVille().replace(" Lès ", "-lès-"));
		
		}
		return cl1.getVille();
	}
	
	public static String setVilleNormaliseSousdeb(Client cl1)
	{
		if(cl1.getVille().contains("Sous ")||cl1.getVille().contains("sous "))
				{
					Client cl2 = cl1;
					cl2.setVille(cl2.getVille().substring(5));
					cl1.setVille("Sous-"+cl2.getVille());
				}
		return cl1.getVille();
		
	}
	
	public static String setVilleNormalisesous(Client cl1)
	{
		if (cl1.getVille().contains(" sous ")|| cl1.getVille().contains(" Sous "))
		{
			Client cl2 = cl1;
		cl1.setVille(cl1.getVille().replace(" sous ", "-sous-"));
		cl1.setVille(cl2.getVille().replace(" Sous ", "-sous-"));
		
		}
		return cl1.getVille();
	}
	
	public static String setVilleNormaliseSurdeb(Client cl1)
	{
		if(cl1.getVille().contains("Sur ")||cl1.getVille().contains("sur "))
				{
					Client cl2 = cl1;
					cl2.setVille(cl2.getVille().substring(4));
					cl1.setVille("Sur-"+cl2.getVille());
				}
		return cl1.getVille();
		
	}
	
	public static String setVilleNormalisesur(Client cl1)
	{
		if (cl1.getVille().contains(" sur ")|| cl1.getVille().contains(" Sur "))
		{
			Client cl2 = cl1;
		cl1.setVille(cl1.getVille().replace(" sur ", "-sur-"));
		cl1.setVille(cl2.getVille().replace(" Sur ", "-sur-"));
		
		}
		return cl1.getVille();
	}
	
	public static String setVilleNormaliseadeb(Client cl1)
	{
		if(cl1.getVille().contains("à ")||cl1.getVille().contains("A "))
				{
					Client cl2 = cl1;
					cl2.setVille(cl2.getVille().substring(2));
					cl1.setVille("À-"+cl2.getVille());
				}
		return cl1.getVille();
		
	}
	
	public static String setVilleNormalisea(Client cl1)
	{
		if (cl1.getVille().contains(" à ")|| cl1.getVille().contains(" A "))
		{
			Client cl2 = cl1;
		cl1.setVille(cl1.getVille().replace(" à ", "-à-"));
		cl1.setVille(cl2.getVille().replace(" A ", "-à-"));
		
		}
		return cl1.getVille();
	}
	
	public static String setVilleNormaliseauxdeb(Client cl1)
	{
		if(cl1.getVille().contains("aux ")||cl1.getVille().contains("Aux "))
				{
					Client cl2 = cl1;
					cl2.setVille(cl2.getVille().substring(4));
					cl1.setVille("Aux-"+cl2.getVille());
				}
		return cl1.getVille();
		
	}
	
	
	public static String setVilleNormaliseaux(Client cl1)
	{
		if (cl1.getVille().contains(" aux ")|| cl1.getVille().contains(" Aux "))
		{
			Client cl2 = cl1;
		cl1.setVille(cl1.getVille().replace(" aux ", "-aux-"));
		cl1.setVille(cl2.getVille().replace(" Aux ", "-aux-"));
		
		}
		return cl1.getVille();
	}
	
	public static String setVilleNormaliseStdeb(Client cl1)
	{
		if(cl1.getVille().contains("St "))
				{
					Client cl2 = cl1;
					cl2.setVille(cl2.getVille().substring(3));
					cl1.setVille("Saint-"+cl2.getVille());
				}
		return cl1.getVille();
		
	}
	
	public static String setVilleNormaliseStedeb(Client cl1)
	{
		if(cl1.getVille().contains("Ste "))
				{
					Client cl2 = cl1;
					cl2.setVille(cl2.getVille().substring(4));
					cl1.setVille("Sainte-"+cl2.getVille());
				}
		return cl1.getVille();
		
	}
	
	public static String setVilleNormaliseSt(Client cl1)
	{
		if (cl1.getVille().contains(" St "))
		{
			Client cl2 = cl1;
		cl1.setVille(cl1.getVille().replace(" St ", "-Saint-"));
		
		}
		return cl1.getVille();
	}
	
	public static String setVilleNormaliseSte(Client cl1)
	{
		if (cl1.getVille().contains(" Ste "))
		{
			Client cl2 = cl1;
		cl1.setVille(cl1.getVille().replace(" Ste ", "-Sainte-"));
		
		}
		return cl1.getVille();
	}
	
	
}
