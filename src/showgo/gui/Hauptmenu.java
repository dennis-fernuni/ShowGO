package showgo.gui;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

@SuppressWarnings("unused")
public class Hauptmenu {
	
	static JLabel aktuellerStatus = new JLabel("Ich bin ein Statuslabel");
	
	public static void sichern() {
    	// TODO: Sichern
    	try{
    		  Thread.currentThread();
			//do what you want to do before sleeping
    		  Thread.sleep(1000);
    		  //do what you want to do after sleeptig
    		}
    		catch(InterruptedException ie){
    		//If this thread was intrrupted by nother thread 
    		}
    	aktuellerStatus.setText("sichern...");
    		
    }
    
    
    public static void createAndShowGUI() {
        //Frame erstellen
    	JFrame frame = new JFrame("ShowGO");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //vor dem Schließen sichern() ausführen
        WindowAdapter a = new WindowAdapter() {
        	public void windowClosing(WindowEvent e) {
        		sichern();        		
        	}
		};
        frame.addWindowListener(a);
                
        //StatusLeiste hinzufügen
        
        frame.add(aktuellerStatus);
        
        //Fenster anzeigen
        frame.setSize(800, 600);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        
        PersonenEingabeFrame pef = new PersonenEingabeFrame();
        pef.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //pef.setSize(800, 600);
        pef.setLocationByPlatform(true);
        pef.setVisible(true);
    }
    
	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}
