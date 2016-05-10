import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Hogwarts extends JFrame
	{
		private static final long serialVersionUID = 1L;
		static String name;
		static String house;
		static int Hufflepuff=0;
		static int Ravenclaw=0;
		static int Gryffindor=0;
		static int Slytherin=0;
		static int personality;
		static JFrame frame = new JFrame();
		
		public static void main(String[] args)
		{
			name = JOptionPane.showInputDialog("What is your name?");  
			JOptionPane.showMessageDialog(frame, "Welcome to Hogwarts, " + name);
			
			JOptionPane.showMessageDialog(frame, "You are going to be sorted into your house.");
			
			JOptionPane.showMessageDialog(frame, "I will ask you a seris of questions that will determine your house placement.");
			
			Object[] personalityTraits = {"Kind", "Clever", "Brave", "Sly"};
			personality = JOptionPane.showOptionDialog(frame, "What is your best personality trait?",
					"Personality Traits",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, personalityTraits, personalityTraits[0]);
			
			switch (personality)
			{
				case 0:
						{
							JOptionPane.showMessageDialog(frame, "Interesting");
							Hufflepuff=Hufflepuff+1;
							break;
						}
				case 1:
						{
							JOptionPane.showMessageDialog(frame, "Wonderful");
							Ravenclaw=Ravenclaw+1;
							break;
						}
				case 2:
						{
							JOptionPane.showMessageDialog(frame, "Thank You");
							Gryffindor=Gryffindor+1;
							break;
						}
				case 3:
						{
							JOptionPane.showMessageDialog(frame, "Lovely");
							Slytherin=Slytherin+1;
							break;
						}
			}
			
			String[] schoolLife = {"Care for Magical Creatures", "Transfiguration", "Defense Against the Dark Arts", "Potions"};
				{
					JFrame frame = new JFrame();
					String school = (String) JOptionPane.showInputDialog(frame,
							"What is your favorite schoool subject?",
							"Hogwarts Subjects",
							JOptionPane.QUESTION_MESSAGE, 
							null,
							schoolLife,
							schoolLife);
				switch (school)
				{
				case "Care for Magical Creatures":
						{
							JOptionPane.showMessageDialog(frame, "Fun");
							Hufflepuff=Hufflepuff+1;
							break;
						}
				case "Transfiguration":
						{
							JOptionPane.showMessageDialog(frame, "Great");
							Ravenclaw=Ravenclaw+1;
							break;
						}
				case "Defense Against the Dark Arts":
						{
							JOptionPane.showMessageDialog(frame, "Wonderful");
							Gryffindor=Gryffindor+1;
							break;
						}
				case "Potions":
						{
							JOptionPane.showMessageDialog(frame, "Interesting");
							Slytherin=Slytherin+1;
							break;
						}
				}
				
				}
			Object[] schoolSubject = {"English", "Math", "Science", "History"};
			int subject = JOptionPane.showOptionDialog(frame, "What was your favorite muggle school subject?",
					"Muggle School",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, schoolSubject, schoolSubject[0]);
			switch (subject)
			{
				case 0:
						{
							JOptionPane.showMessageDialog(frame, "Alright");
							Hufflepuff=Hufflepuff+1;
							break;
						}
				case 1:
						{
							JOptionPane.showMessageDialog(frame, "Wow");
							Ravenclaw=Ravenclaw+1;
							break;
						}
				case 2:
						{
							JOptionPane.showMessageDialog(frame, "Fun");
							Gryffindor=Gryffindor+1;
							break;
						}
				case 3:
						{
							JOptionPane.showMessageDialog(frame, "Facsinating");
							Slytherin=Slytherin+1;
							break;
						}
			}
			String[] question1 = {"Run to help", "Think of a solution", "Charge right in", "Leave them: Not my problem"};
				{
					JFrame frame = new JFrame();
					String question = (String) JOptionPane.showInputDialog(frame,
							"Someone is in danger. What do you do?",
							"Moral question",
							JOptionPane.QUESTION_MESSAGE, 
							null,
							question1,
							question1);
				switch (question)
				{
				case "Run to help":
						{
							JOptionPane.showMessageDialog(frame, "Interesting");
							Hufflepuff=Hufflepuff+1;
							break;
						}
				case "Think of a solution":
						{
							JOptionPane.showMessageDialog(frame, "Well then..");
							Ravenclaw=Ravenclaw+1;
							break;
						}
				case "Charge right in":
						{
							JOptionPane.showMessageDialog(frame, "Hmmm.....");
							Gryffindor=Gryffindor+1;
							break;
						}
				case "Leave them: Not my problem":
						{
							JOptionPane.showMessageDialog(frame, "Ok");
							Slytherin=Slytherin+1;
							break;
						}
				}
				
				}
				Object[] favColor = {"Black", "Bronze", "Gold", "Silver"};
				int color = JOptionPane.showOptionDialog(frame, "Of these colors, which do you prefer",
						"Secondary Colors",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, favColor, favColor[0]);
				switch (color)
				{
					case 0:
							{
								JOptionPane.showMessageDialog(frame, "Thinking.....");
								Hufflepuff=Hufflepuff+1;
								break;
							}
					case 1:
							{
								JOptionPane.showMessageDialog(frame, "Thinking.....");
								Ravenclaw=Ravenclaw+1;
								break;
							}
					case 2:
							{
								JOptionPane.showMessageDialog(frame, "Thinking.....");
								Gryffindor=Gryffindor+1;
								break;
							}
					case 3:
							{
								JOptionPane.showMessageDialog(frame, "Thinking.....");
								Slytherin=Slytherin+1;
								break;
							}
				}
			if (Hufflepuff>Ravenclaw && Hufflepuff>Gryffindor && Hufflepuff>Slytherin)
				{
					JOptionPane.showMessageDialog(frame, "Congratulations! You have been sorted into Hufflepuff.");
					JOptionPane.showMessageDialog(frame, "Of dedication, patience, and loyalty you belong.");
				}
			else if (Ravenclaw>Hufflepuff && Ravenclaw>Gryffindor && Ravenclaw>Slytherin)
				{
					JOptionPane.showMessageDialog(frame, "Congratulations! You have been sorted into Ravenclaw.");
					JOptionPane.showMessageDialog(frame, "Of wit, wisdom, and creativity you belong.");
				}
			else if (Gryffindor>Hufflepuff && Gryffindor>Ravenclaw && Gryffindor>Slytherin)
				{
					JOptionPane.showMessageDialog(frame, "Congratulations! You have been sorted into Gryffindor.");
					JOptionPane.showMessageDialog(frame, "Of courage, chivalry, and determination you belong.");
				}
			else if (Slytherin>Hufflepuff && Slytherin>Ravenclaw && Slytherin>Gryffindor)
				{
					JOptionPane.showMessageDialog(frame, "Congratulations! You have been sorted into Slytherin.");
					JOptionPane.showMessageDialog(frame, "Of cunning, resourcefulness, and ambition you belong.");
				}

		}
	}
