package metier;

import java.util.Scanner;

public abstract class Personne {
protected String nom;
protected String prenom;
protected String rue;
protected String ville;
protected String typePersonne;
protected static int nbPersonnes;
public Personne() {
	
}
public Personne(String nom, String prenom, String rue, String ville) {
	this.nom = nom;
	this.prenom = prenom;
	this.rue = rue;
	this.ville = ville;
}

public String toString() {
	return "Personne [nom=" + nom + ", prenom=" + prenom + ", rue=" + rue + ", ville=" + ville + "]";
}
abstract public void ecrirepersonne(); 
public static void nbPersonne() {
	nbPersonnes +=1;
	System.out.println("le nombre de personne est:"+nbPersonnes);
}
public  void modifierPersonne(String rue, String ville) {
	
	//Scanner scanner = new Scanner(System.in);
	//System.out.println("entre la nouvelle rue:");
	 //String newRue = scanner.next();
	 //System.out.println("entre la nouvelle ville:");
	 //String newVille = scanner.next();
	 this.rue=rue;
	 this.ville=ville;
	 
}
}

