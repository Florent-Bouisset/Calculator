
public class RacineCarre extends Operateur{
	RacineCarre(){
		super("RacineCarre", "√x", "√", false, true, NiveauPriorite.eleve);
	}
	
	@Override
	Valeur Calcul(Valeur a){
		double result = Math.pow(a.valeur, 0.5);
				
		return new Valeur(result);
	}
	
	
}



