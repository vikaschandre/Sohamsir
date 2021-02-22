package variable;

public class Methods {
	
	void m1()                          // INSTANCE METHOD
	{
		System.out.println("M1: NO RETURN TYPE, NO PARAMETER");
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	static void m2(int c)            // STATIC METHOD
	{
		System.out.println("M2: RETURN TYPE-NO, PARAMETER ACCEPTING-YES");
		System.out.println(c);
	}
	
	int m3()                 // INSTANCE METHOD
	{
		System.out.println("M3: RETURN TYPE-YES, PARAMETER ACCEPTING-NO");
		int x=10;
		int y=20;
		int c=x+y;
		return c;
	}
	
	static int m4(int d, int e)          // STATIC METHOD
	{
		System.out.println("M4: RETURN TYPE-YES, PARAMETER ACCEPTING-YES");
		int z=d*e;
		return z;
	}
	
	
	
	public static void main(String[] args) {
		Methods Met= new Methods();
		
		Met.m1();                          // CALLING METHOD 1 ==== RETURN TYPE: NO,  PARAMETER PASSING: NO
		
		Methods.m2(20);                   // CALLING METHOD 2 === RETURN TYPE: NO,  PARAMETER PASSING: YES
		
		int f=Met.m3();                  // CALLING METHOD 3 ===  RETURN TYPE: YES,  PARAMETER PASSING: NO
		System.out.println(f);
		
		int u =Methods.m4(30, 40);        //CALLING METHOD 4 ===  RETURN TYPE: YES,  PARAMETER PASSING: YES
		System.out.println(u);

	}

}
