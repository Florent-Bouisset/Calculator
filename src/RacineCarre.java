
public class RacineCarre extends Operateur{
	RacineCarre(){
		super("Racine carré", "√x", "√", false, true, NiveauPriorite.eleve);
	}
	
	@Override
	Valeur Calcul(Valeur a){
		double result = Math.pow(a.getValeur(), 0.5);
				
		return new Valeur(result);
	}
	
	
}



