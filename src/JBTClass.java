
 class JBTClassParent{
	 
	 JBTClassParent(){
		 System.out.println("2. Parent constructor");
	 }
 }


public class JBTClass extends JBTClassParent{

	/*
	 * Here Creating the Anonymous Block
	 */
	{
		System.out.println("3. Instance Block");
	}

	/*
	 * Now Creating the Static Block in Class
	 */
	static {
		System.out.println("1. Static Block");
	}

	/*
	 * Here Creating the Constructor of Class
	 */
	JBTClass() {
		System.out.println("4. Child constructor");
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		// Creating the Object of the Class
		 
		//new JBTCLass();
		 
		Class c = Class.forName("JBTClass");
		JBTClass obj = (JBTClass) c.newInstance();

		System.out.println("5. *******************");

		// Again Creating Object of Class
		 new JBTClass();

	}
	
	public void m() {
		System.out.println("Inside method m()");
	}

}


