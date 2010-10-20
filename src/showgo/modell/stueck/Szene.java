package showgo.modell.stueck;

import java.util.ArrayList;

public class Szene {
	private String szenename;
	private ArrayList<Absatz> absatzListe;

	public void setSzenename(String szenename) {
		this.szenename = szenename;
	}

	public String getSzenename() {
		return szenename;
	}

	public Szene(String inSzenename) {
		absatzListe = new ArrayList<Absatz>();
		setSzenename(inSzenename);
	}

	public void addAbsatz(Absatz inAbsatz) {
		absatzListe.add(inAbsatz);
	}
	@Override
	public String toString() {
		return "Szene [absatzListe=" + absatzListe + ", szenename=" + szenename
				+ "]";
	}
}
