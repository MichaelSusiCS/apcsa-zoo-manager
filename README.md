# apcsa-zoo-manager
Manage a tiny zoo: add/list animals, feed all, search by name.

## Run
```bash
find src -name "*.java" | xargs javac -d out
java -cp out Main

### 3) Code files
```bash
cat > src/zoo/Animal.java << 'EOF'
package zoo;
public abstract class Animal {
  protected final String name; protected int age;
  public Animal(String name,int age){ this.name=name; this.age=age; }
  public abstract String makeSound();
  public String getName(){ return name; }
  @Override public String toString(){ return getClass().getSimpleName()+"("+name+", "+age+")"; }
}
