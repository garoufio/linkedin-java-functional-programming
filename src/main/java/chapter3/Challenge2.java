package chapter3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Challenge2 {
  
  public static void main(String[] args) {
    Employee[] employeeArray = {
        new Employee("John", 34, "developer", 80000d),
        new Employee("Hannah", 24, "developer", 95000d),
        new Employee("Bart", 50, "sales executive", 100000d),
        new Employee("Sophie", 49, "construction worker", 40000d),
        new Employee("Darren", 38, "writer", 50000d),
        new Employee("Nancy", 29, "developer", 75000d)
    };
    List<Employee> employeeList = new ArrayList<>(Arrays.asList(employeeArray));
    
    // compare the average salary of all developers to the average salary of all other job titles
    Map<String, Double> averageJobsSalaryMap = employeeList
        .stream()
        .collect(Collectors.groupingBy(Employee::getJobTitle))
        .entrySet()
        .stream()
        .collect(Collectors.toMap(
            entry -> entry.getKey(),
            entry -> entry.getValue()
                .stream()
                .map(Employee::getSalary)
                .reduce(0d, (acc, x) -> acc + x) / entry.getValue().size()
        ));
    System.out.println(averageJobsSalaryMap);
  }
  
}
