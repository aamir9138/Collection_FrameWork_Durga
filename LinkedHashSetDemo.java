import java.util.*;
class LinkedHashSetDemo{
  public static void main(String [] args){
    LinkedHashSet h = new LinkedHashSet();
    h.add("B");
    h.add("C");
    h.add("D");
    h.add("Z");
    h.add(null);
    h.add(10);
    System.out.println(h.add("Z")); // false
    System.out.println(h); // [B, C, D, Z, null, 10] insertion order is preserved
  }
}