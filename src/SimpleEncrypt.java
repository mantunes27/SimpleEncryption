import javax.swing.JOptionPane;


public class SimpleEncrypt {

	
	
	public static void main(String[] args) {
		
		
		
		String userInteger1; // first number
		String userInteger2; // second number
		String userInteger3; // third number
		String userInteger4; // fourth number
		
		
	
		int userInt1;
		int userInt2;
		int userInt3;
		int userInt4;
		
		userInteger1 = JOptionPane.showInputDialog("Enter a number.");	// Asks input to the user
		userInteger2 = JOptionPane.showInputDialog("Enter a number.");	// Asks input to the user
		userInteger3 = JOptionPane.showInputDialog("Enter a number.");	// Asks input to the user
		userInteger4 = JOptionPane.showInputDialog("Enter a number.");	// Asks input to the user
		
		
		userInt1 = Integer.parseInt(userInteger1);						//Converts int to String
		userInt2 = Integer.parseInt(userInteger2);						//Converts int to String
		userInt3 = Integer.parseInt(userInteger3);						//Converts int to String
		userInt4 = Integer.parseInt(userInteger4);						//Converts int to String
		
		int userIntArray[] = {userInt1,userInt2,userInt3,userInt4};		//Array with all the user input ints
		
		for(int i = 0; i < userIntArray.length;i++){					//Encryption algorithm 
			userIntArray[i] = userIntArray[i] + 7 % 10;
			
			}
		userIntArray[0] = userIntArray[2];
		userIntArray[1] = userIntArray[3];
		
		for(int i = 0; i < userIntArray.length;i++){
			System.out.print("Your encrypted number is: " + userIntArray[i]);
		}
		
		
	

	}

}
