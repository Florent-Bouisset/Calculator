

public class Addition extends Operateur {
	Addition(){
		super("Addition", "+", "+", true, true, NiveauPriorite.faible);
	}
	
	@Override
	Valeur Calcul(Valeur a, Valeur b){
		double result = a.valeur + b.valeur;
		return new Valeur(result);
	}

}
