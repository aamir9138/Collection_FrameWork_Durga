## Collection Framework

### Collection

!["Collection"](./pictures/Collection.PNG)

### Collection Framework

!["Collection Framework"](./pictures/Collection_Framework.PNG)

### Collection vs Collections

!["Collections vs Collections"](./pictures/Collection_vs_Collections.PNG)

### Collection in Java vs Cplusplus

!["Collection java cplus cplus"](./pictures/collection_java_Cplusplus.PNG)

### list

!["list"](./pictures/list.PNG)

### list tree

!["list tree"](./pictures/list_tree.PNG)

### set

!["set"](./pictures/set.PNG)

### list and set differences

!["list and set differences"](./pictures/list_and_set_differences.PNG)

### set tree

!["set tree"](./pictures/set_tree.PNG)

### sorted set

!["sorted set"](./pictures/sorted_set.PNG)

### navigable set

!["navigable set"](./pictures/navigableSet.PNG)

### navigable set tree

!["navigable set tree"](./pictures/navigableSet_tree.PNG)

### nine key interfaces of collection framework

!["nine key interfaces"](./pictures/nine_key_interfaces_of_collectionframework.PNG)

## nine key interfaces of Collection framework vi Queue

!["Queue"](./pictures/Queue.PNG)

!["Queue hierarchy"](./pictures/Queue_hierarchy.PNG)

!["Queue note"](./pictures/Queue_note.PNG)

## Map

`Map` is not the child interface of `Collection`. `Map` is separate than `Collection`. in `Map` we have `key` and `value`. both the `key` and `value` are objects.

!["Map"](./pictures/map.PNG)

!["Map hierarchy"](./pictures/map_hierarchy.PNG)

## nine key interfaces of Collection framework viii SortedMap ix NavigableMap

!["sorted map"](./pictures/sorted_map.PNG)

!["Navigable map"](./pictures/navigable_map.PNG)

## Collection Framework Overview

### Collection Interface

!["Collection_Interface"](./pictures/Collection_Interface.PNG)

### Map Interface

!["map Interface"](./pictures/map_interface.PNG)

## Collection Interface Details

!["Collection Interface Details"](./pictures/Collection_Interface_details.PNG)

### methods in Collection Interface

!["Methods of Collection interface"](./pictures/methods_of_Collection_Interface.PNG)

!["Collection interface note"](./pictures/Collection_interface_note.PNG)

## List Interface details

!["list interface details"](./pictures/list_interface_details.PNG)

!["list interface specific methods"](./pictures/list_interface_specific_methods.PNG)

## ArrayList details (Collection Framework)

ArrayList is the first implementation class of `list interface`.

- underline data structure for ArrayList is `Resizable Array or Growable Array`

!["ArrayList details"](./pictures/ArrayList_details.PNG)

### ArrayList Constructors

!["ArrayList constructor"](./pictures/ArrayList_constructor.PNG)

two more constructor we have. in first we provide initial capacity can be 1000 or more. so everytime garbage collection problem will be solved.
in the second constructor we can provide any other collection like `linklist` or `treeset`.

!["ArrayList other constructors"](./pictures/ArrayList_other_constructors.PNG)

here below is a simple program. here if you observe the output is inside square brackets this is because of the `toString` method is called internally while we
do `System.out.println`

```
import java.util.*;
class ArrayListDemo
{
  public static void main(String[] args){
    ArrayList I = new ArrayList();
    I.add("A");
    I.add("10");
    I.add("A");
    I.add(null);
    System.out.println(I); // [A, 10, A, null]
    I.remove(2);
    System.out.println(I); // [A, 10, null]
    I.add(2,"M");
    I.add("N");
    System.out.println(I); // [A, 10, M, null, N]
  }
}
```

### Important points

1. so ArrayList implements `Serializable and cloneable interfaces`. This is true for all the Collection implementation classes.
   !["ArrayList important point"](./pictures/ArrayList_important_point.PNG)

2. `ArrayList` and `Vector` implements `RandomAccess` interface. which means we can access any element with same speed say 1 sec for example. `Random Access interface` present in `java.util` package. it doesn't contain any method it is a `marker interface`.

!["ArrayList Random Access"](./pictures/ArrayList_RandomAccess.PNG)

!["ArrayList instance of"](./pictures/ArrayList_instanceOf.PNG)

!["ArrayList use"](./pictures/ArrayList_use.PNG)

## Difference between ArrayList and Vector

!["ArrayList and vector differences"](./pictures/ArrayList_vector_differences.PNG)

## How to get Synchronized ArrayList Object

By default ArrayList is non-synchronized but we can get synchronized version of ArrayList by using `Collections` class `synchronizedList()` method.

```
    ArrayList l1 = new ArrayList();
    List l = Collections.synchronizedList(l1);
```

!["Synchronized list"](./pictures/synchronized_list.PNG)

!["synchronized set and map"](./pictures/synchronized_set_map.PNG)

## LinkedList details

!["Linked List details"](./pictures/LinkedList_details.PNG)

!["Linked List use"](./pictures/LinkedList_use.PNG)

## LinkedList methods

!["Linked List methods"](./pictures/LinkedList_methods.PNG)

## LinkedList Constructors

!["LinkedList constructors"](./pictures/LinkedList_Constructors.PNG)

one small program

```
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
```

## Difference between ArrayList and LinkedList

!["difference ArrayList and LinkedList"](./pictures/difference_AL_LL.PNG)

## Vector class details

!["vector details"](./pictures/vector_details.PNG)

## Vector specific methods

in ArrayList very short names for methods. in vector very long name for methods because vector came in 1.0 version and ArrayList in 1.2V

!["vector specific methods"](./pictures/Vector_specific_methods.PNG)

!["vector remove methods"](./pictures/vector_remove_methods.PNG)

!["vector retrieving methods"](./pictures/vector_retrieving_methods.PNG)

enumeration method means if we want to get the objects one by one one by one.

## vector class constructors

!["vector_constructors"](./pictures/vector_constructors.PNG)

a small program for vectors

```
import java.util.*;
class VectorDemo1{
  public static void main(String [] args){
    Vector v = new Vector();
    for (int i =1; i<=10; i++){
      v.addElement(i);
    }
    System.out.println(v.capacity()); // 10
    v.addElement("A");
    System.out.println(v.capacity()); //20
    System.out.println(v); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]

  }
}
```

```
    // default initial capacity
    Vector v = new Vector(25);
    for (int i =1; i<=10; i++){
      v.addElement(i);
    }
    System.out.println(v.capacity()); // 15
    v.addElement("A");
    System.out.println(v.capacity()); //25
    System.out.println(v); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]

```

```
    // incremental default initial capacity
    Vector v = new Vector(10,5);
    for (int i =1; i<=10; i++){
      v.addElement(i);
    }
    System.out.println(v.capacity()); // 10
    v.addElement("A");
    System.out.println(v.capacity()); //15
    System.out.println(v); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
```

## Stack

- it is a child class of vector
- it is specially designed class for LIFO

### Stack constructor

`Stack s = new Stack();`

### Stack methods

1. push(Object o)
2. pop() --- remove and return top of stack
3. peek() --- only return top of stack not remove
4. empty() --- to check if stack is empty
5. search("A") --- return offset from top of the stack i.e 3 or 4 etc, if not available return -1

!["stack methods"](./pictures/stack_methods.PNG)

```
import java.util.*;
class StackDemo{
  public static void main(String [] args){
    Stack s = new Stack();
    s.push("A");
    s.push("B");
    s.push("C");
    System.out.println(s); // [A, B, C] insertion order is preserved
    System.out.println(s.search("A")); // 3
    System.out.println(s.search("Z")); // -1

  }
}
```

## Three Cursors of Java

!["Three Cursors"](./pictures/Cursors.PNG)

### 1. Enumeration

!["Enumeration"](./pictures/Enumeration.PNG)

### methods of Enumeration

!["Enumeration methods"](./pictures/Enumeration_methods.PNG)

here is a simple program

```
import java.util.*;
class EnumerationDemo{
  public static void main(String [] args){
    Vector v = new Vector();
    for (int i=0; i<=10; i++){
      v.addElement(i);
    }
    System.out.println(v); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    Enumeration e = v.elements();
    while(e.hasMoreElements()){
      Integer I = (Integer)e.nextElement();
      if (I % 2 == 0){
        System.out.println(I); // output one be one even numbers

      }
    }
    System.out.println(v); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
  }
}
```

enumeration has some limitations so we use `Iterators`.

- Enumeration is only applicable to legacy classes.
- Enumeration can perform only read operation not the remove operation.

### 2. Iterator

!["Iterator"](./pictures/Iterator.PNG)

`Iterator itr = c.Iterator();` where is the object of any collection.

### Iterator Object

!["Iterator Object"](./pictures/Iterator_Object.PNG)

!["Iterator methods"](./pictures/Iterator_methods.PNG)

here we have a simple program

```
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
```

### limitations of Iterator

1. always move in forward direction. so moving single direction only. sometime we need bidirectional cursors.
2. addition of new objects not possible
3. replacement of objects not possible

!["limitation of iterators and enumeration"](./pictures/iterators_enumeration_limitations.PNG)

### 3. ListIterators

!["List Iterator"](./pictures/ListIterator.PNG)

!["list iterator creation"](./pictures/listiterator_creation.PNG)

!["list iterator methods"](./pictures/listiterator_methods.PNG)
