import java.util.Scanner;

public class SearchingArray {
	public static void main(String[] args) {
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int num;
		int count=1;
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		sc.close();
		for(num=0;num<15;num++)
		{
			if(input!=arr[num])
			{
				count++;
				if(count>15)
				{
					System.out.println("Number not in array");
				}
			}
			else if(input==arr[num])
			{
				System.out.println("Number"+" "+arr[num]+" "+"found on"+" "+count+" "+"position");
			}
		}
				
	}
}
