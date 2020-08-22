import java.util.ArrayList;

public class MonsterPool {
	int maxSize = 10;
	ArrayList<Monster> monsterPool = new ArrayList<Monster>();
	
	public void addMonster(Monster m) {
		if (monsterPool.size() < this.maxSize) {
			monsterPool.add(m);
		} else {
			System.out.print("Pool is full");
		}
	}
}
