package showgo.modell;

import java.util.ArrayList;
import java.util.List;
import showgo.modell.stamm.Person;

/**
 * @author knobloch
 *
 */
public enum ShowGO {
	INSTANCE;
	
	private ShowGO() {
		// TODO: Weitere Attribute hinzufügen
		PersonenListe = new ArrayList<Person>();
		// TODO: EnsembleListe = new ArrayList<EnsembleMitglied>;
		// TODO: StueckeListe = new ArrayList<Stueck>;
	}

	private List<Person> PersonenListe;

	/**
	 * @param neuePerson Objekt einer neuen Person
	 */
	public void anlegenPerson(Person neuePerson) {
		PersonenListe.add(neuePerson);
	}

	public List<Person> getPersonenListe() {
		return PersonenListe;
	}

	@Override
	public String toString() {
		return "ShowGO [PersonenListe=" + PersonenListe.toString() + "]";
	}

}