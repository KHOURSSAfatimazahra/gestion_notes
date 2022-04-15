package gestion_notes;


public class Etudiant implements Comparable<Etudiant> {
	
	// declaration des variables 
	
	private int id;
	private String nom;
	private double note;
	
	//constructeur
	
	 public Etudiant(int id ,String nom){
		this.id = id;
		this.nom = nom;
		this.note = 10;
		
	}
	
	// la méthode toString
	
	public String toString() {
		return this.nom + ":" + this.note;
		
	}
	
	//  la méthode equals
	
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Etudiant) ){
			return false;
		}
	return	((Etudiant)obj).id==this.id;
	}
	
	//implémentation de  l’interface comparable
	
	@Override
	public int compareTo(Etudiant o) {
		// TODO Auto-generated method stub
		if(this.note<=o.note) return 0;
		if(this.note>=o.note) return 1;
		return -1;
	}
	
}

	


