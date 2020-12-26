import java.util.ArrayList;
import java.lang.IllegalArgumentException
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  public boolean add (T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    return super.add(element);
  }
  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException();
    }
    super.add(index,element)
  }
}
