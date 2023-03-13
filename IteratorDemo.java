import java.util.*;
class IteratorDemo{
  public static void main(String [] args){
    ArrayList I = new ArrayList();
    for (int i=0; i<=10; i++){
      I.add(i);
    }
    System.out.println(I); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    Iterator itr = I.iterator();
    while(itr.hasNext()){
      Integer L = (Integer)itr.next();
      if (L % 2 == 0){
        System.out.println(L);        
      }
      else {        
        itr.remove();
      }
    }
    System.out.println(I); // [0, 2, 4, 6, 8, 10]
  }
}