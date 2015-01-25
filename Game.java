import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.JFrame;


public class Game extends JFrame {
	private static final long serialVersionUID = 1L;
	public static ArrayList<Letter> alphabet;
	public LeapmotionReader read;
	private JFrame theFrame;
	
	public Game() {
		theFrame = new JFrame("Sign language teacher");
		theFrame.addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e) { System.exit(0);} });
		theFrame.pack();
		theFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		theFrame.setVisible(true);
		
		//initAlphabet();
	}
	
	public void initAlphabet() {
		alphabet = new ArrayList<Letter>();
		
		alphabet.add(new Letter("A"));
		alphabet.add(new Letter("B"));
		alphabet.add(new Letter("C"));
		alphabet.add(new Letter("D"));
		alphabet.add(new Letter("E"));
		alphabet.add(new Letter("F"));
		alphabet.add(new Letter("G"));
		alphabet.add(new Letter("H"));
		alphabet.add(new Letter("I"));
		alphabet.add(new Letter("J"));
		alphabet.add(new Letter("K"));
		alphabet.add(new Letter("L"));
		alphabet.add(new Letter("M"));
		alphabet.add(new Letter("N"));
		alphabet.add(new Letter("O"));
		alphabet.add(new Letter("P"));
		alphabet.add(new Letter("Q"));
		alphabet.add(new Letter("R"));
		alphabet.add(new Letter("S"));
		alphabet.add(new Letter("T"));
		alphabet.add(new Letter("U"));
		alphabet.add(new Letter("V"));
		alphabet.add(new Letter("W"));
		alphabet.add(new Letter("X"));
		alphabet.add(new Letter("Y"));
		alphabet.add(new Letter("Z"));
	}
	
	public void play() {
		showStartScreen();
	}
	public void showStartScreen() {
		
	}
	public void showLetterScreen(Letter let) {
		
	}
}
