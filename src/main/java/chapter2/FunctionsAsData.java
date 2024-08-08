package chapter2;

public class FunctionsAsData {
  
  protected static class Person {
    private String name;
    private int age;
    
    //-------------------------------------------------------------------------
    
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  protected static class DataLoader {
    private final NoArgFunction<Person> loadPerson;
    
    //-------------------------------------------------------------------------
    
    public DataLoader(boolean isDevelopment) {
      this.loadPerson = isDevelopment ? this::loadFakePerson : this::loadRealPerson;
    }
    
    //-------------------------------------------------------------------------
    
    private Person loadRealPerson() {
      System.out.println("Loading real person...");
      return new Person("Robert Downie Junior", 55);
    }
    
    //-------------------------------------------------------------------------
    
    private Person loadFakePerson() {
      System.out.println("Loading fake person...");
      return new Person("Iron Man", 10);
    }
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    final boolean IS_DEVELOPMENT = true;
    
    DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
    System.out.println(dataLoader.loadPerson.apply());
  }
  
}
