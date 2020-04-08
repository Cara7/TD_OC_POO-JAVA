
public class Ville {
	private String nomVille;
	private int nbHabitants;
	private String nomPays;
	private char categorie;
	
	
	//Constructeur par défaut
	public Ville() {
		System.out.println("Création d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbHabitants = 0;
		this.setCategorie();
	}
	
	//Constructeur avec param
	public Ville(String pNomVille, int pNbHabitants, String pNomPays) {
		System.out.println("Création d'une ville avec des paramètres !");
		nomVille = pNomVille;
		nbHabitants = pNbHabitants;
		nomPays = pNomPays;
		this.setCategorie();
	}
	
	//Accesseurs
	public String getNomVille() {
		return nomVille;
	}
	
	public int getNbHabitants() {
		return nbHabitants;
	}
	
	public String getNomPays() {
		return nomPays;
	}
	
	public char getCategorie() {
		return categorie;
	}
	
	//Mutateurs
	public void setNomville(String nVille) {
		nomVille = nVille;
	}
	
	public void setNbHabitants(int nbHab) {
		nbHabitants = nbHab;
	}
	
	public void setNomPays(String nPays) {
		nomPays = nPays;
	}
	
	//Définit la catégorie de la ville
	private void setCategorie() {
		 int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000,
				 1000000, 5000000, 10000000};
		 char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
		 'H'};
		 int i = 0;
		    while (i < bornesSuperieures.length && this.nbHabitants >
		bornesSuperieures[i])
		      i++;
		    this.categorie = categories[i];
	}
	
	//Décrit la ville
	  public String decrisToi() {
	    return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ","
	    		+ "	elle comporte : "+this.nbHabitants+" habitant(s) => elle est donc"
	    				+ "de catégorie : "+this.categorie;
	  }
	  
	  //Retourne une chaîne de caractères selon le résultat de la comparaison
	    public String comparer(Ville v1) {
	      String str = new String();
	      if (v1.getNbHabitants() > this.nbHabitants)
	        str = v1.getNomVille()+" est une ville plus peuplée que"
	        		+ " "+this.nomVille;
	       
	      else
	        str = this.nomVille+" est une ville plus peuplée que  "+v1.getNomVille();
	       
	      return str;
	    }
	
	
	
}
