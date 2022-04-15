package gestion_notes;

public class Main {
	public static void main(String[] args) {
		
		// creation des etudiants
		
		Etudiant e1,e2,e3;
		
		e1=new Etudiant(1,"hamid");
		e2=new Etudiant(2,"driss");
		e3=new Etudiant(1,"youssef");
		
		//modification des notes
		
		e1.setNote(15);
		e2.setNote(12);
		e3.setNote(16);
		
		//Creation d'une Liste mesEtudiants
		
		ListEtudiants mesEtudiants = null;
		
		mesEtudiants.add(e2);
		mesEtudiants.add(e3);
		mesEtudiants.add(e1);
		//affichage
		
		System.out.println(mesEtudiants);
		
		
		
		
	}

}
