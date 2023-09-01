package Mavenprojectpractice.testing;
class ONE
{
	void method(int age)
	{
		if(age>50) 
		{
			System.out.println("boss in one");
		}else if(age<50)
		{
			System.out.println("emp in one");	
		}
		
	}
}
class two extends ONE
{  @Override
	void method(int age)
	{
		//super.method(60);
		if(age>50) 
		{
			System.out.println("boss in two");
		}else if(age<50)
		{
			System.out.println("emp  in two");	
		}
	}	
}
class three extends two
{ @Override
	void method(int age)
	{
		//super.method(45);
		if(age>50) 
		{
			System.out.println("boss in three ");
		}else if(age<50)
		{
			System.out.println("emp in three");	
		}
	}	
}
public class Extending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two tt=new two();
		tt.method(25);
	}

}
