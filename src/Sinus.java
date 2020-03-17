
public class Sinus extends Operateur{
	Sinus(){
		super("Sinus", "Sin", "sin(", false, true, NiveauPriorite.eleve);
	}
	
	@Override
	Valeur Calcul(Valeur a){
		double result = Math.sin(a.valeur);
				
		return new Valeur(result);
	}
	
	
}
