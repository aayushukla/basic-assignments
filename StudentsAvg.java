import java.util.Scanner;

public class StudentsAvg {
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
		
		System.out.println("Maths avg score"+" " +average(xMaths,rMaths,kMaths));
		System.out.println("Maths total score"+" " +add(xMaths,rMaths,kMaths));
		
		System.out.println("Science avg score"+" " + average(xScience,rScience,kScience));
		System.out.println("Science total score"+" " + add(xScience,rScience,kScience));
		
		System.out.println("Hindi avg score"+" " + average(xHindi,rHindi,kHindi));
		System.out.println("Hindi total score"+" " + add(xHindi,rHindi,kHindi));
		
		System.out.println("Rahuls avg score"+" " + average(rHindi,rMaths,rScience));
		
		System.out.println("Kenny avg score"+" " + average(kHindi,kMaths,kScience));
		
		System.out.println("xyp9x avg score"+" " + average(xHindi,xMaths,xScience));
	}
	
	public static int average(int a, int b,int c)
	{
		int sum=(a+b+c)/3;
		return sum;
	}
	public static int add(int x,int y,int z)
	{
		int addition=(x+y+z);
		return addition;
	}
}
