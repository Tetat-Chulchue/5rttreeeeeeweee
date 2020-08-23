
public class Boss {
	int health = 70;
	int attackPower = 30;

	private static Boss singleton;
	
	private Boss() {}
	
	public static Boss getInstance() {
		if (singleton == null) {
			singleton = new Boss();
		}
		return singleton;
	}
}
