package variable;

public class Instance_and_static 
{
	int a=50;                              // declaration & define of instance variable
	static int b=100;                      // declaration & define of static variable
	
	void m1()                            // m1 is instance method                 
	{    System.out.println("I am instace method");
		System.out.println(a);            //acessing instance variable by instance method. both r instnce, so we directly acess it
		System.out.println(Instance_and_static.b);  //accesing static varible by instance method , both r opposite, so we acees by "class name.varible name"
	}
	 static void m2()            // m2 is static method
	{    System.out.println("I am static method");
		 Instance_and_static var1= new Instance_and_static();  // accesing instne var by static methd,so need to creat object.
		 System.out.println(var1.a);                          // printing instnce var in static by using object
		 System.out.println(Instance_and_static.b); // printing static var in static methd, we access by using "class name.varible name"
	} 

	public static void main(String[] args)  // main static method 
	{
		Instance_and_static var= new Instance_and_static();  // to acess instace mthod in static mthd, we need to create object
		var.m1();                                            // accesing instace mthod in static mthd, by using created object 
		Instance_and_static.m2();                            // to call static method in static staic mthd, we acess by "class name.varible name"

	}
	
}


// STATIC TO STATIC => CLASS NAME.VARIABLE/METHD NAME
//
// STATIC TO INSTANCE => NEED TO CREATE OBJECT
//
//  INSTANCE TO INSTANCE=> DIRECT ACEESS
//
// INSTANCE TO STAIC => CLASS NAME.VARIABLE/METHD NAME


