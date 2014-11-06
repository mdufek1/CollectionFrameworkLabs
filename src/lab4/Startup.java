/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;

import java.util.*;
import lab1.Employee;

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

        
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
        Set<Employee> dupeRemover = new HashSet<>(employees);
        
        employees = new ArrayList<>(dupeRemover);
                System.out.println("\n");
        
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
        
    }
}