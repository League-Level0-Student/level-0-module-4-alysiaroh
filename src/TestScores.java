import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		//Write code to ask the user for their test score.
		
		//Your program MUST allow the user to enter a test score that has a decimal, e.g. 75.5
		String testScore = JOptionPane.showInputDialog("What is your test score?");
		Double finScore = Double.parseDouble(testScore);
		if(finScore<=49.4) {
			JOptionPane.showMessageDialog(null, "Sorry, but you need to try harder next time :(");
		}
		else if(finScore>=49.5&&finScore<=69.4) {
			JOptionPane.showMessageDialog(null, "You could do better.");
		}
		else if(finScore>=69.5&&finScore<=89.4) {
			JOptionPane.showMessageDialog(null, "Good job!");
		}
		else if(finScore>=89.5&&finScore<=99.4) {
			JOptionPane.showMessageDialog(null, "Wow, great job!");
		}
		else if(finScore==100||finScore>=99.5) {
			JOptionPane.showMessageDialog(null, "whadda superstar we stan a legend");
		}
		//Give them a different message according to their score.

		//                 Example: "Wow! You must have studied really hard for that test!"


		//HINT: Think about how you would convert a String to an int and use SIMILAR code to convert their test score to a double.
		
		
		
		
		
		
	}
		
}
