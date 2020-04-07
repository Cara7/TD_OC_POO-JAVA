
public class ClassMain {

	public static void main(String[] args) {
		Ville villeInconnu = new Ville();
		Ville ville1 = new Ville("Marseille", 12000, "France");
		ville1.nomVille = "haha";
		System.out.println(ville1.nomVille)
	}

}
