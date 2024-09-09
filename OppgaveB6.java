import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveB6 {

	public static void main(String[] args) {
		
		String input = showInputDialog("Enter your gross income");
		
		
		
		int grossIncome = Integer.parseInt(input);
		
		double taxRate = 0.0;
		
//		Determine taxes corresponding to income
		if (grossIncome < 208050) {
			taxRate = 0.0 ;
			
		} else if (grossIncome >= 208051 && grossIncome <= 292850) {
			taxRate = 0.017 ;
		
		} else if (grossIncome >= 292851 && grossIncome <= 670000) {
			taxRate = 0.04 ;
			
		} else if (grossIncome >= 670001 && grossIncome <= 937900) {
			taxRate = 0.136 ;
					
		} else if (grossIncome >= 9379001 && grossIncome <= 1350000) {
			taxRate = 0.166;
					 
		} else {
			taxRate = 0.176;
		}
		
		double sumTax = taxRate * grossIncome;
		
		
		
		
		System.out.println("You will pay = " + sumTax + " in taxes");

	}

}


