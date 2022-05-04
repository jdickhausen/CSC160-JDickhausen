
public class Player extends Die{
	private String name;
	private String die;
	
	public Player (String name, String die, int value) {
		super();
		this.name = name;
		this.die = die;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDie() {
		return die;
	}
	public void setDie(String die) {
		this.die = die;
	}
}
