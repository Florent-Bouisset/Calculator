/**
 * Classe definissant un operateur
 * Ex d'operateur: addition; soustraction etc..
 * @author Florent
 *
 */


public class Operateur extends TermeIndecomposable {

	/*
	 * défini si l'operateur utilise un terme avant ou pas: ex 3*3 utilise un terme avant l'operateur (ici *)
	 * mais sqrt(5) n'as pas besoin de terme avant l'operateur
	 */
	Boolean termeAvant;		
	Boolean termeApres;
	NiveauPriorite niveauPriorite;
	
	Operateur(String nom, String symboleBtn, String symboleCnsle, Boolean termeAvant,
			Boolean termeApres, NiveauPriorite niveauPriorite){		
		super(TermeType.operateur, nom, symboleBtn, symboleCnsle);
		this.termeAvant = termeAvant;
		this.termeApres = termeApres;
		this.niveauPriorite = niveauPriorite;
	}
	
	
	Valeur Calcul(){
		return null;
	}
	
	Valeur Calcul(Valeur a, Valeur b){
		return null;
	}
	
	Valeur Calcul(Valeur a){
		return null;
	}
	
	
}
