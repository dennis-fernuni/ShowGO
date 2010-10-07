package showgo.modell.stamm;

/**
 * @author knobloch
 *
 */
public class Person {

	private String Name;
	private String Geburtsdatum;
	private String Geschlecht;
	private String Adresse;

	/**
	 * @param name Name der Person "Max Mustermann"
	 * @param geburtsdatum Geburtdatum der Person "dd.mm.yyyy"
	 * @param geschlecht Geschlecht "m" für male, "f" für female
	 * @param adresse "Adresse der Person, "Nilweg 1; 12345 Schönhausen"
	 */
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

	/**
	 * @param name Name der Person "Max Mustermann"
	 */
	public void setName(String name) {
		this.Name = name;
	}

	/**
	 * @return Name der Person als String
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param geburtsdatum Geburtsdatum als Sting "dd.mm.yyyy"
	 */
	public void setGeburtsdatum(String geburtsdatum) {
		Geburtsdatum = geburtsdatum;
	}

	/**
	 * @return Geburtsdatum Geburtsdatum als Sting "dd.mm.yyyy"
	 */
	public String getGeburtsdatum() {
		return Geburtsdatum;
	}

	/**
	 * @param geschlecht geschlecht "m" für male, "f" für female
	 */
	public void setGeschlecht(String geschlecht) {
		Geschlecht = geschlecht;
	}

	/**
	 * @return Geschlecht "m" für male, "f" für female
	 */
	public String getGeschlecht() {
		return Geschlecht;
	}

	/**
	 * @param adresse "Adresse der Person, "Nilweg 1; 12345 Schönhausen"
	 */
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	/**
	 * @return "Adresse der Person, "Nilweg 1; 12345 Schönhausen"
	 */
	public String getAdresse() {
		return Adresse;
	}

}