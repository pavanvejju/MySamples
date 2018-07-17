package Examples2;


public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) { int a=0,b=1, c=0;

    int i= 10;
    System.out.println("*******Fibonacci Series*******");
    System.out.println(0);
    while(i>1)
    {
         c = a + b;
         a = b;
         b = c;
         System.out.print(" "+c);
         i--;
   }}

}
