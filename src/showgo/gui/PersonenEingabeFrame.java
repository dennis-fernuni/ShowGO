package showgo.gui;

import javax.swing.*;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;

@SuppressWarnings("serial")
public class PersonenEingabeFrame extends JFrame implements ActionListener {

	Boolean vornameOK = false, nachnameOK = false, geburtstagOK = false,
			stasseOK = false, plzOK = false, ortOK = false;

	JLabel LabelVorname, LabelNachname, LabelGeschlecht, LabelGeburtstag,
			LabelStrasse, LabelPLZ, LabelOrt, LabelResult;
	JTextField TextVorname, TextNachname, TextGeburtstag, TextStrasse, TextPLZ,
			TextOrt;
	JComboBox ComboGeschlecht;

	JButton OK;

	String Geschlechter[] = { "männlich", "weiblich" };

	public PersonenEingabeFrame() {
		setSize(450, 250);
		setTitle("PersonenEingabeFrame");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(8, 2));
		LabelVorname = new JLabel("Vorname:");
		LabelNachname = new JLabel("Nachname:");
		LabelGeschlecht = new JLabel("Geschlecht:");
		LabelGeburtstag = new JLabel("Geburtstag:");
		LabelStrasse = new JLabel("Straße:");
		LabelPLZ = new JLabel("Postleitzahl:");
		LabelOrt = new JLabel("Ort:");
		LabelResult = new JLabel();

		TextVorname = new JTextField();
		TextNachname = new JTextField();
		TextGeburtstag = new JTextField();
		TextStrasse = new JTextField();
		TextPLZ = new JTextField();
		TextOrt = new JTextField();

		ComboGeschlecht = new JComboBox(Geschlechter);

		OK = new JButton("OK");
		OK.addActionListener(this);

		contentPane.add(LabelVorname);
		contentPane.add(TextVorname);
		contentPane.add(LabelNachname);
		contentPane.add(TextNachname);
		contentPane.add(LabelGeschlecht);
		contentPane.add(ComboGeschlecht);
		contentPane.add(LabelGeburtstag);
		contentPane.add(TextGeburtstag);
		contentPane.add(LabelStrasse);
		contentPane.add(TextStrasse);
		contentPane.add(LabelPLZ);
		contentPane.add(TextPLZ);
		contentPane.add(LabelOrt);
		contentPane.add(TextOrt);

		contentPane.add(LabelResult);
		contentPane.add(OK);
	}

	public void actionPerformed(ActionEvent ev) {
		if (TextOrt.getText().length() == 0) {
			LabelResult.setText("Bitte Ort eingeben!");
			ortOK = false;
		} else ortOK = true;
		
		if (TextPLZ.getText().length() == 0)  {
			LabelResult.setText("Bitte Postleitzahl eingeben!");
			plzOK = false;
		} else plzOK = true;
		
		if (TextStrasse.getText().length() == 0) {
			LabelResult.setText("Bitte Straße eingeben!");
			stasseOK = false;			
		} else stasseOK = true;
		
		if (TextGeburtstag.getText().length() != 10) {
			LabelResult.setText("Geburtstag in dd.mm.yyyy eingeben!");
			geburtstagOK = false;
		} else geburtstagOK = true;
		
		if (TextNachname.getText().length() == 0) {
			LabelResult.setText("Bitte Nachnamen eingeben!");
			nachnameOK = false;
		} else nachnameOK = true;
		
		if (TextVorname.getText().length() == 0) {
			LabelResult.setText("Bitte Vornamen eingeben!");
			vornameOK = false;
		} else vornameOK = true;
		
		if (vornameOK && nachnameOK && geburtstagOK && stasseOK && plzOK && ortOK)
			LabelResult.setText("alles ok");
	}
}