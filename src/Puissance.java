
public class Puissance extends Operateur{
	Puissance(){
		super("Puissance", "x^y", "^", true, true, NiveauPriorite.eleve);
	}
	
	@Override
	Valeur Calcul(Valeur a, Valeur b){
		double result = Math.pow(a.getValeur(), b.getValeur());
				
		return new Valeur(result);
	}
	
	
}
