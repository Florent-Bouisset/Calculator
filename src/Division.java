
public class Division extends Operateur{
	Division(){
		super("Division", "/", "/", true, true, NiveauPriorite.moyen);
	}
	
	@Override
	Valeur Calcul(Valeur a, Valeur b){
		double result = a.valeur / b.valeur;
		return new Valeur(result);
	}
	
	
}



