package Examples2;

public class OverLoad {

	int  sum(int a,long b){
		System.out.println("a method invoked");
		return 1;
	}
	
	void sum(long a,int b){
		System.out.println("b method invoked");
	}

	public static void main(String args[]) {
		OverLoad obj = new OverLoad();
	obj.sum(20L, 20); // Compile Time Error

	}
}
