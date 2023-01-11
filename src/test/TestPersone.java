package test;

import metier.Personne;
import metier.Secretaire;
import metier.Enseignant;
import metier.Etudiant;

public class TestPersone {

	public static void main(String[] args) {
Secretaire s1= new Secretaire("n1", "diallo", "oumar","tu1","tunis");
Enseignant e1=new Enseignant("bayo","alpha", "kindi11","kindia","java");
Etudiant et1=new Etudiant("genie informatique","kounet", "technologie","damas12","labe");
Personne.nbPersonne();
System.out.println("avant le changement"+s1);
		s1.modifierPersonne("tougue", "kindia");
		System.out.println("apres le changement"+s1);
		System.out.println("avant le changement"+e1);
		s1.modifierPersonne("tougue", "kindia");
		System.out.println("apres le changement"+e1);
		System.out.println("avant le changement"+et1);
		s1.modifierPersonne("tougue", "kindia");
		System.out.println("apres le changement"+s1);
	
				s1.ecrirepersonne();
				e1.ecrirepersonne();
				et1.ecrirepersonne();
			

	}

}
