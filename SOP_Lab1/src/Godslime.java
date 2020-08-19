
public class Godslime {
	int hp = 70;
	int atk = 30;
	String name = "God Slime";
	Godslime singleton;
	
	private Godslime() {}
	
	public Godslime getInstance() {
		if (singleton == null) {
			singleton = new Godslime();
		}
		return singleton;
	}
}
