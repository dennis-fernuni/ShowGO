package showgo.feature;

public class SzeneParser {

	public void parsen(String inText) {
		String[] szenenText = inText.split("<!--szene-->");

		for (String i : szenenText) {
			if (i.contains("<!--/szene-->")) {

				System.out.println(i.split("<!--/szene-->")[0]);

			}
		}
	}
}
