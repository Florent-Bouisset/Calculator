
public class Chiffre extends TermeIndecomposable {
	int valeur;
	
	Chiffre(String nom, String symboleBtn, String symboleCnsle, int valeur){
		super(TermeType.chiffre, nom, symboleBtn, symboleCnsle);
		this.valeur = valeur;
	}
}