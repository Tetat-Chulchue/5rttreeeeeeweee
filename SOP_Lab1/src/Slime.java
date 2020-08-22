
public class Slime extends Monster implements Cloneable {
	
	private int health;
	private int attackPower;
	
	public Slime(int health, int attackPower) {
		super(health, attackPower);
	}
	
	public Slime clone() {
		Slime s = new Slime(this.health, this.attackPower);
		// TODO: Add slime to monsterPool
		return s;
	}
}
