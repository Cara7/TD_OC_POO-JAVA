
public class Capitale extends Ville {
	private String monument;
	
	// Constructeur par défaut
	public Capitale() {
		super();
		monument = "aucun";
	} 
	
	 // Constructeur d'initialisation de capitale
	public Capitale(String pNomVille, int pNbHabitants, String pNomPays, String monument){
	    super(pNomVille, pNbHabitants, pNomPays);
	    this.monument = monument;
	  } 
	
	 public String decrisToi() {
		 String str =  super.decrisToi() + "\n \t ==>>" + this.monument+
				 " en est un monument";
		 System.out.println("Invocation de super.decrisToi()");
		    
		 return str;
	}
	 
	public String getMonument() {
		return monument;
	}
	 
	public void setMonument(String monument) {
		this.monument = monument;
	}
	 
}
