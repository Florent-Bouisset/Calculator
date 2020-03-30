import java.util.Vector;

public class Equation {
	Vector<Terme> equation;
	Equation(){
		equation = new Vector<Terme>();
		
	}
	
	
	void addTerme(Terme a) {
		this.equation.add(a);
	}
	
	/**
	 * Cette fonction permet de savoir si l'équation est resolu,
	 * elle est resolu si il n'y a plus d'operateur dans l'equation
	 * @return boolean true si resolu, false sinon
	 */
	Boolean isResolve() {
		Boolean result = true;
		for (Terme t : equation){
			if(TermeType.operateur.equals(t.getType())) {
				result = false;
				break;	
			}	
		}
		return result;
	}
	
	/**
	 * Trouve le prochain operateur avec la plus haute priorité , et calcul de gauche vers la droite
	 * @return l'index de l'operateur
	 */
	int findNextOperator() {
		int index = 0;
		index = findNextOperatorWithGivenPriorityLevel(NiveauPriorite.eleve);
		if(index == -1) {
			index = findNextOperatorWithGivenPriorityLevel(NiveauPriorite.moyen); 
		}
		if(index == -1) {
			index = findNextOperatorWithGivenPriorityLevel(NiveauPriorite.faible); 
		}
		return index;
	}
	
	/**
	 * Trouve le prochain operateur avec le niveau de priorité donnée
	 * @return l'index (-1 si pas trouvé)
	 */
	private int findNextOperatorWithGivenPriorityLevel(NiveauPriorite niveau) {
		int index = -1;
		for (Terme t : equation) {
			if(TermeType.operateur.equals(t.getType())) {
				Operateur o = (Operateur)t;
				if (o.niveauPriorite.equals(niveau)) {
					index = equation.indexOf(t);
					break;
				}
			}
		}
		return index;
	}
	/**
	 * Calcule l'operation à l'index donnée
	 * @param index
	 * @return
	 */
	Valeur calcul(int index) {
		Valeur resultat = new Valeur();
		Operateur o = (Operateur) equation.elementAt(index);
		if(o.termeAvant && o.termeApres) {
			resultat = o.Calcul((Valeur)equation.elementAt(index-1), (Valeur)equation.elementAt(index+1));
		}
		if(o.termeAvant && !o.termeApres) {
			resultat = o.Calcul((Valeur)equation.elementAt(index-1));
		}
		if(!o.termeAvant && o.termeApres) {
			resultat = o.Calcul((Valeur)equation.elementAt(index+1));
		}
				
		return resultat;
	}
	
	public void resoudreUnNiveau() {
		int index;
		Valeur resultat;
		Operateur ope;
		
		
		index = findNextOperator();
		resultat = calcul(index);
		ope = (Operateur)equation.elementAt(index);
		

		
		equation.setElementAt(resultat, index);
		if(ope.termeApres) {
			equation.remove(index+1);
		}	
		if(ope.termeAvant) {
			equation.remove(index-1);
		}
	}
	
	public void resoudre() {
		
		convertiTousLesChiffresEnValeur();
		while(!isResolve()){
			resoudreUnNiveau();
		}
	}
	
	private void convertiTousLesChiffresEnValeur() {
		while (isThereChiffre()) {
			convertiChiffreEnValeur();
		}
	}
	
	private void convertiChiffreEnValeur() {
			int index = indexOfFirstDigit();
			int longueur = subsequentDigits(index); 
			Vector<Chiffre> tab = convertiChiffreEnTab(index, longueur);
			Valeur resultat = consolideTab(tab);
			equation.setElementAt(resultat, index);
			for (int j = index + longueur - 1; j > index; j--) {
				equation.removeElementAt(j);
			}
	}
	
	private Vector<Chiffre> convertiChiffreEnTab(int index,	int longueur) {
	
		Vector<Chiffre> tab = new Vector<Chiffre>();
		for (int i  = index ; i < index + longueur ; i++) {
			Chiffre chiffre = (Chiffre) equation.elementAt(i);
			tab.add(chiffre);
		}
		return tab;
	}
	
	private Valeur consolideTab(Vector<Chiffre> tab) {
		String str = "";
		for (int i = 0; i < tab.size(); i++) {
			str += tab.elementAt(i);
		}
		
		Valeur result = new Valeur(Double.parseDouble(str));
		return result;
	}
	
	
	private boolean isThereChiffre() {
		boolean result = false;
		for (Terme terme : equation) {
			if (terme instanceof Chiffre) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	private int indexOfFirstDigit() {
		int index = 0;
		
		for (Terme terme : equation) {
			if (terme instanceof Chiffre) {
				break;
			}
			index ++;
		}
		return index;
	}
	
	private int subsequentDigits(int index) {
		int counter = 0;
		
		for (int i = index; i < equation.size() ; i++ ){
			if (equation.elementAt(i) instanceof Chiffre) { 
				counter++;
			}
			else {
				break;
			}
		}
		return counter;
	}
	
	public String toString() {
		String buffer = "";
		if(equation.isEmpty()) {
			buffer = "0";
		}
		for (Terme terme : equation) {
			buffer += terme;
		}
		
		return buffer;
	}
	
	public void afficheEquation() {
		
		System.out.println(this);
	}
	
	
	public void clear() {
		equation.clear();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
