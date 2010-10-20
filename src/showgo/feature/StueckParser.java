package showgo.feature;

public class StueckParser {
	public void parsen(String inText) {
		String[] stueckeText = inText.split("<!--stueck-->");

		for (String i : stueckeText) {
			if (i.contains("<!--/stueck-->")) {
				// gibt nur den Text zwischen "<!--/stueck-->" und
				// "<!--/stueck-->" aus
				System.out.println(i.split("<!--/stueck-->")[0]);

			}
		}
	}
}
