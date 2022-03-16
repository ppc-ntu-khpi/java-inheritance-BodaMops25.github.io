package domain;

public class Bird extends flyingAnimal {

  protected int wings;
  protected int health;

  public void Bird(int wings, int health,) {
      this.wings=wings;
      this.health=health;
  }
  
  public void eat() {
    System.out.println("Bird eat something...")
  }
  
  public void speak() {
    System.out.println("Bird speak something...")
  }
}
