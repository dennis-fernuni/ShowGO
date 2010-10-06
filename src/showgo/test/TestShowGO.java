package showgo.test;

import showgo.modell.ShowGO;
import showgo.modell.stamm.Person;

public class TestShowGO {

	public static void main(String[] args) {

		Person max = new Person("Max", "27.12.1990", "m", "Bahnhofsstraße 1");
		Person moritz = new Person("Moritz", "26.08.1983", "m",
				"Hauptstraße 123");

		ShowGO.INSTANCE.anlegenPerson(max);
		ShowGO.INSTANCE.anlegenPerson(moritz);
		System.out.println(ShowGO.INSTANCE.toString());
	}
}