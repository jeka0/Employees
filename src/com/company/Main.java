package com.company;

import java.util.LinkedList;
import java.util.Stack;
/** Description Main Class
 *  This class stored console menu
 */
public class Main {
    /**Saved an instance of the list of employees*/
    private static LinkedList<Employee> employees;
    /**Employee stack instance saved*/
    private static Stack<Employee> employeeStack = new Stack<>();
    /** Stored operation menu list as String array */
    private static String[] Menu = {
            "1. Добавить элемент в коллекцию",
            "2. Удалить элемент из коллекции",
            "3. Показать содержимое коллекции",
            "4. Отсортировать список по году поступления на работу",
            "5. Определить, есть ли в списке Петровы, вывести их адрес и записать их в стек",
            "6. Достать содержимое стека",
            "0. Выход"};
    /** This is the entry point to the program
     * First, this method instantiates the list of employees
     * and launch the console menu */
    public static void main(String[] args) {
        employees = CreateList();
        menu();
    }
    /**This private method launches the nessesared method, based on user's choiсe*/
    private static void menu()
    {
        boolean flag;
        do {
            flag = true;
            Console.PrintMenu("Выберите действие:",Menu);
            int num = Console.ReadInt("#/>",0,6);
            switch (num)
            {
                case 0: flag = false;break;
                case 1: AddNewEmployee();break;
                case 2: RemoteEmployee();break;
                case 3: Console.ShowEmployees("Список работников:",employees);break;
                case 4: employees.sort(new EmployeeComparator());break;
                case 5: FilterEmployees();break;
                case 6: Console.ShowStack("Стек выбранных работников:",employeeStack);break;
            }
        }while(flag);
    }
    /**This private method adds a new employee with the data entered by the user*/
    private static void AddNewEmployee()
    {
        try {
            Employee newEmployee = new Employee();
            newEmployee.SetName(Console.ReadString("Введите имя:"));
            newEmployee.SetSurname(Console.ReadString("Введите фамилию:"));
            newEmployee.SetPatronymic(Console.ReadString("Введите отчество:"));
            newEmployee.SetAddress(Console.ReadString("Введите полный адрес:"));
            Console.PrintMessage("Введите дату поступления на работу:\n");
            newEmployee.SetDate(Console.ReadInt("Введите месяц:",1,12),Console.ReadInt("Введите год:",1));
            employees.add(newEmployee);
        }catch (Exception e)
        {
            Console.PrintMessage("При вводе данных пользователя произошла ошибка!!!!!!\n");
            return;
        }
    }
    /**This private method pushes all users named "Петров" or "Петрова" to the stack and prints their addresses to the console*/
    private static void FilterEmployees()
    {
        for(Employee employee:employees)
            if(employee.Surname=="Петров"||employee.Surname=="Петрова")
            {
                employeeStack.push(employee);
            }
        Console.ShowStackAddress("Адреса выбранных работников:",employeeStack);
    }
    /**This private method removes an employee from the list*/
    private static void RemoteEmployee()
    {
        Console.ShowEmployees("Выберите id работника, которого хотите удалить:",employees);
        if(employees!=null&&employees.size()!=0)employees.remove(Console.ReadInt("#/>",1,employees.size())-1);
    }
    /**This private method populates the list with employees*/
    private static LinkedList<Employee> CreateList()
    {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Евгений","Латош","Александрович","ул. Кабяка д.6 кв.41","05-2013"));
        employees.add(new Employee("Иван","Петров","Васильевич","ул. Пушкина д.17 кв.23","09-2010"));
        employees.add(new Employee("Максим","Яковлев","Викторович","ул. Ожешко д.3 кв.15","03-2017"));
        employees.add(new Employee("Эдуард","Анисимов","Андреевич","ул. Гаспадарчая д.4 кв.3","07-2009"));
        employees.add(new Employee("Алёна","Турова","Юрьевна","ул. Ожешко д.7 кв.6","11-2005"));
        employees.add(new Employee("Татьяна","Петрова","Эдуардовна","ул. Захарова д.7 кв.29","09-2015"));
        employees.add(new Employee("Борис","Новиков","Егорович","ул. Гаспадарчая д.19 кв.25","04-2015"));
        employees.add(new Employee("Лея","Ефимова","Владимировна","ул. Пушкина д.4 кв.10","06-2004"));
        employees.add(new Employee("Ольга","Петрова","Валентиновна","ул. Захарова д.14 кв.21","07-2011"));
        employees.add(new Employee("Илья","Петров","Олегович","ул. Ожешко д.18 кв.35","01-2013"));
        employees.add(new Employee("Денис","Романов","Арсеньевич","ул. Кабяка д.13 кв.54","02-2017"));
        employees.add(new Employee("Светлана","Зуева","Валерьевна","ул.Пушкина д.7 кв.14","05-2006"));
        employees.add(new Employee("Ирина","Тихонова","Георгиевна","ул. Ожешко д.18 кв.34","06-2011"));
        employees.add(new Employee("Вадим","Петров","Евгеньевич","ул. Гаспадарчая д.15 кв.28","07-2016"));
        employees.add(new Employee("Марта","Жукова","Степановна","ул. Кабяка д.32 кв.24","05-2008"));
        return employees;
    }

}
