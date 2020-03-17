/**
 * Terme qui ne peut pas etre d�composer en plusieurs symboles
 * @author Florent
 *
 */

public class TermeIndecomposable extends Terme {
	String nom;
	String symboleBtn;		//d�crit le symbole qu'aura l'operateur sur le boutton
	String symboleCnsle;	//d�crit le symbole qu'aura l'operateur sur lors de la saisie

	TermeIndecomposable(TermeType type, String nom, String symboleBtn, String symboleCnsle){
		super(type);
		this.nom = nom;
		this.symboleBtn = symboleBtn;
		this.symboleCnsle = symboleCnsle;
	}
}
