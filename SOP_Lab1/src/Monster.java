public abstract class Monster extends Entity {
	
	public Monster(int health, int attackPower) {
		super(health, attackPower);
	}

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttackPower() {
		return this.attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
}
