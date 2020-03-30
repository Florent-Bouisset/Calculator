
public class Division extends Operateur{
	Division(){
		super("Division", "/", "/", true, true, NiveauPriorite.moyen);
	}
	
	@Override
	Valeur Calcul(Valeur a, Valeur b){
		if(b.getValeur() == 0) {
			throw new ArithmeticException("division par zero");
		};
		double result = a.getValeur() / b.getValeur();
		return new Valeur(result);
	}
	
	
}



