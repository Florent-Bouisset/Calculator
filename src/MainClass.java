
public class MainClass {
	public static void main(String Args[]) {

		Equation eq = new Equation();
		Equation eq2 = new Equation();
		Valeur one = new Valeur(1);
		Valeur a = new Valeur(5.32);
		Valeur b = new Valeur(6.31);
		Operateur plus = new Addition();
		Operateur fois = new Multiplication();
		Operateur divise = new Division();
		Operateur carre = new AuCarre();
		Operateur racine = new RacineCarre();
		Operateur exp = new Exponentielle();
		Operateur cos = new Cosinus();
		
		eq.addTerme(exp);
		eq.addTerme(a);
		eq.addTerme(plus);
		eq.addTerme(b);
		eq.addTerme(divise);
		eq.addTerme(b);
		eq.addTerme(plus);
		eq.addTerme(b);
		eq.addTerme(fois);
		eq.addTerme(racine);
		eq.addTerme(b);
		eq.addTerme(carre);
				
		eq.resoudre();
	
		Valeur rest = (Valeur)eq.equation.elementAt(0) ;
		System.out.println(rest.valeur);
		
		eq2.addTerme(exp);
		eq2.addTerme(b);
		eq2.addTerme(fois);
		eq2.addTerme(cos);
		eq2.addTerme(a);
		
		eq2.resoudre();
		rest = (Valeur)eq2.equation.elementAt(0) ;
		System.out.println(rest.valeur);
		
		
		
		
		
		
		
		
		
	}
}
