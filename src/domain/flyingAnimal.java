package domain;

public class flyingAnimal extends Animal {

  protected String flyingType;
  protected float flyingForce;
  protected float height;

  public void flyingAnimal(String fT, float fF, float h) {
    this.flyingType = fT;
    this.flyingForce = fF;
    this.height = h
  }

  public void fly() {
      this.height = this.height + this.flyingForce
      System.out.println("Flying with force " + this.flyingType + " on height " + this.height + " meters");
  }
}
