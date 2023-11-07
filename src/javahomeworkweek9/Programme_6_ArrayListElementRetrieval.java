package javahomeworkweek9;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given array list
 */

public class Programme_6_ArrayListElementRetrieval {
    // Declare main method
    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<>();

        //Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Fig");

        int indexToRetrieve = 4; // index of the element to retrieve

        // call the method to retrive an element at the specified index
        String retrievedElement = retrieveElementAtIndex(arrayList,indexToRetrieve);

        if(retrievedElement != null)  {
            System.out.println("Element at index" + indexToRetrieve + " :" + retrievedElement);

        }else {
            System.out.println("Index out of bounds.");
        }

    }
    //Method to retrieve an element from the ArrayList at a specified index
    public static String retrieveElementAtIndex(ArrayList<String> list, int index){
        if(index >= 0 && index < list.size()){
            return list.get(index);
        }
        return null; // Return null if index out of bounds
    }
}
