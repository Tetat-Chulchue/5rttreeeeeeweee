import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    System.out.println("Key \"WASD\" To Move");
	    System.out.println("Key \"K\" To Attack\n");
	    MonsterPool pool = MonsterPool.getInstance();
	    Boss boss = Boss.getInstance();
	    Hero hero = Hero.getInstance(50, 10);
	    Map map = new Map();
	    
	    while (true) {
	    	map.render(hero.getX(), hero.getY());
	    	System.out.println("[Hero] HP:"+ hero.getHealth() +" ATK:" + hero.getAttackPower());
	    	if (map.checkPosition(hero.getX(), hero.getY()) != 99) {
	    		Monster monster = pool.getMonster(map.checkPosition(hero.getX(), hero.getY()));
	    		System.out.println("[Monster] HP:"+ monster.getHealth() +" ATK: "+ monster.getAttackPower());
	    		System.out.println("Attack: [K]");
	    		System.out.print("--> ");
	    		Scanner key = new Scanner(System.in);
		        String keyInput = key.nextLine();
		        hero.move(keyInput);

		        if (keyInput.equals("K") || keyInput.equals("k")) {
		        	monster.attack(hero);
		        	if (monster.getHealth() <= 0) {
		        		map.removeMonster(hero.getX(), hero.getY());
		        	}
		        	hero.attack(monster);
		        	if (hero.getHealth() == 0) {
		        		break;
		        	}
		        }
	    	} else {
		    	System.out.print("--> ");
		    	Scanner key = new Scanner(System.in);
		        String keyInput = key.nextLine();
		        hero.move(keyInput);
		        System.out.println("");
	    	}
	    	
	    }
	    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	    System.out.println("Game Over!!");
	    System.out.print("You dead \"noob55555\"");
	}
}

