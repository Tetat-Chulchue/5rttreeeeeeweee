
public class Boss {
	int health = 70;
	int attackPower = 30;

	Boss singleton;
	
	private Boss() {}
	
	public Boss getInstance() {
		if (singleton == null) {
			singleton = new Boss();
		}
		return singleton;
	}
}
