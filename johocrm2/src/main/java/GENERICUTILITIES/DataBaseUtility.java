package GENERICUTILITIES;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
	/**
	*This Class Contains genenic methods to read data from Database
	*@author GUDU
	*
	*/
Connection con=null;
ResultSet result=null;
Driver driverRef;
/**
 * Connection with database is established
 * @throws Throwable 
 * @throws Throwable
 * 
 */
public void connectToDB() throws Throwable {
	DriverManager.registerDriver(driverRef);
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet", "root","root");
	
}
/**
 * DB connection is closed
 * @throws Throwable 
 * @throws Throwable
 */
public void closeDb() throws Throwable {
	con.close();
	
	
}
 /**
  * This method returns the data wrt to column index
  * @param query
  * @param Columnindex
  * @return
 * @throws SQLException 
  * @throws Throwable
  */
public String getDataFromDB(String query,int Columnindex) throws SQLException {
	
	String value = null;
 result = con.createStatement().executeQuery(query);
 while(result.next()){
	 value = result.getNString(Columnindex);
 }
return value;


}
public String getDataFromDb(String query,int coloumnName,String expData) throws SQLException 
{
	
	boolean flag = false;
	result=con.createStatement().executeQuery(query);
	while(result.next())
	{
		if(result.getString(coloumnName).equalsIgnoreCase(expData))
		{
			flag=true;
			break;
		}
	}
	if(flag) 
	{
		System.out.println(expData+"dataverified is not database");
	return expData;
	}
	else 
	{
		System.out.println(expData+"dataverified is not database");
	return expData;
	}
}
}
 
 
	


