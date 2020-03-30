
public class Chiffre extends TermeIndecomposable {
	String valeur;
	
	Chiffre(String nom, String symboleBtn, String symboleCnsle, String valeur){
		super(TermeType.chiffre, nom, symboleBtn, symboleCnsle);
		this.valeur = valeur;
	}
	
	Chiffre(String valeur){
		super(TermeType.chiffre, valeur, valeur, valeur);
		this.valeur = valeur;
	}
	
}