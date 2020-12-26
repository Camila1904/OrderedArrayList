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
    super.add(index(element), element);
    return true;
  }
  public void add(int index, T element) {
    super.add(index(element),element);
  }
  public T set(int index,T element) {
    T a = get(index);
    if (element == null) {
      throw new IllegalArgumentException();
    }
    super.remove(index);
    super.add(index(element),element);
    return a;
  }
}
