package com.company;
/** Description of the EmployeeComparator class
 * This class stores the compare method for comparing two instances of the Employee class
 */
public class EmployeeComparator implements java.util.Comparator<Employee> {
    /**Method to compare two instances of the Employee class */
    public int compare(Employee em1, Employee em2) {return Double.compare(em1.date.GetYear(),em2.date.GetYear());}
}
