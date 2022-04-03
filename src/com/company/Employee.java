package com.company;

public class Employee {
    private String Name;
    private String Surname;
    private String Patronymic;
    private String Address;
    private Date date;
    public Employee(String Name, String Surname, String Patronymic, String Address, String date)
    {
        this.Name = Name;
        this.Surname = Surname;
        this.Patronymic = Patronymic;
        this.Address = Address;
        this.date = new Date(date);
    }
    @Override
    public String toString()
    {
        return "ФИО: " + Surname +' ' + Name + ' ' + Patronymic + " \nАдрес: " + Address + " \nДата поступления на работу:\nМесяц: " + date.GetMonth() + "\nГод: "+ date.GetYear();
    }
}
