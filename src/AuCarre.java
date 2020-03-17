
public class AuCarre extends Operateur{
	AuCarre(){
		super("AuCarre", "x²", "²", true, false, NiveauPriorite.eleve);
	}
	
	@Override
	Valeur Calcul(Valeur a){
		double result = a.valeur * a.valeur;
		return new Valeur(result);
	}
	
	
}



