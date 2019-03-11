
public class ArmstrongRange {
	public static void main(String[] args) {
		int NUM;
		for(NUM=100;NUM<999;NUM++)
		{
			if(armStrong(NUM))
			{
				System.out.println("armstrong number is" + NUM);
			}
		}
	}
	public static boolean armStrong(int number)
	{
		int sum=0;
		int copy=number;
		while(copy!=0)
		{
			int lastdig=copy%10;
			sum+= lastdig*lastdig*lastdig;
			copy /=10;
		}
		if(sum==number)
		{
			return true;
		}
		else 
			return false;
	}
}
