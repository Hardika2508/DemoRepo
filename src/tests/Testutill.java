package tests;

import java.util.ArrayList;

public class Testutill {
	
public static ArrayList<Object[]> getdatafromexcel(){
	Xls_Reader reader;
ArrayList<Object[]> myData = new ArrayList<Object[]>();

reader=new Xls_Reader("D:\\QA\\Testing\\dataprovider.xlsx");
for(int rowNum=2; rowNum<=reader.getRowCount("Sheet1");rowNum++)
{
	String Firstname=reader.getCellData("Sheet1","Firstname", rowNum);
	String Lastname=reader.getCellData("Sheet1","Lastname", rowNum);
	String Email=reader.getCellData("Sheet1","email", rowNum);
	String Password=reader.getCellData("Sheet1","Password", rowNum);

Object ob[]= {Firstname, Lastname,Email,Password};
myData.add(ob);


}
return myData;
}
}



