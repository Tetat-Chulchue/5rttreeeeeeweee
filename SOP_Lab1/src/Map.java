import java.util.HashMap;
import java.util.ArrayList;
public class Map {
	private ArrayList<HashMap<String, Integer>> monsterPosition = new ArrayList<HashMap<String, Integer>>();
	private int mapLenght = 10;
	public Map() {
		HashMap<String, Integer> mon1  = new HashMap<String, Integer>();
		mon1.put("x", 7);
		mon1.put("y", 1);
		HashMap<String, Integer> mon2  = new HashMap<String, Integer>();
		mon2.put("x", 2);
		mon2.put("y", 5);
		HashMap<String, Integer> mon3  = new HashMap<String, Integer>();
		mon3.put("x", 7);
		mon3.put("y", 8);
		monsterPosition.add(mon1);
		monsterPosition.add(mon2);
		monsterPosition.add(mon3);
		System.out.println(monsterPosition);
	}

	public void render(int x, int y){
		try {
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i=0;i<this.mapLenght;i++){
			for (int j=0;j<this.mapLenght;j++){
				if(x == j && y == i){
					System.out.print("@ ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}

	public boolean checkPosition(int x, int y){
		for(int i=0;i<3;i++){
			HashMap<String, Integer> monster = this.monsterPosition.get(i);
			if (x == monster.get("x") && y == monster.get("y")){
				return true;
			}
		}
		return false;
	}

	public boolean removeMonster(int x, int y){
		for(int i=0;i<3;i++){
			HashMap<String, Integer> monster = this.monsterPosition.get(i);
			if (x == monster.get("x") && y == monster.get("y")){
				this.monsterPosition.remove(i);
				return 0;
			}
		}
	}

}
