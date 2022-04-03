package com.company;

import java.util.LinkedList;

public class Main {

    private static LinkedList<Employee> employees;
    private static String[] Menu = {
            "1. Добавить элемент в коллекцию",
            "2. Удалить элемент из коллекции",
            "3. Показать содержимое коллекции",
            "0. Выход"};
    public static void main(String[] args) {
        employees = CreateList();
        menu();
    }

    private static void menu()
    {
        boolean flag;
        do {
            flag = true;
            Console.PrintMenu("Выберите действие:",Menu);
            int num = Console.ReadInt("#/>",0,3);
            switch (num)
            {
                case 0: flag = false;break;
                case 1: ;break;
                case 2: ;break;
                case 3: Console.ShowEmployees("Список работников:",employees);break;
            }
        }while(flag);
    }

    private static LinkedList<Employee> CreateList()
    {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Евгений","Латош","Александрович","ул. Кабяка д.6 кв.41","05-2013"));
        employees.add(new Employee("Иван","Петров","Васильевич","ул.Пушкина д.17 кв.23","09-2010"));

        return employees;
    }

}
