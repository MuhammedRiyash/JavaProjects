import java.sql.*;
public class Insert {
	
	public static void main (String[]args)throws Exception {
	      insertData();
   }		
	public static void insertData() throws Exception{
		
		
		  String url="jdbc:mysql://127.0.0.1:3306/customer";
		   
	      String username="root";
				
		  String password="OHnoo@663";
				    
		  String Query ="insert into student values(?,?,?)";
				      
	 Connection con = DriverManager.getConnection(url, username,password);
	 PreparedStatement pst = con.prepareStatement(Query);
	 
	 pst.setInt(1,22);
	 pst.setString(2,"MD.riyash" );
	 pst.setString(3,"noobriyash@gmail.com");
	 pst.executeUpdate();
	 con.close();
	}
}
