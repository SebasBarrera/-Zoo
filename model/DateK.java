package model;

public class DateK{

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	private int day;		//this would be the day

	private int month;		//this would be the month

	private int year;		//this would be the year


	//--------------------------------------------------------------------------------------------------

	//relations

	//--------------------------------------------------------------------------------------------------

	//it doesn´t have relations

	//--------------------------------------------------------------------------------------------------

	//methods

	//--------------------------------------------------------------------------------------------------
// in this method I am initializing the object, and assigning each parameter to each attribute.	
	public DateK(int newDay, int newMonth, int newYear){

		day   = newDay;

		month = newMonth;

		year  = newYear;

	}
//this method helps us to get the value of the attribute day.
	public int getDay(){

		return day;

	}
//this method helps us to assign an initial value to the attribute day.
	public void setDay(int newDay){

		day = newDay;

	}
//this method helps us to get the value of the attribute month.
	public int getMonth(){

		return month;

	}
//this method helps us to assign an initial value to the attribute month.
	public void setMonth(int newMonth){

		month = newMonth;

	}
//this method helps us to get the value of the attribute year.
	public int getYear(){

		return year;

	}
//this method helps us to assign an initial value to the attribute year.
	public void setYear(int newYear){

		year = newYear;

	}
// The message in the activity monitor
	public String toString(){

		String msg = "";
 
		msg = "The born date of the animal is:                              " + day + "/" + month + "/" + year + ".\n";

		return msg;

	}



}