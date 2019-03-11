import java.util.Scanner;

public class Intrest {
	public static void main(String[] args) {
		System.out.println("Enter the principal:");
		Scanner sc = new Scanner(System.in);
        int Principal = sc.nextInt();
        System.out.println("Enter the rate:");
        int Rate= sc.nextInt();
        System.out.println("Enter the time:");
        int Time=sc.nextInt();
        sc.close();
        System.out.println("Simple interest of the given values is:" + Principal*Rate*Time);
        int radd=(Rate/100)+1;
        double ci= Principal*(Math.pow(radd,Time)-1);
        System.out.println("Compund interest of the given values is:" + ci);
	}
	
}
