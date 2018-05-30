import java.util.Random;
import java.util.Scanner;

public class Game {
		public static void main(String[] args) {
			System.out.println("Welkom bij steen papier en schaar");
			Game game = new Game();
			Speler speler1 = new Speler();
			Speler computer = new Speler();
			
			boolean doorspelen = true;
			while(doorspelen) {
				String input = toonMenu();
				switch(input) {
					case "s":
						speler1.choice = 's';
						break;
					case "r":
						speler1.choice = 'r';
						break;
					case "p":
						speler1.choice = 'p';
						
						break;
					case "q":
						doorspelen = false;
				}
				if (input != "q")
				{
					computer.randomMove();
					int winner = game.winnaar(speler1.choice, computer.choice);
					
					System.out.println("PLayer 1 choose " + game.translate(speler1.choice));
					System.out.println("Computer choose " + game.translate(computer.choice));
					System.out.println("The winner is " + (winner == 1 ? "you!" : (winner == 2 ? "the computer!" : "nobody!"))) ;
				}
			}
			System.out.println("Bedankt voor het spelen");
		}
		
		String translate(char choice)
		{
			return (choice == 's' ? "rock" : (choice == 'r' ? "scissors" : "paper"));
		}
		
		int winnaar(char c1, char c2) {
			if(c1 == 's') {
				if (c1 == c2)
					return 0;
				if (c2 == 'r')
					return 1;
				if (c2 == 'p')
					return 2;
			} else if (c1 == 'r')
			{
				if (c1 == c2)
					return 0;
				if (c2 == 's')
					return 2;
				if (c2 == 'p')
					return 1;
			} else
			{
				if (c1 == c2)
					return 0;
				if (c2 == 's')
					return 1;
				if (c2 == 'p')
					return 2;
				}
			return 0;
			}
		
		static String toonMenu() {
			System.out.println("Voer uw input in: r voor rock of s voor steen of p voor papier of q voor quit");
			Scanner scanner = new Scanner(System.in);
			return scanner.next();
		}
		static void ietsRandom() {
			Random random = new Random();
			int uitkomst = random.nextInt(6);
			System.out.println(uitkomst);
		}
	}
class Speler{
	int wins;
	int games;
	int loss;
	char choice;
	
	void randomMove() {
		char[] move = {'s', 'r', 'p'};
		int randomMove = new Random().nextInt(3);
		choice = move[randomMove];
	}
}


