package com.company;
/** Employee class description
 * This class stores employee data fields and methods for working with them
 */
public class Employee {
    /**Saved string instance to store the name*/
    public String Name;
    /**Saved string instance to store last name*/
    public String Surname;
    /**Saved string instance to store middle name*/
    public String Patronymic;
    /**Saved string instance to store the address*/
    public String Address;
    /**Saved date instance to store the date*/
    public Date date;
    /**Public constructor that takes no value*/
    public Employee(){}
    /**Public constructor that accepts data as strings*/
    public Employee(String Name, String Surname, String Patronymic, String Address, String date)
    {
        this.Name = Name;
        this.Surname = Surname;
        this.Patronymic = Patronymic;
        this.Address = Address;
        this.date = new Date(date);
    }
    /**Method that sets the name value*/
    public void SetName(String Name){this.Name = Name;}
    /**Method that sets the last name value*/
    public void SetSurname(String Surname){this.Surname = Surname;}
    /**Method that sets the middle name value*/
    public void SetPatronymic(String Patronymic){this.Patronymic = Patronymic;}
    /**Method that sets the value of the address*/
    public void SetAddress(String Address){this.Address = Address;}
    /**Method that sets the date value*/
    public void SetDate(String date){this.date = new Date(date);}
    /**Method that sets the date value*/
    public void SetDate(int Month,int Year){this.date = new Date(Month,Year);}
    /**Method returning a string representation of the employee class*/
    @Override
    public String toString()
    {
        return "ФИО: " + Surname +' ' + Name + ' ' + Patronymic + " \nАдрес: " + Address + date.toString();
    }
}
