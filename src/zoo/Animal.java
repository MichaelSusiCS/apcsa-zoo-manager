package zoo;
public abstract class Animal {
  protected final String name; protected int age;
  public Animal(String name,int age){ this.name=name; this.age=age; }
  public abstract String makeSound();
  public String getName(){ return name; }
  @Override public String toString(){ return getClass().getSimpleName()+"("+name+", "+age+")"; }
}
