
import javax.swing.JFrame;

import javax.swing.UIManager;

public class MainClass {
	public static void main(String Args[]) {
		
	    try {
	    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");  // This line gives Windows Theme
	    } 
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	 	  
	   Fenetre f = new Fenetre();

	  }
}
