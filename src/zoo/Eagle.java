package zoo;
public class Eagle extends Bird implements Feedable {
  public Eagle(String n,int a){ super(n,a); }
  @Override public String makeSound(){ return "Screech"; }
  @Override public int feed(){ return 800; }
}
