package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Challenge1 {
  
  public static void main(String[] args) {
    Person[] personArray = {
        new Person("Brandon", 23),
        new Person("Hank", 43),
        new Person("Jenna", 33),
        new Person("Veronica", 56),
        new Person("Jack", 27)
    };
    List<Person> personList = new ArrayList<>(Arrays.asList(personArray));
    
    // get person names
    List<String> personNamesList = personList
        .stream()
        .map(Person::getName)
        .collect(Collectors.toList());
    System.out.println(personNamesList);
    
    //-------------------------------------------
    
    Car[] carArray = {
        new Car("Chevy", "red", 45000d),
        new Car("Ford", "blue", 23000d),
        new Car("Toyota", "grey", 14000d),
        new Car("Lamborghini", "blue", 150000d),
        new Car("Renault", "blue", 150000d)
    };
    List<Car> carList = new ArrayList<>(Arrays.asList(carArray));
    
    // get a list of all blue cars
    System.out.println();
    Predicate<Car> getBlueCars = car -> car.getColor().compareTo("blue") == 0;
    List<Car> blueCarsList = carList
        .stream()
        .filter(getBlueCars)
        .collect(Collectors.toList());
    blueCarsList.forEach(System.out::println);
    
    //-------------------------------------------
    
    Employee[] employeeArray = {
        new Employee("John", 34, "developer", 80000d),
        new Employee("Hannah", 24, "developer", 95000d),
        new Employee("Bart", 50, "sales executive", 100000d),
        new Employee("Sophie", 49, "construction worker", 40000d),
        new Employee("Darren", 38, "writer", 50000d),
        new Employee("Nancy", 29, "developer", 75000d)
    };
    List<Employee> employeeList = new ArrayList<>(Arrays.asList(employeeArray));
    
    // calculate the sum of all employees's salaries
    System.out.println();
    Double sumOfAllSalaries = employeeList
        .stream()
        .map(Employee::getSalary)
        .reduce(0d, (acc, x) -> acc + x);
    System.out.println("The total sum of all employees' salaries is " + sumOfAllSalaries);
    
    // compare the average salary of all developers to the average salary of all other job titles
    System.out.println();
    List<Employee> developersList = employeeList
        .stream()
        .filter(employee -> employee.getJobTitle().compareTo("developer") == 0)
        .collect(Collectors.toList());
    Double sumOfDevelopersSalaries = developersList
        .stream()
        .map(Employee::getSalary)
        .reduce(0d,(acc, x) -> acc + x);
    Double avgOfDevelopersSalaries = sumOfDevelopersSalaries / developersList.size();
    
    List<Employee> nonDevelopersList = employeeList
        .stream()
        .filter(employee -> employee.getJobTitle().compareTo("developer") != 0)
        .collect(Collectors.toList());
    Double sumOfNonDevelopersSalaries = nonDevelopersList
        .stream()
        .map(Employee::getSalary)
        .reduce(0d, (acc, x) -> acc + x);
    Double avgOfNonDevelopersSalaries = sumOfNonDevelopersSalaries / nonDevelopersList.size();
    System.out.printf("The average developer's salary is '%.2f'\n", avgOfDevelopersSalaries);
    System.out.printf("The average non developer's salary is '%.2f'\n", avgOfNonDevelopersSalaries);
  }
  
}
