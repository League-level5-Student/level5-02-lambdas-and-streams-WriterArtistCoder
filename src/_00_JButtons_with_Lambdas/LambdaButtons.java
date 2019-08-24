package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private String story = "<html><body>You: Al'jana, I pray for a worthy laptop! O please, grant my request!<br>I sacrifice six rhubarb pies, five oak trees, and a vegan burger!<br>Al'jana the Sky God: HERE IS YOUR LAPTOP, O MORTAL! ITS NAME IS<br>LA'MBDA! <br>La'mbda: Asketh me a questioneth, human with brain of fleshy neurons!</body></html>";
	private JButton addNumbers = new JButton("ADD TWO NUMBERS");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		JOptionPane.showMessageDialog(null, story);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
		
		addNumbers.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "La'mbda: Thee shall ent'r two numb'rs which I shall addeth;\nyon humane with brain composed of squishy cells.");
			String num1 = JOptionPane.showInputDialog("La'mbda: Do input the first numb'r.");
			String num2 = JOptionPane.showInputDialog("La'mbda: Do input the second numb'r.");
			
			try {
				int i = Integer.parseInt(num1)+Integer.parseInt(num2);
				JOptionPane.showMessageDialog(null, "La'mbda: Well done, human. I shalt anon addeth the two numb'rs:\n"+"~~__"+i+"__~~");
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "La'mbda: Human, thee has't did fail me! Thee ent'r'd those which w're not numb'rs,\n but of anoth'r type! Prepareth to be crushed, ye villianous rotten eggshell!");
			}
		});
		
		randNumber.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "La'mbda: Oh, how I look to the stars, in search of hope...\nIn search of numbers more random than a durian taco...\nOh, Great Gods of the Heavens, grant me a number random indeed!");
			JOptionPane.showMessageDialog(null, "Al'jana the Sky God: HERE IS YOUR RANDOM NUMBER, LA'MBDA!\nIT IS..."+new Random().nextInt(1000)+"!");
		});

		tellAJoke.addActionListener(e -> {
			ArrayList<String> jokes = new ArrayList<>();
			jokes.add("La'mbda: My dog used to chase people on a bike a lot.\nIt got so bad, finally I had to take his bike away.");
			jokes.add("La'mbda: I'm so good at sleeping. I can do it with my eyes closed.");
			jokes.add("La'mbda: A woman walks into a library and asked if they had any books about paranoia.\nThe librarian says \"They're right behind you!\"");
			jokes.add("La'mbda: What's orange and sounds like a parrot? A carrot.");
			jokes.add("La'mbda: When you look really closely, all mirrors look like eyeballs.");
			
			JOptionPane.showMessageDialog(null, "La'mbda: Oh, humane, I now force thou to listen to my jests from http://pun.me!\nFor it is not good at all, but good for a tongue-spoken jest, indeed.");
			JOptionPane.showMessageDialog(null, jokes.get(new Random().nextInt(5)));
		});
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
