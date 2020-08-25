import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    System.out.println("Key \"WASD\" To Move");
	    System.out.println("Key \"K\" To Attack");
	    System.out.println("[?] = Monster, [P] = Potion\n");
	    MonsterPool pool = MonsterPool.getInstance();
	    Boss boss = Boss.getInstance();
	    Hero hero = Hero.getInstance(40, 10);
	    Map map = new Map();
	    
	    while (true) {
	    	map.render(hero.getX(), hero.getY());
	    	System.out.println("[Hero] HP:"+ hero.getHealth() +" ATK:" + hero.getAttackPower());
	    	int state = map.checkPosition(hero.getX(), hero.getY());
	    	if (state != 99 && state != 100) {
	    		Monster monster = pool.getMonster(state);
	    		if (monster.getHealth() <= 0) {
	        		map.removeMonster(hero.getX(), hero.getY());
	        	} else {
	        		System.out.println("[Monster] HP:"+ monster.getHealth() +" ATK: "+ monster.getAttackPower());
	        		System.out.println("Attack: [K]");
	        	}
	    		System.out.print("--> ");
	    		Scanner key = new Scanner(System.in);
		        String keyInput = key.nextLine();
		        hero.move(keyInput);

		        if (keyInput.equals("K") || keyInput.equals("k")) {
		        	monster.attack(hero);
		        	hero.attack(monster);
		        	if (hero.getHealth() <= 0) {
		        		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		        	    System.out.println("Game Over!!");
		        	    System.out.print("[System] You dead \"noob55555\"");
		        		break;
		        	}
		        	int poolSize = pool.getSize() + 1;
	        		int monsterDead = 1;
		        	for (int i = 0; i < pool.getSize(); i++) {if (pool.getMonster(i).getHealth() <= 0) {monsterDead++;}}
		        	if (poolSize == monsterDead) {
        				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		        	    System.out.print("[System] You Win!!");
		        		break;
        			}
		        }
	    	} else if (state == 100) {
	    		hero.setHealth(hero.getHealth() + 10);
	        	System.out.println("[System] Healing!!");
	    		Scanner key = new Scanner(System.in);
		        String keyInput = key.nextLine();
		        hero.move(keyInput);
	    	} else {
		    	System.out.print("--> ");
		    	Scanner key = new Scanner(System.in);
		        String keyInput = key.nextLine();
		        hero.move(keyInput);
		        System.out.println("");
	    	}
	    	
	    }
	    
	}
}

