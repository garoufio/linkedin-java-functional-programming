package chapter3;

public class Employee {

  private String name;
  private int age;
  private String jobTitle;
  private Double Salary;
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public Employee(String name, int age, String jobTitle, Double salary) {
    this.name = name;
    this.age = age;
    this.jobTitle = jobTitle;
    Salary = salary;
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
    return Salary;
  }
  
}
