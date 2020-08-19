import java.util.ArrayList;

public class MPool {
	int maxSize = 10;
	ArrayList<Slime> monsterPool = new ArrayList<Slime>();
	
	public void addMonster(Slime s) {
		if (monsterPool.size() < this.maxSize) {
			monsterPool.add(s);
		} else {
			System.out.print("Pool is full");
		}
	}
}
