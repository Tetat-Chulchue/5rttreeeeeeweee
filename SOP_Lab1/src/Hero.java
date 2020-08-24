public class Hero extends Entity {
	private static int x = 0;
	private static int y = 0;
	private static Hero singleton;
	
	public static Hero getInstance(int health, int attackPower) {
		if (singleton == null) {
			singleton = new Hero(health, attackPower);
		}
		return singleton;
	}
	
	private Hero(int health, int attackPower) {
		super(health, attackPower);
	}

	public int getHealth() {
		return super.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttackPower() {
		return super.attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public void setPosition(String input) {
        
        if (input.equals("W") || input.equals("w")) {
        	System.out.println("Hero move: W");
        }
        if (input.equals("A") || input.equals("a")) {
        	System.out.println("Hero move: A");
        }
        if (input.equals("S") || input.equals("s")) {
        	System.out.println("Hero move: S");
        }
        if (input.equals("D") || input.equals("d")) {
        	System.out.println("Hero move: D");
        }
	}
	
}
