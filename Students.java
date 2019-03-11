import java.util.Scanner;

public class Students {
	public static void main(String[] args) {
		System.out.println("How much rahul score in maths hindi and science respectively");
		Scanner sc=new Scanner(System.in);
		int rMaths=sc.nextInt();
		int rHindi=sc.nextInt();
		int rScience=sc.nextInt();
		
		System.out.println("How much kenny score in maths hindi and science respectively");
		int kMaths=sc.nextInt();
		int kHindi=sc.nextInt();
		int kScience=sc.nextInt();
		
		System.out.println("How much xyp9x score in maths hindi and science respectively");
		int xMaths=sc.nextInt();
		int xHindi=sc.nextInt();
		int xScience=sc.nextInt();
		sc.close();
		
		int mathsavg=(rMaths+xMaths+kMaths)/3;
		System.out.println("Average score in maths is"+" "+mathsavg);
		
		int hindiavg=(rHindi+xHindi+kHindi)/3;
		System.out.println("Hindi avg is"+" "+hindiavg);
		
		int scavg=(rScience+xScience+kScience)/3;
		System.out.println("science avg is"+ " "+ scavg);
		
		int ravg=(rHindi+rMaths+rScience)/3;
		System.out.println("Average of rahul is"+" "+ravg);
		
		int kavg=(kHindi+kMaths+kScience)/3;
		System.out.println("Average of kenny is"+" "+kavg);
		
		int xavg=(xHindi+xMaths+xScience)/3;
		System.out.println("Average of xyp9x is"+" "+xavg);
	}
}
