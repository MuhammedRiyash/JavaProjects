import java.sql.*;
public class LibraryInsert {
	public static void main (String[]args)throws Exception {
		getdata();
  }
// public static void insertData() throws Exception{
//	
//	
//	  String url="jdbc:mysql://127.0.0.1:3306/customer";
//	   
//    String username="root";
//			
//	  String password="OHnoo@663";
//			    
//	  String Query ="insert into library values(?,?,?,?,?,?,?,?,?)";
//			      
//    Connection con = DriverManager.getConnection(url, username,password);
//    PreparedStatement pst = con.prepareStatement(Query);

//    pst.setInt(1,1013);
//    pst.setString(2,"THE LAST DEVIL TO DIE" );
//    pst.setString(3,"Richard Osman");
//    pst.setInt(4,5);
// 	  pst.setString(5,"Turkish");
//    pst.setInt(6,254);
//    pst.setInt(7,19122003);
//    pst.setString(8,"fingerprint publishers");
//    pst.setInt(9,2000);
    
//    pst.setInt(1,1026);
//    pst.setString(2,"HOLLY" );
//    pst.setString(3,"Stephen King");
//    pst.setInt(4,3);
//    pst.setString(5,"English");
//    pst.setInt(6,274);
//    pst.setInt(7,22920014);
//    pst.setString(8,"sky publishers");
//    pst.setInt(9,1890);
    
//    pst.setInt(1,103);
//    pst.setString(2,"THE DEMOCRAT PARTY HATES AMERICA" );
//    pst.setString(3,"Mark R. Levin");
//    pst.setInt(4,4);
//    pst.setString(5,"English");
//    pst.setInt(6,212);
//    pst.setInt(7,24122012);
//    pst.setString(8,"eifil publishers");
//    pst.setInt(9,3090);
 
//    pst.setInt(1,2331);
//    pst.setString(2,"ELON MUSK" );
//    pst.setString(3,"Walter Isaacson");
//    pst.setInt(4,5);
//    pst.setString(5,"English");
//    pst.setInt(6,220);
//    pst.setInt(7,18102010);
//    pst.setString(8,"sugith publishers");
//    pst.setInt(9,890);
           
//    pst.setInt(1,2432);
//    pst.setString(2,"The Odyssey" );
//    pst.setString(3,"Homer");
//    pst.setInt(4,4);
//    pst.setString(5,"English");
//    pst.setInt(6,220);
//    pst.setInt(7,30102000);
//    pst.setString(8,"vanmat publishers");
//    pst.setInt(9,310);    
           
//    pst.setInt(1,1672);
//    pst.setString(2,"Pride And Prejudice" );
//    pst.setString(3,"Jane Austen");
//    pst.setInt(4,5);
//    pst.setString(5,"English");
//    pst.setInt(6,420);
//    pst.setInt(7,11112011);
//    pst.setString(8,"shree publishers");
//    pst.setInt(9,774);
    
//    pst.setInt(1,4731);
//    pst.setString(2,"கரைந்த நிழல்கள் [Karaintha Nizhalkal]" );
//    pst.setString(3," Ashokamitthiran");
//    pst.setInt(4,5);
//    pst.setString(5,"tamil");
//    pst.setInt(6,521);
//    pst.setInt(7,2192023);
//    pst.setString(8,"Thamilan publishers");
//    pst.setInt(9,1210);
    
//            pst.executeUpdate();
//         con.close();
//	
	
	public static void getdata()throws Exception {
		
		 String url="jdbc:mysql://127.0.0.1:3306/customer";
		   
		    String username="root";
					
			  String password="OHnoo@663";
			  
		String Query="select * from library";
		Connection con=DriverManager. getConnection(url,username,password);
		Statement pst=con.createStatement();
		ResultSet rs=pst.executeQuery(Query);
	while(rs.next()) {
		System.out.println("BookId :"+rs.getInt(1));
		System.out.println("BookName :"+rs.getString(2));
		System.out.println("AuthorName :"+rs.getString(3));
		System.out.println("BookRatings :"+rs.getInt(4));
		System.out.println("BookLanguage :"+rs.getString(5));
		System.out.println("BookLength :"+rs.getInt(6));
		System.out.println("BookPublications :"+rs.getInt(7));
		System.out.println("Publisher Name :"+rs.getString(8));
		System.out.println("Book Price :"+rs.getInt(9));
		System.out.println(" ");
	
	       }
	    con.close();
  }

	
//	public static void updatedata()throws Exception {
//		String url="jdbc:mysql://127.0.0.1:3306/customer";
//		String username="root";
//		String password="OHnoo@663";
//		int id= 4731;
//		String Query="update library set BookLanguage ='Tamil' where id=4731";
//		Connection con=DriverManager. getConnection(url,username,password);
//		PreparedStatement pst=con.prepareStatement(Query);
//		int rows=pst.executeUpdate();
//		System.out.println(rows);
//		con.close();	
//	}
	
//	public static  void deletedata()throws Exception{
//
//		  String url="jdbc:mysql://127.0.0.1:3306/customer";
//		   
//	      String username="root";
//				
//		  String password="OHnoo@663";
//		  
//		  int id=2432;
//		  
//		  String Query="delete from library id where ID=2432";
//		  
//		  Connection con = DriverManager.getConnection(url, username,password);
//		  PreparedStatement pst = con.prepareStatement(Query);
//			
//		  int ID = pst.executeUpdate();
//		  System.out.println(ID);
//		 con.close();		 
//	}
 }

