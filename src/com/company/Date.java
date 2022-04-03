package com.company;

public class Date {
    private int Month;
    private int Year;
    public Date(String date)
    {
        String[] strs = date.split("\\-");
        if(strs.length == 2)
        {
          this.Month = Integer.parseInt(strs[0]);
          this.Year = Integer.parseInt(strs[1]);
        }
    }
    public Date(int Month,int Year)
    {
        this.Month = Month;
        this.Year = Year;
    }
    public int GetMonth(){return Month;}
    public int GetYear(){return Year;}
}
