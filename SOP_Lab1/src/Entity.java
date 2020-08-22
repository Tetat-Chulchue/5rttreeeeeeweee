
public abstract class Entity {
	protected int health;
	protected int attackPower;
	
	public Entity(int health, int attackPower) {
		this.health = health;
		this.attackPower = attackPower;
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
	
	public void attack(Entity target) {
		target.setHealth(target.getHealth() - this.attackPower);
	}
	
	
}
