package metier;

import java.util.Scanner;

public class Secretaire extends Personne{
private String numeroBureau;
private static int nbSecretaire;
	
	public Secretaire(String numeroBureau,String nom, String prenom, String rue, String ville) {

	this.numeroBureau = numeroBureau;
}

	
public String toString() {
	return "Secretaire [numeroBureau=" + numeroBureau + ", nbSecretaire=" + nbSecretaire + "]";
}
public static int nbSecretaire() {
	return nbSecretaire+=1;
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
	 System.out.println("Secretaire"+"nom"+nom+"prenom"+prenom+"rue"+rue+"ville"+ville);
	
}
}
