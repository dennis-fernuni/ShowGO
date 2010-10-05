package showgo.modell;

import java.util.ArrayList;
import java.util.List;
import showgo.modell.stamm.Person;

public class ShowGO {

	public ShowGO() {
		super();
		PersonenListe = new ArrayList<Person>();
	}

	private List<Person> PersonenListe;

	public void anlegenPerson(Person neuePerson) {
		PersonenListe.add(neuePerson);
	}

	public List<Person> getPersonenListe() {
		return PersonenListe;
	}

	@Override
	public String toString() {
		return "ShowGO [PersonenListe=" + PersonenListe + "]";
	}

}