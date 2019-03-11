import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		System.out.println("Enter your marks for maths");
		   Scanner sc = new Scanner(System.in);
		   int maths=sc.nextInt();
		   System.out.println("Enter marks for eng");
		   int eng=sc.nextInt();
		   System.out.println("enter marks for hindi");
		   int hindi=sc.nextInt();
		   sc.close();
		   if(maths>60&&eng>60&&hindi>60)
			   
		   {
			   System.out.println("You passed");
		   }
		   else if((maths>60&&eng>60)||(maths>60&&hindi>60)||(hindi>60&&eng>60))
		   {
			   System.out.println("you promoted");
		   }
		   else
		   {
			   System.out.println("Failed");
		   }
		   
	}
}
