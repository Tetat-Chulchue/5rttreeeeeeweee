import java.util.ArrayList;

public class MonsterPool {
	private int maxSize = 10;
	private ArrayList<Monster> monsterPool = new ArrayList<Monster>();
	private static MonsterPool singleton;
	
	private MonsterPool() {
		Slime s = new Slime(50, 4);
		monsterPool.add(s);
		monsterPool.add(s.clone());
		monsterPool.add(s.clone());
	}
	
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
	
	public int getSize() {return monsterPool.size();}
	
	public Monster getMonster(int index) {
		Monster s = monsterPool.get(index);
		return s;
	}
}
