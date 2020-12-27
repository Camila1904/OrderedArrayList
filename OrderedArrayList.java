import java.lang.IllegalArgumentException;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public boolean add(T element) {
    int i = 0;
    if (element == null) {
      throw new IllegalArgumentException();
    }
    while ((i<this.size()) && (this.get(i).compareTo(element) < 0)) {
      i++;
    }
    super.add(i, element);
    return true;
  }
  public void add(int index, T element) {
    add(element);
  }
  public T set(int index,T element) {
    if (element == null){
      throw new IllegalArgumentException();
    }
    T a = this.remove(index);
    add(element);
    return a;
  }
}
