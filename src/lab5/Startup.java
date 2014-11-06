/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab5;

import java.util.*;
import lab1.Employee;

/**
 *
 * @author mdufek1
 */
public class Startup {
    public static void main(String[] args) {

        Map<String, Employee> employees = new HashMap<>();
        
        //I'm using social security numbers because that is the only thing about an employee that SHOULD be unique, however in 
        //this case I have duplicates, in the real world that should never happen
        employees.put("111-11-1111",new Employee("Smith","John","111-11-1111"));
        employees.put("222-22-2222",new Employee("Shepard","Bob","222-22-2222"));
        employees.put("333-33-3333",new Employee("Jones","Shelly","333-33-3333"));
        employees.put("222-22-2222",new Employee("Theif","Identity","222-22-2222"));

        System.out.println(employees.get("222-22-2222"));
        //the last object enters overwrites the one that used the key previously
        System.out.println("\n"); 
        
        Set<String> employeeKeys = employees.keySet();
        for(String key: employeeKeys) {
            System.out.println(employees.get(key));
        }
        
        Collection<Employee> employeeValues = employees.values();
        for(Employee employee : employeeValues) {
            System.out.println(employee);
        }

    }
}
