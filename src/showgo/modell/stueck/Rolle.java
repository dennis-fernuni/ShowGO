package showgo.modell.stueck;

import java.util.ArrayList;

public class Rolle {
	private ArrayList<Rede> redeListe;
	
	public Rolle () {
		redeListe = new ArrayList<Rede>();
	}
	
	public void redeHinzu (Rede rede) {
		redeListe.add(rede);
	}
}
