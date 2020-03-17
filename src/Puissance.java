
public class Puissance extends Operateur{
	Puissance(){
		super("Puissance", "x^y", "^", true, true, NiveauPriorite.eleve);
	}
	
	@Override
	Valeur Calcul(Valeur a, Valeur b){
		double result = Math.pow(a.valeur, b.valeur);
				
		return new Valeur(result);
	}
	
	
}
