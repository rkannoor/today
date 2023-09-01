package Mavenprojectpractice.testing;
class Body1
{
	static void SleeporRun(int age)
	{
		if (age > 80) {
            System.out.println("BODY sleep for 2hrs"); 
        } else if (age < 30) {
        	System.out.println("BODY its run fast"); 
        } 
	}
}
class ram1 extends Body
{
	
	
	 void SleeporRun1(int age)
		{
		super.SleeporRun(age);
			if (age > 80) {
	            System.out.println("RAM1 sleep for 2hrs"); 
	        } else if (age < 30) {
	        	System.out.println("RAM1 its run fast"); 
	        } 
		}
}
class sham1 extends Body
{
	
	 void SleeporRun2(int age)
		{
		super.SleeporRun(age);
			if (age > 80) {
	            System.out.println("SHAM1  sleep for 2hrs"); 
	        } else if (age < 30) {
	        	System.out.println("SHAM1 its run fast"); 
	        } 
		}
}
public class DDD2 {

	public static void main(String[] args) {
		
		sham1 SM=new sham1();
		SM.SleeporRun2(90);
		
		
		
		
	}

}
