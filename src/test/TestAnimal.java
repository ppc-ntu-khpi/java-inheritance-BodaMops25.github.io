package test;

import domain.Bird;

public class TestAnimal {

  public static void main() {
      Bird b = new Bird(2, 100);
      System.out.println(b);
    
      flyingAnimal fA = new flyingAnimal('ft1', 15.5, 0)
      System.out.println(fA);
    
      Animal a = new Animal(15, 20, 1)
      System.out.println(a);
    
      b.fly();
      b.fly();
      b.eat();
      b.speak();
  }
}
