package gestion_notes;

import java.util.ArrayList;

public class ListEtudiants extends ArrayList<Etudiant> {
	
	//Redéfiniton de la méthode add
	
	@Override
	public boolean add(Etudiant e) {
		if(this.contains(e)) return false;
		return super.add(e);
	}
	
	// 
}
