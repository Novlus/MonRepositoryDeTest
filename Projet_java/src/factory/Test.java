package factory;

import modele.metier.Periodicite;

public class Test 
{
	public void main(String [] args) 
	{
		Periodicite p = new Periodicite(1,"azoep");
		daos.getPeriodiciteDAO().create(p);
	}
}
