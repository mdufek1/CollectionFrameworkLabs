/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

import java.util.*;
import lab1.*;

/**
 *
 * @author mdufek1
 */
public class Startup {
    public static void main(String[] args) {
        
   
        List<Employee> employees = new ArrayList<>();
       
        employees.add(new Employee("Smith","John","111-11-1111"));
        employees.add(new Employee("Shepard","Bob","222-22-2222"));
        employees.add(new Employee("Jones","Shelly","333-33-3333"));
        employees.add(new Employee("Theif","Identity","222-22-2222"));
        
        System.out.println(employees.size());
        System.out.println("\n");
        
        Employee e2 = employees.get(2);
        
        System.out.println(e2);
        System.out.println("\n");
        
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
        System.out.println("\n");
        employees.remove(1);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
        System.out.println("\n");
        employees.clear();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}