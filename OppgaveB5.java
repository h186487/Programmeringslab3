import static javax.swing.JOptionPane.*;
public class OppgaveB5 {

	public static void main(String[] args) {
		
		String input = showInputDialog("Enter your score :");
		
		int grade = Integer.parseInt(input);
		
		String Grade;
		if (grade >= 90 && grade <=100) {
			Grade = "A";
			
		} else if (grade >=80 && grade <= 89) {
			Grade = "B";
		
		} else if (grade >=60 && grade <= 79) {
			Grade = "C";
			
		} else if (grade >=50 && grade <=59) {
			Grade = "D";
			
		} else if (grade >=40 && grade <=49) {
			Grade = "E";
			
		} else if (grade >=0 && grade <=39) {
			Grade = "F";
			
		} else {
			Grade = "Invalid score. Please enter a number from 0 and 100";
		}
		
		
		System.out.println("Your grade is: " + Grade);
		
		

	}

}
