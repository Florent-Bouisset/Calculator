
public class AuCarre extends Operateur{
	AuCarre(){
		super("AuCarre", "x�", "�", true, false, NiveauPriorite.eleve);
	}
	
	@Override
	Valeur Calcul(Valeur a){
		double result = a.getValeur() * a.getValeur();
		return new Valeur(result);
	}
	
	
}



