public abstract class Monster extends Entity {
	private int health;
	private int attackPower;
	
	public Monster(int health, int attackPower) {
		super(health, attackPower);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
}
