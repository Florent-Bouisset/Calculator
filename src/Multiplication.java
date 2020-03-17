
public class Multiplication extends Operateur{
	Multiplication(){
		super("Multiplication", "x", "*", true, true, NiveauPriorite.moyen);
	}
	
	@Override
	Valeur Calcul(Valeur a, Valeur b){
		double result = a.valeur * b.valeur;
		return new Valeur(result);
	}
	
	
}



