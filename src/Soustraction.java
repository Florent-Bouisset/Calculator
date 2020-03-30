
public class Soustraction extends Operateur {
	Soustraction(){
		super("Soustraction", "-", "-", true, true, NiveauPriorite.faible);
	}
	
	@Override
	Valeur Calcul(Valeur a, Valeur b){
		double result = a.getValeur() - b.getValeur();
		return new Valeur(result);
	}

}
