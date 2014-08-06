package com.psl.mainclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test {

	@Test (dataProvider="setData")
	public void testDataProcvider(String movieName, String Actor)
	{
		System.out.println("Movie details"+ movieName +"Actor"+ Actor );
	}
	@DataProvider
	public Object[][] setData()
	{
		Object [][] movieList=new Object[2][2];
		movieList[0][0]="abc";
		movieList[0][1]="amit";
	
		movieList[1][0]="xyz";
		movieList[1][1]="Amit34";
		
		return movieList;
}
}
