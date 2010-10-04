package element.person;

import java.util.GregorianCalendar;

public class TestPerson {

	public static void main (String[] args) {
		Person Dennis = new Person("Dennis", new GregorianCalendar(1983,8,26));
		Person Daniel = new Person("Daniel", new GregorianCalendar(1984,8,9));
		System.out.println(Dennis.toString());
		System.out.println(Daniel.toString());
		Eingabemaske a = new Eingabemaske();
		a.setVisible(true);
		a.setF(Dennis.toString());
	}
}
