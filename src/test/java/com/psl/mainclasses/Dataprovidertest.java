package com.psl.mainclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertest {

	@Test (dataProvider="setData")
	public void testDataProcvider(String movieName, String Actor, String Actress)
	{
		System.out.println("Movie details"+ movieName +"Actor"+ Actor +"Actress"+ Actress);
	}
	@DataProvider
	public Object[][] setData()
	{
		Object [][] movieList=new Object[2][3];
		movieList[0][0]="abc";
		movieList[0][1]="amit";
		movieList[0][2]="xyz";
		
		movieList[1][0]="opw";
		movieList[1][1]="Amir";
		movieList[1][2]="ash";
		
		return movieList;
		
	}
}
