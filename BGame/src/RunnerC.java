public class RunnerC {

	public static void main(String[] args) {
		RunnerC a = new RunnerC();

		a.lookMet();

		MainGame newG = new MainGame();

		newG.Swampy();
		int[] playerPos = newG.playerPos();
		int[] lootPos = newG.addloot(playerPos);

		newG.showSwampy();
		newG.askMove(playerPos);

	}

	public void lookMet() {
		System.out.println(
				"Do you want to play? Enter look \nRules\nPlayer = 2 \nTreasure = 5\nWin = 3\nLose = Exception");
		String scan = InputClass.sc.nextLine();
		if (scan.equals("look")) {
			System.out.println(
					"You awaken to find yourself in a barren moore. Grey foggy clouds float oppressively close to you, \nreflected in the murky grey water which reaches up your shins.\nSome black pants barely poke out of the shallow water.");
			System.out.println("");

		}
	}
}
