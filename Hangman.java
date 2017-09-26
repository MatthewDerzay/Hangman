import java.util.Scanner;
import javax.swing.JFrame;

public class Hangman {
	public static Scanner scnr = new Scanner(System.in);
	public static String[] words = {"Mario", "Luigi", "Donkey Kong", "Yoshi", "Link", "Samus", "Fox",
								"Captain Falcon", "Pikachu", "Jigglypuff", "Kirby", "Ness"};
	private static Frame frame;
	
	public Hangman(){
		frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		Hangman game = new Hangman();
		
		game.printBoard(1, frame);
	}
	
	public void printBoard(int wrongGuesses, Frame frameP) {
		switch(wrongGuesses) {
			case 0:
				frameP.changeImage("Hangman.jpg");
				break;
			case 1:
				frameP.changeImage("Hangman1.jpg");
				break;
			case 2:
				frameP.changeImage("Hangman2.jpg");
				break;
			case 3:
				frameP.changeImage("Hangman3.jpg");
				break;
			case 4:
				frameP.changeImage("Hangman4.jpg");
				break;
			case 5:
				frameP.changeImage("Hangman5.jpg");
				break;
			case 6:
				frameP.changeImage("Hangman6.jpg");
				break;
		}
	}
}
