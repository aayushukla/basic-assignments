
public class BubbleSort	 
{
	public static void main(String[] args)
	{
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		for(int num=0;num<15;num++)
		{
			for(int num2=0;num2<14-num;num2++)
			{
				if(arr[num2]>arr[num2+1])
				{
					int temp=arr[num2];
					arr[num2]=arr[num2+1];
					arr[num2+1]=temp;
				}
			}
			
		}
		for(int print=0;print<15;print++)
		{
			System.out.print(arr[print]+" ");
		}
	}
}
