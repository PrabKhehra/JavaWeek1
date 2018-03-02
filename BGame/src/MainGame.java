public class MainGame {
	int[][] Swampy = new int[10][10];
	String[] Move = new String[4];
	int farMoved;
	int[][] swampy = new int[10][10];

	public void Swampy() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				this.swampy[i][j] = 0;
			}

		}
	}

	public void showSwampy() {
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				System.out.print(this.swampy[i][j]);
			}
			System.out.println();
		}
	}

	public int[] playerPos() {
		int[] playerPosition = new int[2];
		playerPosition[0] = (int) (10 * Math.random());
		playerPosition[1] = (int) (10 * Math.random());
		this.swampy[playerPosition[0]][playerPosition[1]] = 2;
		return playerPosition;
	}

	public int[] addloot(int[] playerPos) {
		int[] lootPos = new int[2];
		do {
			lootPos[0] = (int) (10 * Math.random());
			lootPos[1] = (int) (10 * Math.random());
		} while (lootPos[0] == playerPos[0] && lootPos[1] == playerPos[1]);
		this.swampy[lootPos[0]][lootPos[1]] = 5;
		return lootPos;

	}

	public void askMove(int[] playerPos) {

		int i = 0;
		do {
			System.out.println("Do you want to move North, South, East or West?");
			String scan = InputClass.sc.nextLine();

			if (scan.equals("north") || scan.equals("n")) {
				this.swampy[playerPos[0]][playerPos[1]] = 0;
				playerPos[0] = playerPos[0] - 1;
				if (this.swampy[playerPos[0]][playerPos[1]] == 5) {
					this.swampy[playerPos[0]][playerPos[1]] = 3;
					System.out.println("You Badman You Win");
					showSwampy();
				}

			} else if (scan.equals("south") || scan.equals("s")) {
				this.swampy[playerPos[0]][playerPos[1]] = 0;
				playerPos[0] = playerPos[0] + 1;
				if (this.swampy[playerPos[0]][playerPos[1]] == 5) {
					this.swampy[playerPos[0]][playerPos[1]] = 3;
					System.out.println("You Badman You Win");
					showSwampy();
				}

			} else if (scan.equals("east") || scan.equals("e")) {
				this.swampy[playerPos[0]][playerPos[1]] = 0;
				playerPos[1] = playerPos[1] + 1;
				if (this.swampy[playerPos[0]][playerPos[1]] == 5) {
					this.swampy[playerPos[0]][playerPos[1]] = 3;
					System.out.println("You Badman You Win");
					showSwampy();
				}

			} else if (scan.equals("west") || scan.equals("w")) {
				this.swampy[playerPos[0]][playerPos[1]] = 0;
				playerPos[1] = playerPos[1] - 1;
				if (this.swampy[playerPos[0]][playerPos[1]] == 5) {
					this.swampy[playerPos[0]][playerPos[1]] = 3;
					System.out.println("You Badman You Win");
					showSwampy();
				}

			}

		} while (i == 0);

	}

}
