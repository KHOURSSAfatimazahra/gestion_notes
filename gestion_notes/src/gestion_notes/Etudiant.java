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
	
	// redefinition de la méthode toString
	
	public String toString() {
		return this.nom + ":" + this.note;
		
	}
	
	// redefinition de la méthode equals
	
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
	
	//geters
	public double getNote() {
		return note;
	}
	
	public String getNom() {
		return nom;
	}
	public int getId() {
		return id;
	}
	
	// setters
	
	public void setId(int id) {
		this.id = id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setNote(double note) {
		this.note = note;
	}
	
}

	


