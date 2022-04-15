package gestion_notes;

import java.util.ArrayList;
import java.util.List;

public class ListEtudiants extends ArrayList<Etudiant>{
	
	//Red�finiton de la m�thode add
	
	@Override
	public boolean add(Etudiant e) {
		if(this.contains(e)) return false;
		return super.add(e);
	}
	
	// 
	
	public List<Etudiant> filtrer (Condition c){
		
	    ListEtudiants l = new ListEtudiants();
	    
		for (Etudiant e : this ) {
			
			if(c.estVrai(e)) {
				l.add(e);
			}
			
		}
		return l;
		
	}
}
