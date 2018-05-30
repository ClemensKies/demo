import java.util.Random;
import java.util.Scanner;

public class Game {
		public static void main(String[] args) {
			System.out.println("Welkom bij steen papier en schaar");
			Speler speler1 = new Speler();
			Speler computer = new Speler();
			boolean doorspelen = true;
			while(doorspelen) {
				String input = toonMenu();
				switch(input) {
					case "s":
						break;
					case "r":
						break;
					case "p":
						break;
					case "q":
						doorspelen = false;
				}
				
			}
			System.out.println("Bedankt voor het spelen");
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
	}
}


