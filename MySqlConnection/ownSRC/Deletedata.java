import java.sql.*;
public class Deletedata {
			public static void main (String[]args)throws Exception {
				deletedata();
	}
			public static  void deletedata()throws Exception{

				  String url="jdbc:mysql://127.0.0.1:3306/customer";
				   
			      String username="root";
						
				  String password="OHnoo@663";
				  
				  int id=22;
				  
				  String Query="delete from student id where ID=22";
				  
				  Connection con = DriverManager.getConnection(url, username,password);
				  PreparedStatement pst = con.prepareStatement(Query);
					
				  int ID = pst.executeUpdate();
				  System.out.println(ID);
				  con.close();
					 
			}
}
