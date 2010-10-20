package showgo.modell.stueck;

import java.util.ArrayList;

public class Akt {
	private String aktname;
	private ArrayList<Szene> szeneListe;

	public Akt(String inAktname) {
		szeneListe = new ArrayList<Szene>();
		setAktname(inAktname);
	}

	public void setAktname(String aktname) {
		this.aktname = aktname;
	}

	public String getAktname() {
		return aktname;
	}

	public void addSzene(Szene inSzene) {
		this.szeneListe.add(inSzene);
	}

	@Override
	public String toString() {
		return "Akt [aktname=" + aktname + ", szeneListe=" + szeneListe + "]";
	}
}
