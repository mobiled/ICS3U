package addo;

public class PennyPitch {

	public static boolean[][] pennies = new boolean[5][5];

	public static void main(String[] args) {
		String[][] board = new String[5][5];

		String[] prizes = { "[PUZZLE]", "[POSTER]", "[ BALL ]", "[ DOLL ]", "[ GAME ]" };
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = "[      ]";
			}
		}
		putPrizeInEmptySpot(board, prizes);
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		putPennyInSpot(board, prizes);
	}

	public static void putPrizeInEmptySpot(String[][] arr, String[] prize) {
		int a = (int) (Math.random() * 5);
		int b = (int) (Math.random() * 5);
		for (int counter = 0; counter < 3; counter++) {
			for (int x = 0; x < prize.length; x++) {
				while (!arr[a][b].equals("[      ]")) {
					a = (int) (Math.random() * 5);
					b = (int) (Math.random() * 5);
				}
				arr[a][b] = prize[x];
			}

		} 
	}

	public static void putPennyInSpot(String[][] arr, String[] prizes) {
		int a = (int) (Math.random() * 5);
		int b = (int) (Math.random() * 5);
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		int counter5 = 0;
		for (int i = 1; i <= 10; i++) {
			while (!pennies[a][b] == (false)) {
				a = (int) (Math.random() * 5);
				b = (int) (Math.random() * 5);
			}
			pennies[a][b]=true;
		}
		for (int i = 0; i < pennies.length; i++) {
			for (int j = 0; j < pennies[i].length; j++) {
				if(arr[i][j]==prizes[0]&&pennies[i][j]==true){
					counter1++;
				}
				if(arr[i][j]==prizes[1]&&pennies[i][j]==true){
					counter2++;
				}
				if(arr[i][j]==prizes[2]&&pennies[i][j]==true){
					counter3++;
				}
				if(arr[i][j]==prizes[3]&&pennies[i][j]==true){
					counter4++;
				}
				if(arr[i][j]==prizes[4]&&pennies[i][j]==true){
					counter5++;
				}
					
			}
		}

		if (counter1 == 3) {
			System.out.println("You win a puzzle");
		}
		if (counter2 == 3) {
			System.out.println("You win a poster");
		}
		if (counter3 == 3) {
			System.out.println("You win a ball");
		}
		if (counter4 == 3) {
			System.out.println("You win a doll");
		}
		if (counter5 == 3) {
			System.out.println("You win a game");
		}
		if (counter1!=3&&counter2!=3&&counter3!=3&&counter4!=3&&counter5!=3){
			System.out.println("You win nothing");
		}

		

	}
}
