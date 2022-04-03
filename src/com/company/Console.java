package com.company;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/** Console class description
 * This class stores methods that allow you to output data to the console and receive data from it
 */
public class Console {
    /**Saved an instance of Scanner to read data from the console*/
    static Scanner scanner = new Scanner(System.in);
    /**This public static method receives data from the console*/
    public static String ReadString(String mess){PrintMessage(mess+" ");return scanner.nextLine();}
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
        String str = "\n[==============================]\n";
        int index =1;
        if(employees!=null&&employees.size()!=0)for(Employee employee: employees)
        {
            System.out.println(str+"id: "+index +'\n'+employee.toString()+str);
            index++;
        }else
            System.out.println("Список пуст!!!");
    }
    /**This public static method outputs the description of the elements to the console*/
    public static void ShowStack(String mess, Stack<Employee> stack)
    {
        PrintMessage(mess+'\n');
        String str = "\n[==============================]\n";
        if(stack!=null&&stack.size()!=0)
        while (!stack.empty())
        {
            System.out.println(str+stack.pop().toString()+str);
        }else
            System.out.println("Стек пуст!!!");
    }

    /**This public static method prints element addresses to the console*/
    public static void ShowStackAddress(String mess, Stack<Employee> stack)
    {
        PrintMessage(mess+'\n');
        String str = "\n[==============================]\n";
        System.out.println(str);
        if(stack!=null&&stack.size()!=0)for(Employee employee: stack)
        {
            System.out.println(employee.Address);
        }else
            System.out.println("Список пуст!!!");
        System.out.println(str);
    }
}
