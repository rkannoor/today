package Mavenprojectpractice.testing;

public class Example {
	
	Example(int age)
	{
		System.out.println("abc1 :"+age);
	}
	
	Example(String name)
	{
		this(25);
		System.out.println("abc2:  "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e=new Example("mha");
	//	Example e1=new Example(25,"mahesh");
		//e.abc(25);
		
		
	}

}
