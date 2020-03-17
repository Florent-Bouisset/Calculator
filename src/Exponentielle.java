public class Exponentielle extends Operateur{
	Exponentielle(){
		super("Exponentielle", "exp(x)", "exp(", false, true, NiveauPriorite.eleve);
	}
	
	@Override
	Valeur Calcul(Valeur a){
		double result = Math.exp(a.valeur);
				
		return new Valeur(result);
	}
	
	
}



