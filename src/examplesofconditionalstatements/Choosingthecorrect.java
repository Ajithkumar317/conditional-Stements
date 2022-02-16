package examplesofconditionalstatements;


public class Choosingthecorrect {
	
	

	public static void main(String[] args) {
		String favoritegod="vinayaka";
			switch (favoritegod) {
			case "balaji": {
				System.out.println("Balaji is not favorite god");
				
				
				
				
				
			}
			case "Murugan":{
				System.out.println("Murugan is not favorite god");
			}
			case "vinayaka":{
				System.out.println("vinayaka is the  favorite god");
				break;
			}
				
			default:
				System.out.println("sorry you did't choose  correct one");
			}
			
		
	}

}
