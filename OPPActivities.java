import javax.swing.*;
public class ExampleJFrame {
	public static void main(String[] args) {
		// Declare variable num
		String num = JOptionPane.showInputDialog("Enter a number: ");
		// Used to convert String to Integer
		int number = Integer.parseInt(num);

		//checks if number is positive or negative
		if (number <0){
			JOptionPane.showMessageDialog(null,"The"+ number +"is Odd");
		}
		else{
			JOptionPane.showMessageDialog(null,"The" + number +"is Even");
		}
	}
}
