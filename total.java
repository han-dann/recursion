import java.util.ArrayList;
import java.io.*;

class Total {

  public static int getTotal(ArrayList<Integer> arr) {
    // Add code below
    if (arr.size() == 0) { //base case
      return 0;
    } else {
      int temp = arr.get(0); //temporary variable to store the first element of the ArrayList before removing it.
      arr.remove(0);//removing the element at index 0, from an ArrayList named, 'arr'.
      return temp + getTotal(arr);//returning the sum of the first element and a recursive call to getTotal method, with argument of arraylist value minus the first element.
    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> myArrayLs = new ArrayList<Integer>();
    myArrayLs.add(3);
    myArrayLs.add(5);
    myArrayLs.add(6);
    myArrayLs.add(9);
  
    int total = getTotal(myArrayLs);
    System.out.println(total);
  }
}
