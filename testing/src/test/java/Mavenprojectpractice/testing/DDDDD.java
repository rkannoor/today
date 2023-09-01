package Mavenprojectpractice.testing;


class Body
{
	static void SleeporRun(int age)
	{
		if (age > 80) {
            System.out.println("sleep for 2hrs"); 
        } else if (age < 30) {
        	System.out.println("its run fast"); 
        } 
	}
}
class ram extends Body
{
	ram(int age)
	{
		super.SleeporRun(age);
	}
	
	static void SleeporRun1(int age)
		{
			if (age > 80) {
	            System.out.println("sleep for 2hrs"); 
	        } else if (age < 30) {
	        	System.out.println("its run fast"); 
	        } 
		}
}
class sham extends Body
{
	sham(int age)
	{
		super.SleeporRun(age);
	}
	static void SleeporRun2(int age)
		{
			if (age > 80) {
	            System.out.println("sleep for 2hrs"); 
	        } else if (age < 30) {
	        	System.out.println("its run fast"); 
	        } 
		}
}
public class DDDDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		sham.SleeporRun2(20);
		ram.SleeporRun1(90);
		Body.SleeporRun(25);
		
		
	}

	
}
