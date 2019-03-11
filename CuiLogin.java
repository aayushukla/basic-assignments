import java.util.Scanner;

public class CuiLogin {
public static void main(String[] args) {
	int CountLoginAttempts=0;
	String Name="aayush";
	String Password="shukla";
	for(int count=0;count<3;count++)
	{
	System.out.println("Enter the username:");
	Scanner sc=new Scanner(System.in);
	String inputUserName=sc.nextLine();
	System.out.println("Enter your password:");
	String inputPassWord=sc.nextLine();
	if(Name.equalsIgnoreCase(inputUserName)&&Password.equals(inputPassWord))
	{
		System.out.println("Welcome Master!");
		break;
	}
	else
	{
		CountLoginAttempts++;

	}
	
	}
	if(CountLoginAttempts>3)
	{
		System.out.println("Contact the admin!");
		System.exit(0);
	}
}
}