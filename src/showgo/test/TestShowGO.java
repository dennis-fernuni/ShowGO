package showgo.test;

//import showgo.feature.DateiLeser;
import showgo.modell.ShowGO;
import showgo.modell.stamm.Person;
import showgo.modell.stueck.Akt;
import showgo.modell.stueck.Rede;
import showgo.modell.stueck.Regieanweisung;
import showgo.modell.stueck.Stueck;
import showgo.modell.stueck.Szene;

public class TestShowGO {

	public static void main(String[] args) {

		Person max = new Person("Max", "27.12.1990", "m", "Bahnhofsstraße 1");
		Person moritz = new Person("Moritz", "26.08.1983", "m",
				"Hauptstraße 123");
		//Ungültig
		Person fritz = new Person("peter von der uchermark > fritz der kleine //---*-", "30.02.2011", "g", ""); // TODO: Gültigkeitsprüfung hinzufügen
		
		ShowGO.INSTANCE.anlegenPerson(max);
		ShowGO.INSTANCE.anlegenPerson(moritz);
		ShowGO.INSTANCE.anlegenPerson(fritz);
		System.out.println(ShowGO.INSTANCE.toString());
		
		//DateiLeser blub = new DateiLeser();
		//System.out.println(blub.lesen());
		
		Regieanweisung regie01 = new Regieanweisung("Ein offener Platzt. Blitz und Donner. Drei Hexen treten auf");
		Rede rede01 = new Rede("Wenn kommen wir drey uns wieder entgegen, \n In Donner, Blizen oder Regen?");
		rede01.setWessenRede(max);
		
		Szene szene01 = new Szene("erste Scene");
		szene01.addAbsatz(regie01);
		szene01.addAbsatz(rede01);
		
		Akt akt01 = new Akt("Erster Aufzug");
		akt01.addSzene(szene01);
		
		Stueck stueck01 = new Stueck("MacBeth");
		stueck01.addAkt(akt01);
		
		System.out.println("---");
		System.out.println(stueck01.toString());
	
	}
}