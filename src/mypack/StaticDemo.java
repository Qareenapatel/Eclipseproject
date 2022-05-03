package mypack;

class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	public void show()
	{
		System.out.println(eid + ":" + salary + ":" + ceo);
	}
	
	
}

public class StaticDemo
{
  public static void main ( String[] args )
  {
	  Emp ravi = new Emp();
	  	  ravi.eid = 8;
	      ravi.salary = 4000;
	      Emp.ceo = "Mahesh";
	      
	      Emp richa = new Emp();
	      richa.eid = 9;
	      richa.salary = 5000;
	      Emp.ceo = "Mahesh";
	      
	      ravi.show();
	      richa.show();
	      
  }

 
	    		  
	  
	  
	  
	  
	  
  }
  

