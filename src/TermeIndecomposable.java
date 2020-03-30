/**
 * Terme qui ne peut pas etre d�composer en plusieurs symboles
 * @author Florent
 *
 */

public class TermeIndecomposable extends Terme {
	private String nom;
	private String symboleBtn;		//d�crit le symbole qu'aura l'operateur sur le boutton
	private String symboleCnsle;	//d�crit le symbole qu'aura l'operateur sur lors de la saisie

	TermeIndecomposable(TermeType type, String nom, String symboleBtn, String symboleCnsle){
		super(type);
		this.nom = nom;
		this.symboleBtn = symboleBtn;
		this.symboleCnsle = symboleCnsle;
	}
	
	String getNom() {
		return nom;
	}
	
	String getSymboleBtn() {
		return symboleBtn;
	}
	
	String getSymboleCnsle() {
		return symboleCnsle;
	}
	
	@Override
	public String toString() {
		return symboleCnsle;
	}
}
