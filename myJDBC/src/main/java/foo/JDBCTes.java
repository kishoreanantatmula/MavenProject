package foo;

public class JDBCTes {

	/**
	 * @param args
	 */
	
	public static void main(String args[]) 
	{
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
