

import java.sql.*;
import java.io.*;
class Fun
{
    public static void main(String[]args) {
   try
    {

//load the driver
	Class.forName("com.mysql.jdbc.Driver");
	//create a connection
	String url="jdbc:mysql://localhost:3306/youtube";
string username="root";
string password="root";



connection con=DriverManager.getconnection(ur1,username,password);

//create a querry
string q="insert into table1(tName,tCity)values (?,?)";

preparedStatement pstmt=con.prepareStatement(q);

BufferedReader br=new BufferedReader(new InputStreamReader(system.in));
system.out.println("Enter name :");
String name=br.readline();

system.out.println("Enter city:");
string city=br.readline();

pstmt.setString(1,"name");
pstmt.setString(2,"city");

pstmt.executeUpdate();


System.out.println("inserted.....");
con.close();

}catch(Exception e)
{



    }
             }
       }
