import java.util.*;
class ArrayListDemo
{
  public static void main(String[] args){
    // ArrayList I = new ArrayList();
    // I.add("A");
    // I.add("10");
    // I.add("A");
    // I.add(null);
    // System.out.println(I); // [A, 10, A, null]
    // I.remove(2);
    // System.out.println(I); // [A, 10, null]
    // I.add(2,"M");
    // I.add("N");
    // System.out.println(I); // [A, 10, M, null, N]

    // ArrayList l1 = new ArrayList();
    // LinkedList l2 = new LinkedList();
    // System.out.println(l1 instanceof Serializable);
    // System.out.println(l2 instanceof Cloneable);
    // System.out.println(l1 instanceof RandomAccess);
    // System.out.println(l1 instanceof RandomAccess);

    ArrayList l1 = new ArrayList();
    List l = Collections.synchronizedList(l1);
  }
}