
public class Cosinus extends Operateur{
	Cosinus(){
		super("Cosinus", "Cos", "cos(", false, true, NiveauPriorite.eleve);
	}
	
	@Override
	Valeur Calcul(Valeur a){
		double result = Math.cos(a.getValeur());
				
		return new Valeur(result);
	}
	
	
}



