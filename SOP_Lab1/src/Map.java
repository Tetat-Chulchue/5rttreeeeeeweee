
public class Map {
	private int mapLenght = 10;
	public Map() {
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
				System.out.println("");
			}
		}
	}

	public boolean cheackPosition(){

	}

}
