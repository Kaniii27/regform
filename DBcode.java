package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBcode {
	Connection con;
	public DBcode() {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sposdb","root","kani");
	} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
	}
	}
public int insert(String name,int age,String gender,String qual,String phone,String address,String district) throws SQLException {
String q="insert into employeespos values(?,?,?,?,?,?,?)";
PreparedStatement pst=con.prepareStatement(q);
pst.setString(1,name);
pst.setInt(2, age);
pst.setString(3, gender);
pst.setString(4,qual);
pst.setString(5, phone);
pst.setString(6, address);
pst.setString(7, district);
int r=pst.executeUpdate();
return r;
}
public ArrayList<Student> select() throws SQLException{
ArrayList<Student> stdlist=new ArrayList<Student>();
String q="select * from employeespos";
PreparedStatement pst=con.prepareStatement(q);
ResultSet rs=pst.executeQuery();
while(rs.next()) {
String a=rs.getString(1);
int b=rs.getInt(2);
String c=rs.getString(3);
String d=rs.getString(4);
String e=rs.getString(5);
String f=rs.getString(6);
String g=rs.getString(7);
Student std=new Student(a,b,c,d,e,f,g);
stdlist.add(std);
}
return stdlist; 
}


}
