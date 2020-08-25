
public class Slime extends Monster implements Cloneable {
	public Slime(int health, int attackPower) {
		super(health, attackPower);
	}
	
	public Slime clone() {
		super.health = (int)(super.health-(super.health * 0.08));
		Slime s = new Slime((int)(super.health-(super.health * 0.15)), super.attackPower);
		return s;
	}
}
