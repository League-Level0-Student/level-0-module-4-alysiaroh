package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinesslevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String input1 = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i=0;i<100;i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your "+ input1+" happy?", "cringe pet roleplay", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed your " +input1, "Cuddle your "+input1, "Clean up your "+input1+"'s poop so your "+input1+" doesn't eat its poop and die" }, null);
			// 5. Use user input to call the appropriate method created in step 4.
			if(task==0) {
				feedPet();
			}
			else if(task==1) {
				cuddlePet();
			}
			else if(task==2) {
				cleanUpPoop();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinesslevel>=200) {
				JOptionPane.showMessageDialog(null, "You love your "+input1);
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void cleanUpPoop() {
		JOptionPane.showMessageDialog(null, "Your pet doesn't seem like it cares that much, but at least you'll be happy knowing your pet didn't die due to eating its excretions.");
		happinesslevel++;
	}
	static void feedPet() {
		JOptionPane.showMessageDialog(null,"Your pet loves food");
		happinesslevel+=50;
	}
	static void cuddlePet() {
		JOptionPane.showMessageDialog(null, "Your pet likes the cuddles, but more importantly, your pet likes the attention.");
		happinesslevel+=25;
	}
}