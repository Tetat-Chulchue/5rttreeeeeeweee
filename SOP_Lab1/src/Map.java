import java.util.HashMap;
import java.util.ArrayList;
public class Map {
	private ArrayList<HashMap<String, Integer>> monsterPosition = new ArrayList<HashMap<String, Integer>>();
	private ArrayList<HashMap<String, Integer>> potions = new ArrayList<HashMap<String, Integer>>();
	private int mapLenght = 10;

	public Map() {
		HashMap<String, Integer> mon1  = new HashMap<String, Integer>();
		mon1.put("id", 0);
		mon1.put("x", 7);
		mon1.put("y", 1);
		
		HashMap<String, Integer> mon2  = new HashMap<String, Integer>();
		mon2.put("id", 1);
		mon2.put("x", 2);
		mon2.put("y", 5);
		
		HashMap<String, Integer> mon3  = new HashMap<String, Integer>();
		mon3.put("id", 2);
		mon3.put("x", 7);
		mon3.put("y", 8);
		
		monsterPosition.add(mon1);
		monsterPosition.add(mon2);
		monsterPosition.add(mon3);

		HashMap<String, Integer> pot1  = new HashMap<String, Integer>();
		pot1.put("id", 0);
		pot1.put("x", 9);
		pot1.put("y", 9);
		
		HashMap<String, Integer> pot2  = new HashMap<String, Integer>();
		pot2.put("id", 1);
		pot2.put("x", 0);
		pot2.put("y", 9);
		
		potions.add(pot1);
		potions.add(pot2);
	}

	public void render(int x, int y){
		for(int i=0;i<this.mapLenght;i++) {
			for (int j=0;j<this.mapLenght;j++) {
				String point = "* ";
				if(x == j && y == i) { 
					point = "H "; 
				} else {
					for(int m=0; m<monsterPosition.size(); m++){
						if (monsterPosition.get(m).get("x") == j && monsterPosition.get(m).get("y") == i) {
							point = "? ";
							break;
						}
					}
					for(int p=0; p<potions.size(); p++){
						if (potions.get(p).get("x") == j && potions.get(p).get("y") == i) {
							point = "P ";
							break;
						}
					}
				}
				System.out.print(point);
			}
			System.out.println("");
		}
	}

	public int checkPosition(int x, int y){
		for(int i=0;i<this.monsterPosition.size();i++){
			HashMap<String, Integer> monster = this.monsterPosition.get(i);
			if (x == monster.get("x") && y == monster.get("y")){
				return monster.get("id");
			}
		}
		for(int i=0;i<this.potions.size();i++){
			HashMap<String, Integer> potion = this.potions.get(i);
			if (x == potion.get("x") && y == potion.get("y")){
				this.potions.remove(i);
				return 100;
			}
		}
		return 99;
	}

	public void removeMonster(int x, int y){
		for(int i=0;i<this.monsterPosition.size();i++){
			HashMap<String, Integer> monster = this.monsterPosition.get(i);
			if (x == monster.get("x") && y == monster.get("y")){
				this.monsterPosition.remove(i);
			}
		}
	}

}
