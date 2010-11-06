package showgo.test;

import showgo.gui.Hauptmenu;

public class TestShowGOGui {
	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Hauptmenu.createAndShowGUI();
            }
        });
		
		
		
		
	}
}
