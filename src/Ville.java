
public class Ville {
	String nomVille;
	int nbHabitants;
	String nomPays;
	
	//Constructeur par défaut
	public Ville() {
		System.out.println("Création d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbHabitants = 0;
	}
	
	//Constructeur avec param
	public Ville(String nomVille, int nbHabitants, String nomPays) {
		System.out.println("Création d'une ville avec des paramètres !");
		nomVille = nomVille;
		nbHabitants = nbHabitants;
		nomPays = nomPays;

	}
}
