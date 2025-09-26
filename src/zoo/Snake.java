package zoo;
public class Snake extends Reptile implements Feedable {
  public Snake(String n,int a){ super(n,a); }
  @Override public String makeSound(){ return "Hiss"; }
  @Override public int feed(){ return 300; }
}
