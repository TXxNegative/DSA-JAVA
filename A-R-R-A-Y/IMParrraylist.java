
import java.util.ArrayList;

public class IMParrraylist {
    //arraylist is a datatype in java. wen we dont want to fix the size of length of array , we can insert any ammount of input in array java will handle its size we dont have to mention it.
   
    //Objects Only: It cannot store primitive data types (like int or char) directly; you must use their corresponding wrapper classes (like Integer or Character).
    
    // Duplicates & Nulls: It permits both duplicate values and null values.

    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list= new ArrayList<>(10);

        //insert element at arraylist
        list.add(10);
        list.add(12);
        list.add(100);
        list.add(90);

        System.out.println(list.contains(12));//check for element is avail or not
        list.set(3,5);//setting an element at a index position
        list.get(2);//use to get the element from the arraylist
        list.remove(1);//remocing an element from given index
        System.out.println(list.size());//length of arrayist
        System.out.println(list);

        //working -> when atleast half of the capacity of the arraylist is full then it create a new arraylist with the double the size of old arraylist, then copy paste the element in the new arraylist.
    }
}
