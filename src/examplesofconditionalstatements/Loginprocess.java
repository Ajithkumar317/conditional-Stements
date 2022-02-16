package examplesofconditionalstatements;

public class Loginprocess {
	
		
		
		

	
	

	public static void main(String[] args) {
		String username="Ajith kumar";
		String passcode="@12Ajith3";
		if (username.isEmpty()&& passcode.isEmpty()) {
			System.out.println("Enter login credentials");
			
		} else  {
			if (username.equals("Ajithkumar") && (passcode.equals("@12Ajith3"))) {
				System.out.println("you are login successfully");
				
				
			} 
				else {
					System.out.println("you are enterd wrong one");
				
				}
		}
	}
}
		
	


