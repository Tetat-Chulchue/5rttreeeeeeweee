
public class Slime implements Cloneable {
	int hp = 0;
	int atk = 10;
	String name = "";
	boolean isActive = false;
	
	public Slime(String name) {
		this.hp = 30;
		this.name = name;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public Slime clone() {
		return new Slime("Baby Slime");
	}
}
