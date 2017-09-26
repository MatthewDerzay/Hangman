import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Frame extends JFrame {
	private final JLabel label;
	private final JButton aJButton;
	private final JButton bJButton;
	private final JButton cJButton;
	private final JButton dJButton;
	private final JButton eJButton;
	private final JButton fJButton;
	private final JButton gJButton;
	private final JButton hJButton;
	private final JButton iJButton;
	private final JButton jJButton;
	private final JButton kJButton;
	private final JButton lJButton;
	private final JButton mJButton;
	private final JButton nJButton;
	private final JButton oJButton;
	private final JButton pJButton;
	private final JButton qJButton;
	private final JButton rJButton;
	private final JButton sJButton;
	private final JButton tJButton;
	private final JButton uJButton;
	private final JButton vJButton;
	private final JButton wJButton;
	private final JButton xJButton;
	private final JButton yJButton;
	private final JButton zJButton;
	
	public Frame() {
		super("Super Smash Bros Hangman");
		setLayout(new GridLayout(5,5));
		
		Icon image = new ImageIcon(getClass().getResource("Hangman.png"));
		label = new JLabel("Guess a Letter", image, SwingConstants.LEFT);
		add(label);
		
		aJButton = new JButton("A");
		add(aJButton);
		
		bJButton = new JButton("B");
		add(bJButton);
		
		cJButton = new JButton("C");
		add(cJButton);
		
		dJButton = new JButton("D");
		add(dJButton);
		
		eJButton = new JButton("E");
		add(eJButton);
		
		fJButton = new JButton("F");
		add(fJButton);
		
		gJButton = new JButton("G");
		add(gJButton);
		
		hJButton = new JButton("H");
		add(hJButton);
		
		iJButton = new JButton("I");
		add(iJButton);
		
		jJButton = new JButton("J");
		add(jJButton);
		
		kJButton = new JButton("K");
		add(kJButton);
		
		lJButton = new JButton("L");
		add(lJButton);
		
		mJButton = new JButton("M");
		add(mJButton);
		
		nJButton = new JButton("N");
		add(nJButton);
		
		oJButton = new JButton("O");
		add(oJButton);
		
		pJButton = new JButton("P");
		add(pJButton);
		
		qJButton = new JButton("Q");
		add(qJButton);
		
		rJButton = new JButton("R");
		add(rJButton);
		
		sJButton = new JButton("S");
		add(sJButton);
		
		tJButton = new JButton("T");
		add(tJButton);
		
		uJButton = new JButton("U");
		add(uJButton);
		
		vJButton = new JButton("V");
		add(vJButton);
		
		wJButton = new JButton("W");
		add(wJButton);
		
		xJButton = new JButton("X");
		add(xJButton);
		
		yJButton = new JButton("Y");
		add(yJButton);
		
		zJButton = new JButton("Z");
		add(zJButton);
		
		ButtonHandler handler = new ButtonHandler();
		aJButton.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(Frame.this, String.format("You pressed: %s", event.getActionCommand()));
		}
	}
	
	public void changeImage(String imageName) {
		Icon newImage = new ImageIcon(getClass().getResource(imageName));
		label.setIcon(newImage);
	}
}
