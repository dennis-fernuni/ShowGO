package showgo.feature;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DateiLeser {
	File datei = new File("Textdateien/Macbeth.html");
	String ausgabe = "";

	public String lesen() {

		try {
			BufferedReader in = new BufferedReader(new FileReader(datei));
			String str;
			while ((str = in.readLine()) != null) {
				ausgabe += str;
			}
			in.close();
		} catch (IOException e) {
		}

		return ausgabe;
	}

}
