package chapter3;

public class Car {
  
  private String make;
  private String color;
  private Double price;
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public Car(String make, String color, Double price) {
    this.make = make;
    this.color = color;
    this.price = price;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public String getMake() {
    return make;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public String getColor() {
    return color;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public Double getPrice() {
    return price;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Override
  public String toString() {
    return color + " " + make + ", " + price;
  }
  
}
