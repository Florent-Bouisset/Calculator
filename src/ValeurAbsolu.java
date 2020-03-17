
public class ValeurAbsolu extends Operateur{
	ValeurAbsolu(){
		super("Valeur Absolu", "|x|", "abs(", false, true, NiveauPriorite.eleve);
	}
	
	@Override
	Valeur Calcul(Valeur a){
		double result = Math.abs(a.valeur);
				
		return new Valeur(result);
	}
	
	
}



