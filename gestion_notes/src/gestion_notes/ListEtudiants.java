package gestion_notes;

import java.util.ArrayList;

public class ListEtudiants extends ArrayList<Etudiant> {
	
	//Red�finiton de la m�thode add
	
	@Override
	public boolean add(Etudiant e) {
		if(this.contains(e)) return false;
		return super.add(e);
	}
	
	// 
}
