
public class ValeurAbsolu extends Operateur{
	ValeurAbsolu(){
		super("Valeur Absolu", "|x|", "abs(", false, true, NiveauPriorite.eleve);
	}
	
	@Override
	Valeur Calcul(Valeur a){
		double result = Math.abs(a.getValeur());
				
		return new Valeur(result);
	}
	
	
}



