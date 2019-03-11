import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		System.out.println("What is your annual salary?");
		Scanner sc= new Scanner(System.in);
		int sal=sc.nextInt();
		 sc.close();
		if(sal>500000)
		{
			System.out.println("Your income tax is:"+ (3*sal)/10);
		}
		else if(sal<500000&&sal>300001)
		{
			System.out.println("Income tax is :" + sal/5);
		}
		else if(sal>180001&&sal<300000)
		{
			System.out.println("Income taax is :" + sal/10);
		}
		else
			System.out.println("Congrats no tax");
	}

}
