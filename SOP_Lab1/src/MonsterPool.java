import java.util.ArrayList;

public class MonsterPool {
	private int maxSize = 10;
	private ArrayList<Monster> monsterPool = new ArrayList<Monster>();
	private static MonsterPool singleton;
	
	private MonsterPool() {}
	
	public static MonsterPool getInstance() {
		if (singleton == null) {
			singleton = new MonsterPool();
		}
		return singleton;
	}
	
	public void addMonster(Monster m) {
		if (monsterPool.size() < this.maxSize) {
			monsterPool.add(m);
		} else {
			System.out.print("Pool is full");
		}
	}
}
