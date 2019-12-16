import java.util.*;
import java.sql.*;

public class Employee_Salary{
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3308/emp_master","root","");
		Statement stmt = con.createStatement();
		ResultSet rs;

		System.out.println("1.View All Employee With Salary ");
		System.out.println("2.View specific employee detail based on emp_code filter with their salary details");
		System.out.print("Enter Your Choice : ");
		int ch = sc.nextInt();

		switch(ch){

			case 1:
				rs = stmt.executeQuery("select * from emp_details natural join emp_salary_details");
				while(rs.next()){
					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6) + "\t" +rs.getString(7) + "\t" + rs.getString(8) + "\t" + rs.getString(9)+ "\t" + rs.getString(10)+ "\t" + rs.getString(11)+ "\t" + rs.getString(12));
				}
				break;

			case 2:
				rs = stmt.executeQuery("select * from emp_details emp inner join emp_salary_details  empsal on empsal.emp_id = emp.emp_id order by empsal.emp_salary_gross");
				while(rs.next()){
					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6) + "\t" +rs.getString(7) + "\t" + rs.getString(8) + "\t" + rs.getString(9)+ "\t" + rs.getString(10)+ "\t" + rs.getString(11)+ "\t" + rs.getString(12));
				}
				break;
		}
	}
}