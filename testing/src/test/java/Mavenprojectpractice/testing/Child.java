package Mavenprojectpractice.testing;

//class Country
//{
//	void sowcapitalcityname(String name)
//	{
//		System.out.println("capital in super class: "+name);
//	}
//}
//class State extends Country
//{
//	void sowcapitalcityname(String name)
//	{
//		super.sowcapitalcityname("vizag");
//		System.out.println("capital in sub class: "+name);
//	}	
//}
//public class INHERITANCE {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		State st=new State();
//		st.sowcapitalcityname("bangalore");
//	}
//
//}



class Father {
  void shoot() {
    System.out.println("first class ");
  }
}
 class Child1 extends Father {
  void shoot() {
    super.shoot(); //This super keyword calls the method with the same name in the parent class. 
    System.out.println("second class");
  }
}
   class child extends Father
  {
	  void shoot() {
		    System.out.println("3rd class ");
		  }  
  
  
  public static void main(String[] args) {

	  child fc = new child();
    fc.shoot(); //This is the method which houses the super keyword for calling the parent class method. 
  }
}
