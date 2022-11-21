
public class SwapTwoNumberWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		System.out.println("Before Swapping\n a="+a+"  b="+b);
		swapNumbers(a,b);
		

	}
	
	public static void swapNumbers(int a, int b)
	{
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("\nAfter Swapping\n a="+a+"  b="+b);
	}

}
