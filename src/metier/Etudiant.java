package metier;

import java.util.Scanner;

public class Etudiant extends Personne  {
private String diplomeEncours;
private static int nbEtudiants;



public Etudiant(String diplomeEncours,String nom, String prenom, String rue, String ville) {
	
	this.diplomeEncours = diplomeEncours;
	this.nbEtudiants = nbEtudiants;
}
public static int nbEtudiants() {
	return nbEtudiants+=1;
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
	 System.out.println("Etudiant"+"nom"+nom+"prenom"+prenom+"rue"+rue+"ville"+ville);
}

}
