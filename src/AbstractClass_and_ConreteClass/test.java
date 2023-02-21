package AbstractClass_and_ConreteClass;

public abstract class test 
{
	//Abstract Class
	
	/* Abstract keyword is used to create abstract class and abstract method
	 * we can not create the object of abstract class
	 * we can create infinite abstract and non-abstract method in abstract class
	 * we can create only abstract methods / incomplete methods in abstract class
	 * we can also create only non-abstract methods / complete methods in abstract class
	 * 
	 * we have to create concrete class as a sub class of abstract class to implement abstract methods 
	 */

	public abstract void m1();		
	
	/* The methods which are only declared not define or
	 * do not have method body those methods are as incomplete method / abstract method
	 */
	
	public abstract void m2();			//abstract/incomplete method
	
	public abstract void m3();			//abstract/incomplete method
	
	
	public void m4()
	{
		System.out.println("m4 from parent class");		//complete/non-abstract method 
	}
	
	/*The methods which are declared and also have method body
	 * those methods called as complete method/non-abstract method
	 */
	
	public void m5()
	{
		System.out.println("m5 from parent class");				//complete/non-abstract method
	}
	
	public void m6()
	{
		System.out.println("m6 from parent class");				//complete/non-abstract method
	}
	
	
}
