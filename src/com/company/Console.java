package com.company;

import java.util.LinkedList;
import java.util.Scanner;

/** Console class description
 * This class stores methods that allow you to output data to the console and receive data from it
 */
public class Console {
    /**Saved an instance of Scanner to read data from the console*/
    static Scanner scanner = new Scanner(System.in);
    public static String ReadString(String mess){PrintMessage(mess+'\n');return scanner.nextLine();}
    /**This public static overloaded method receives data from the console and checks it for correctness*/
    public static int ReadInt(String str, int min){return ReadInt(str,min,-1);}
    /**This public static method receives data from the console and checks it for correctness*/
    public static int ReadInt(String str, int min, int max)
    {
        boolean flag;
        int num=0;
        PrintMessage(str);
        do {
            flag = false;
            try {
                num = Integer.parseInt(scanner.nextLine());
                if(num<min||(max!=-1 && num>max))throw new Exception();
            }catch (Exception e){ PrintMessage("Введено неверное значение!!!!\nПовторите ввод:");flag =true;}
        }while(flag);
        return num;
    }
    /**This public static method outputs data to the console*/
    public static void PrintMessage(String str) {System.out.print(str);}
    /**This public static method outputs the menu to the console*/
    public static void PrintMenu(String mess, String[] arr)
    {
        System.out.println(mess);
        for(String str:arr)System.out.println(str);
    }
    /**This public static method outputs the description of the elements to the console*/
    public static void ShowEmployees(String mess, LinkedList<Employee> employees)
    {
        PrintMessage(mess+'\n');
        if(employees!=null&&employees.size()!=0)for(Employee employee: employees) System.out.println(employee.toString());else
            System.out.println("Список пуст!!!");
    }
}
