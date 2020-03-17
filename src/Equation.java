import java.util.Vector;

public class Equation {
	Vector<Terme> equation = new Vector<Terme>();
	Equation(){}
	
	
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
		while(!isResolve()){
			resoudreUnNiveau();
		}
	}
}
