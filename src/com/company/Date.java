package com.company;
/** Date class description
 * This class stores fields and methods for working with dates
 */
public class Date {
    /**Saved an integer instance to hold the month*/
    private int Month;
    /**Saved an integer instance to hold the year*/
    private int Year;
    /**Public constructor that takes a date as a string as a parameter*/
    public Date(String date)
    {
        String[] strs = date.split("\\-");
        if(strs.length == 2)
        {
          this.Month = Integer.parseInt(strs[0]);
          this.Year = Integer.parseInt(strs[1]);
        }
    }
    /**Public constructor that accepts a date in the form of numbers as parameters*/
    public Date(int Month,int Year)
    {
        this.Month = Month;
        this.Year = Year;
    }
    /**Method returning month value*/
    public int GetMonth(){return Month;}
    /**Method returning year value*/
    public int GetYear(){return Year;}
    /**Method returning a string representation of a date*/
    @Override
    public String toString()
    {
        return " \nДата поступления на работу:\nМесяц: " + GetMonth() + "\nГод: "+ GetYear();
    }
}
