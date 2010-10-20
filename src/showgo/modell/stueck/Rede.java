package showgo.modell.stueck;

import showgo.modell.stamm.Person;

public class Rede extends Absatz{

	//private Rolle wessenRede;
	private Person wessenRede;
	
	@Override
	public String toString() {
		return "Rede [wessenRede=" + wessenRede + "; " + super.getText() + "]";
	}

	public Rede(String inText) {
		super(inText);
		setWessenRede(null);
		// TODO Auto-generated constructor stub
	}

	public void setWessenRede(Person wessenRede) {
		this.wessenRede = wessenRede;
	}

	public Person getWessenRede() {
		return wessenRede;
	}

	/*public void setWessenRede(Rolle wessenRede) {
		this.wessenRede = wessenRede;
	}	

	public Rolle getWessenRede() {
		return wessenRede;
	}*/

}
