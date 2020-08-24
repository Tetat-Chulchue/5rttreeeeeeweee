import java.util.Scanner;

public class Main {
	static int forward = 0;
	
	
	public static void main(String[] args) {
	    System.out.println("Key \"WASD\" To Move");
	    System.out.println("Key \"K\" To Attack\n");
	    MonsterPool pool = MonsterPool.getInstance();
	    Boss boss = Boss.getInstance();
	    Hero hero = Hero.getInstance(100, 10);
	    Map map = new Map();
	    
	    while (true) {
	    	map.render(hero.getX(), hero.getY());
	    	System.out.println("Hero --> HP:"+ hero.getHealth() +" ATK:" + hero.getAttackPower());
	    	
	    	System.out.print("--> ");
	    	
	    	Scanner key = new Scanner(System.in);
	        String keyInput = key.nextLine();
	        hero.setPosition(keyInput);
	        System.out.println("");
	    }
	}
}

