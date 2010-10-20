package showgo.modell.stueck;

import java.util.ArrayList;

public class Stueck {
	private String stueckname;
	private ArrayList<Akt> aktListe;

	public Stueck(String inStueckname) {
		aktListe = new ArrayList<Akt>();
		setStueckname(inStueckname);
	}

	public void setStueckname(String stueckname) {
		this.stueckname = stueckname;
	}

	public String getStueckname() {
		return stueckname;
	}

	public void addAkt(Akt inAkt) {
		this.aktListe.add(inAkt);
	}

	@Override
	public String toString() {
		return "Stueck [aktListe=" + aktListe + ", stueckname=" + stueckname
				+ "]";
	}

}
