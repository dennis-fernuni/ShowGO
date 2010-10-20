package showgo.modell.stueck;

public class Absatz {
	private String text;

	public void setText(String inText) {
		this.text = inText;
	}

	public String getText() {
		return this.text;
	}
	
	public Absatz(String inText) {
		setText(inText);
	}

}
