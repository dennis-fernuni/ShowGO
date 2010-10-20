package showgo.feature;

public class GeneralParser {

	private String outText = "";

	public String parsen(String inText, String inSplit) {
		String[] splittedText = inText.split("<!--" + inSplit + "-->");

		for (String i : splittedText) {
			if (i.contains("<!--/" + inSplit + "-->")) {
				outText += i.split("<!--/" + inSplit + "-->")[0];
				outText += "<split>";

			}
		}
		
		if (this.outText.length() > 7)
			this.outText = this.outText.substring(0, this.outText.length() - 7);
		return this.outText;
	}
}
