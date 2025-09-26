package zoo;
public class Lion extends Mammal implements Feedable {
  public Lion(String n,int a){ super(n,a); }
  @Override public String makeSound(){ return "Roar"; }
  @Override public int feed(){ return 5000; }
}
