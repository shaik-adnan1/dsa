import java.util.Arrays;
import java.util.ArrayList;

/**
 * PERFORMANCE - ARRAY / ARRAYLIST
 * 
 * Arrays: Arrays generally have better performance for random access and
 * iteration due to their contiguous memory allocation.
 * 
 * ArrayLists: ArrayLists have better performance for adding or removing
 * elements in the middle of the list, as they automatically handle resizing and
 * shifting of elements. However, they may have slightly worse performance for
 * random access compared to arrays.
 */

public class arrays {
    public static void main(String[] args) {

        // ARRAYS have fixed length

        String[] array = new String[5];
        String[] myName = { "Shaik", "Yousuf", "Adnan" };
        int[] prs = { 17, 110, 80 };

        String name = "shaik";

        // ARRAYLISTS don't have a fixed length,

        ArrayList<String> friendsArrayList = new ArrayList<>();

        // ArrayLists can hold any kind of data types
        ArrayList<Object> friendList2 = new ArrayList<>(Arrays.asList("Shaik Yousuf Adnan", 25));

        System.out.println(friendList2);
        System.out.println(myName[1]);

        // Length 
        // array.length, arrayList.size()
        System.out.println(myName.length);
        System.out.println(friendList2.size());

        // Adding elements to array and arrayLists
        // Can't add elements to array

        friendList2.add("kiran");
        System.out.println(friendList2);

        // changing element at a certain index
        // Array
        myName[0] = "Shaikuuuu";
        System.out.println(myName[0]);
        // ArrayList
        friendList2.set(2, "Fiza");
        System.out.println(friendList2);

        // Removing element
        // Array - can't 
        // ArrayList
        friendList2.add("john");
        friendList2.remove(3);

        // Printing array and arrayList
        System.out.println(myName);

    }
}