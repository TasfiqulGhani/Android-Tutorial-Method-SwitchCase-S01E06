import java.util.Scanner;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		
		
		
		System.out.print("Please enter a number");
		
		int numberone =sc.nextInt();
		
		System.out.print("Enter 2nd number");
		
		
		int numbertwo=sc.nextInt();
		
		System.out.print("Enter 1 for addition , enter 2 for sub , enter 3 for mult,enter 4 for div");
		int decition=sc.nextInt();  
		
		
		
		switch(decition){
		
		case 1: System.out.print(numberone+numbertwo);
		        break;
		case 2: System.out.print(numberone-numbertwo);
        break;        
		case 3:System.out.print(numberone*numbertwo);
        break;
		case 4: System.out.print(numberone/numbertwo);
        break;
        default: 
        	System.out.print("Please enter valid decition");
        
        break;
		
		
		}
		
		
		
	}

}
