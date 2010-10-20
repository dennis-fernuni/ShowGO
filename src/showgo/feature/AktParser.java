package showgo.feature;

public class AktParser {

	public void parsen(String inText) {
		String[] akteText = inText.split("<!--aufzug-->");

		for (String i : akteText) {
			if (i.contains("<!--/aufzug-->")) {

				System.out.println(i.split("<!--/aufzug-->")[0]);

			}
		}
	}
}
