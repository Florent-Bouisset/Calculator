/**
 * Cette classe est un terme qui contient une valeur composé de un ou plusieurs chiffres
 * @author Florent
 *
 */
public class Valeur extends Terme {
	private double valeur;
	
	Valeur(){
		super(TermeType.valeur);
		this.valeur = 0.0;
	}
	
	Valeur(double valeur){
		super(TermeType.valeur);
		this.valeur = valeur;
	}

	public double getValeur() {
		return valeur;
	}
	
	public String toString() {
		return String.valueOf(valeur);
	}
}
