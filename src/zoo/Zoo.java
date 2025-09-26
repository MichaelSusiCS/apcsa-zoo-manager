package zoo;
import java.util.*;
public class Zoo {
  private final List<Animal> animals = new ArrayList<>();
  public void add(Animal a){ animals.add(a); }
  public List<Animal> list(){ return animals; }
  public int feedAll(){
    int total=0;
    for(Animal a: animals) if(a instanceof Feedable f) total += f.feed();
    return total;
  }
  public Optional<Animal> findByName(String name){
    return animals.stream().filter(a -> a.getName().equalsIgnoreCase(name)).findFirst();
  }
}
