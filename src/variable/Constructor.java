package variable;

public class Constructor {
	
	boolean x;             // x is instance variable(only declare , not assign any value)
	
	Constructor()       // declare constructor having same name as that of class name
	{
		x=true;                     // assign value to instance variable( THIS IS JOB OF CONSTRUCTOR: ASSIGN VALUE TO INSTANCE VARIABLE)
		System.out.println(x);     // printing instance variable
	}
	
	
	public static void main(String[] args)
	{
		Constructor C= new Constructor();    // creating object of constructor. (CONSTRUCROR IS ALWAYS INSTANCE/ NON STATIC METHOD)
		System.out.println(C.x);
	}

}

// WHAT IS CONSTRUCOR ?
// 1) constructor having same name as that of class name
// 2) construcor is use to execute the logic which is need to execute at the time of object creation eg in office we have to 
//    show msg "WELCOME" at the entrance time. so we print this msg in construcor
// 3) Costructor is use to ASSIGN VALUE TO INSTANCE VARIABLE
// 4) Constructor does not have any return type, even void
// 5) CONSTRUCROR IS ALWAYS INSTANCE/ NON STATIC METHOD