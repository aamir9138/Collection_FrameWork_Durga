import java.util.*;
class VectorDemo1{
  public static void main(String [] args){
    // Vector v = new Vector();
    // for (int i =1; i<=10; i++){
    //   v.addElement(i);
    // }
    // System.out.println(v.capacity()); // 10
    // v.addElement("A");
    // System.out.println(v.capacity()); //20
    // System.out.println(v); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]

    // // default initial capacity
    // Vector v = new Vector(25);
    // for (int i =1; i<=10; i++){
    //   v.addElement(i);
    // }
    // System.out.println(v.capacity()); // 15
    // v.addElement("A");
    // System.out.println(v.capacity()); //25
    // System.out.println(v); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]

    // incremental default initial capacity
    Vector v = new Vector(10,5);
    for (int i =1; i<=10; i++){
      v.addElement(i);
    }
    System.out.println(v.capacity()); // 10
    v.addElement("A");
    System.out.println(v.capacity()); //15
    System.out.println(v); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]

  }
}