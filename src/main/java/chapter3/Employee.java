package chapter3;

public class Employee {

  private String name;
  private int age;
  private String jobTitle;
  private Double salary;
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public Employee(String name, int age, String jobTitle, Double salary) {
    this.name = name;
    this.age = age;
    this.jobTitle = jobTitle;
    this.salary = salary;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public String getName() {
    return name;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public int getAge() {
    return age;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public String getJobTitle() {
    return jobTitle;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public Double getSalary() {
    return salary;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Override
  public String toString() {
    return String.format("{Name: %s, Age: %d, JobTitle: %s, Salary: $%.2f}", name, age, jobTitle, salary);
  }
  
}
