import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
			System.out.println("Hello there user, Wanna give a input? ;)");
		   Scanner sc = new Scanner(System.in);
	        int INPUT = sc.nextInt();
	        sc.close();
	        int NUM=INPUT;
	        int EXP=INPUT;
	        double SUM=0;
			int COUNT=0;
	        while(EXP>0)
	        {
	        	COUNT++;
	        	EXP=EXP/10;
	        }
	        while(NUM!=0)
	        {
	        	SUM=SUM+Math.pow(NUM%10,COUNT);
	        	NUM=NUM/10;
	        }
	        if(INPUT==SUM)
	        {
	        	System.out.println("It is armstrong");
	        }
	        else
	        {
	        	System.out.println("Nope. Not armstrong.");
	        }
	        
	}

}
