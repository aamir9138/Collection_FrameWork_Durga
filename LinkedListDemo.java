import java.util.*;
public class LinkedListDemo{
  public static void main(String[] args){
    LinkedList l1 = new LinkedList();
    l1.add("durga"); // [durga]
    l1.add(30); // [durga,30]
    l1.add(null); // [durga, 30, null]
    l1.set(0,"software"); // [software,30,null]
    l1.add(0,"venkey"); // [venkey, software,30,null]
    l1.addFirst("ccc"); // [ccc, venkey, software, 30, null]
    l1.removeLast(); // [ccc, venkey, software, 30 ]
    System.out.println(l1); // [ccc, venkey, software, 30]
  }
}