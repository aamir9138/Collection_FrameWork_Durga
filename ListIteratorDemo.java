import java.util.*;
class ListIteratorDemo{
  public static void main(String[] args){
    LinkedList l = new LinkedList();
    l.add("Aamir");
    l.add("idrees");
    l.add("wisal");
    l.add("Afzal");
    System.out.println(l); // [Aamir, idrees, wisal, Afzal]
    ListIterator Itr = l.listIterator();
    while(Itr.hasNext()){
      String s = (String)Itr.next();
      if(s.equals("wisal")){
        Itr.set("sohail");
      }
      else if(s.equals("idrees")){
        Itr.add("shakeel");
      }
      else if(s.equals("Aamir")){
        Itr.remove();
      }
    }
    System.out.println(l); // [idrees, shakeel, sohail, Afzal]
  }
}