import java.util.*;
import java.sql.*;

public class Employee{
	public static void main(String args[]) throws Exception{

			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3308/emp_master","root","");
			Statement stmt = con.createStatement();
			ResultSet rs;

			System.out.println("SELECT OPTIONS : ");
			System.out.println(" 1.  View all records. ");
			System.out.println(" 2.  View specific record based on primary key.  ");
			System.out.println(" 3.  View specific employee detail based on emp_code filter.  ");
			System.out.println(" 4.  Update specific record based on primary key. ");
			System.out.println(" 5.  Delete specific record based on primary key. ");
			System.out.println(" 6.  Update specific record based on the field emp_code. ");
			System.out.println(" 7.  Delete specific record based on the field emp_code. ");
			System.out.println(" 8.  Exit. ");

			System.out.print(" Enter Your Choice : ");
			int ch =sc.nextInt();

			switch(ch){
					case 1:
						 rs = stmt.executeQuery("select * from emp_details");
						while(rs.next()){
							System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6) + "\t" +rs.getString(7) + "\t" + rs.getString(8) + "\t" + rs.getString(9));
						}
						break;

					case 2 :
						System.out.print("Enter Id : ");
						int id = sc.nextInt();
						rs = stmt.executeQuery("select * from emp_details where emp_id = " + id);
						while(rs.next()){
								System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6) + "\t" +rs.getString(7) + "\t" + rs.getString(8) + "\t" + rs.getString(9));
						}
						break;

					case 3 :
						System.out.print("Enter Emp_Code : ");
						int emp_code = sc.nextInt();
						rs = stmt.executeQuery("select * from emp_details where emp_code = " + emp_code);
						while(rs.next()){
							System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6) + "\t" +rs.getString(7) + "\t" + rs.getString(8) + "\t" + rs.getString(9));
						}
						break;

					case 4 :
						System.out.print("Enter id : ");
						int eid = sc.nextInt();
						System.out.print("Enter Employee First Name  : ");
						String fname = sc.next();
						stmt.executeUpdate("update emp_details set emp_fname =  '"+ fname + "'  where emp_id = " +eid);
						System.out.println("Update Sucessfull.");
						break;

					case 5:
						System.out.print("Enter id  : ");
						int e_id = sc.nextInt();
						stmt.executeUpdate("delete from emp_details  where emp_id = " +e_id);
						System.out.println("Delete Sucessfull.");
						break;

					case 6:
						System.out.print("Enter Code : ");
						int ec_id = sc.nextInt();
						System.out.println("Enter Employee First Name  : ");
						String fname1 = sc.next();
						stmt.executeUpdate("update emp_details set emp_fname =  '"+ fname1 + "'  where emp_code = " +ec_id);
						System.out.println("Update Sucessfull.");
						break;

					case 7:
						System.out.print("Enter Code : ");
						int ec_id1 = sc.nextInt();
						stmt.executeUpdate("delete from emp_details  where emp_code = " +ec_id1);
						System.out.println("Delete Sucessfull.");
						break;

					default:
						System.out.println("Wrong Choice : ");

			}
	}
}