package metier;

import java.util.Scanner;

public class Enseignant extends Personne {
private String specialite;
private static int nbEnseignants;
	
	
	
	public Enseignant(String nom, String prenom, String rue, String ville,String specialite) {
	this.specialite = specialite;
}
public static int nbEnseignants() {
	return nbEnseignants+=1;
}
	public String toString() {
		return "Enseignant [specialite=" + specialite + "]";
	}



	public void ecrirepersonne() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("entre le nom du secretaire:");
		 String nom= scanner.next();
		 System.out.println("entre le prenom du secretaire:");
		 String prenom = scanner.next();
		 System.out.println("entre la rue du secretaire:");
		 String rue = scanner.next();
		 System.out.println("entre la ville du secretaire:");
		 String ville = scanner.next();
		 System.out.println("Enseignant"+"nom"+nom+"prenom"+prenom+"rue"+rue+"ville"+ville);
		
	}

}
