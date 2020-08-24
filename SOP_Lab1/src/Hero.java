public class Hero extends Entity {
	private int x = 0;
	private int y = 0;
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
	
	public void move(String input) {
        if (input.equals("W") || input.equals("w")) {
        	if (this.y > 0) {
        		this.y--;
        	}
        }
        if (input.equals("A") || input.equals("a")) {
        	if (this.x > 0) {
        		this.x--;
        	}
        }
        if (input.equals("S") || input.equals("s")) {
        	if (this.y < 9) {
        		this.y++;
        	}
        }
        if (input.equals("D") || input.equals("d")) {
        	if (this.x < 9) {
        		this.x++;
        	}
        }
	}
	
	public int getX() {return x;}
	public int getY() {return y;}
	
}
