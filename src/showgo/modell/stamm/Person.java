package showgo.modell.stamm;

public class Person {

	private String Name;
	private String Geburtsdatum;
	private String Geschlecht;
	private String Adresse;

	public Person(String name, String geburtsdatum, String geschlecht,
			String adresse) {
		super();
		Name = name;
		Geburtsdatum = geburtsdatum;
		Geschlecht = geschlecht;
		Adresse = adresse;
	}

	@Override
	public String toString() {
		return "Person [Adresse=" + Adresse + ", Geburtsdatum=" + Geburtsdatum
				+ ", Geschlecht=" + Geschlecht + ", Name=" + Name + "]";
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		Geburtsdatum = geburtsdatum;
	}

	public String getGeburtsdatum() {
		return Geburtsdatum;
	}

	public void setGeschlecht(String geschlecht) {
		Geschlecht = geschlecht;
	}

	public String getGeschlecht() {
		return Geschlecht;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getAdresse() {
		return Adresse;
	}

}