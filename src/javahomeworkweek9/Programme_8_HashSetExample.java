package javahomeworkweek9;

import java.util.HashSet;

/**
 *  Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set.
 */
public class Programme_8_HashSetExample {

    // declare main method
    public static void main(String[] args) {
        HashSet<Integer>numberSet = new HashSet<>();
        //Add the number4 ,7,and 8 to HashSet

        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        System.out.println("Numbers in the set");
        checkNumbersInSet(numberSet);


    }

    public static void checkNumbersInSet(HashSet<Integer>set){
        for(int i =1 ; i <=10; i++){
            if(set.contains(i)){
                System.out.println(i + "is in the set");
            }else{
                System.out.println(i + "is not in the set");
            }
        }
    }
}
