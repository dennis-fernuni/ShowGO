package element.person;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
	private String Name;
	private GregorianCalendar Geburtstag;
	
	Person (String name, GregorianCalendar geburtstag) {
		this.Name = name;
		this.Geburtstag = geburtstag;
	}

	@Override
	public String toString() {
		return "Person [Geburtstag=" + Geburtstag.get(Calendar.DAY_OF_MONTH) + "." + Geburtstag.get(Calendar.MONTH) + "." + Geburtstag.get(Calendar.YEAR) + ", Name=" + Name + "]";
	}
	
}
