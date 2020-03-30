import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Fenetre extends JFrame{
	
	Equation eq;
	JLabel saisi;
	
	public Fenetre(){
		super();
		eq = new Equation();
		this.setTitle("Calculatrice");
		BoxLayout mainLayout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
		saisi = new JLabel("0");
		saisi.setFont(new Font("serial", Font.BOLD, 22));

		JPanel ecran = new JPanel();
		ecran.add(saisi);
		
		
		
		this.add(ecran);
		this.add(createPaveAction());
		this.setLayout(mainLayout);
		this.pack();  // permet d'ajuster automatiquement la taille de la fenetre
		this.setVisible(true);
		
	}
	
	private JPanel createPaveAction() {
		JPanel paveAction = new JPanel();
		GridLayout layout = new GridLayout(0,4);
		paveAction.setLayout(layout);
		
		addButton(paveAction, new BouttonAction(new Sinus()));
		addButton(paveAction, new BouttonAction(new Cosinus()));
		addButton(paveAction, new BouttonAction(new Puissance()));
		
		// Boutton effacer
		JButton efface = new JButton();
		efface.setText("C");
		paveAction.add(efface);
		efface.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				eq.clear();
				updateScreen();
						
			}
		});
		
		addButton(paveAction, new BouttonAction(new RacineCarre()));
		addButton(paveAction, new BouttonAction(new ValeurAbsolu()));
		addButton(paveAction, new BouttonAction(new Exponentielle()));
		addButton(paveAction, new BouttonAction(new Division()));
		addButton(paveAction, new BouttonChiffre(new Chiffre("7")));
		addButton(paveAction, new BouttonChiffre(new Chiffre("8")));
		addButton(paveAction, new BouttonChiffre(new Chiffre("9")));
		addButton(paveAction, new BouttonAction(new Multiplication()));
		addButton(paveAction, new BouttonChiffre(new Chiffre("4")));
		addButton(paveAction, new BouttonChiffre(new Chiffre("5")));
		addButton(paveAction, new BouttonChiffre(new Chiffre("6")));
		addButton(paveAction, new BouttonAction(new Soustraction()));
		addButton(paveAction, new BouttonChiffre(new Chiffre("1")));
		addButton(paveAction, new BouttonChiffre(new Chiffre("2")));
		addButton(paveAction, new BouttonChiffre(new Chiffre("3")));
		addButton(paveAction, new BouttonAction(new Addition()));
		addButton(paveAction, new BouttonChiffre(new Chiffre("-")));
		addButton(paveAction, new BouttonChiffre(new Chiffre("0")));
		addButton(paveAction, new BouttonChiffre(new Chiffre(".")));
		
		
		// Boutton egal
		JButton egal = new JButton();
		egal.setText("=");
		paveAction.add(egal);
		egal.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					eq.resoudre();
					updateScreen();					
				}
				catch(ArithmeticException except) {
					printMessage("Division par zero Impossible");
				}	
			}
		});

		return paveAction;
	}

	private void addButton(JPanel panel, BouttonAction boutton) {
		boutton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				eq.addTerme(boutton.terme);
				System.out.println(eq.equation.elementAt(eq.equation.size()-1));
				saisi.setText(eq.toString());
			}
		});
		panel.add(boutton);
	}
	
	private void updateScreen() {
		saisi.setText(eq.toString());
	}
	
	private void printMessage(String message) {
		saisi.setText(message);
	}
	
}
