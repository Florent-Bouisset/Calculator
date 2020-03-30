import javax.swing.JButton;
import java.awt.event.*;


public class BouttonAction extends JButton {
	TermeIndecomposable terme;
	
	BouttonAction(TermeIndecomposable terme){
		super();
		this.setName(terme.getNom());
		this.setText(terme.getSymboleBtn());
		this.setToolTipText(terme.getNom());
		this.terme = terme;
		this.setBorderPainted(true);
		this.setFocusPainted(true);
		this.setContentAreaFilled(true);
	}
}
