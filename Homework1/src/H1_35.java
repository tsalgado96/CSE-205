/**
 * CLASS: H1_35 (H1_35.java)
 * GROUP Y
 * AUTHOR 1: Teodoro Salgado, tjsalgad, tsalgado96@gmail.com
 * AUTHOR 2: Isaac Pena, ipena5, ippenaisaac@gmail.com
 * AUTHOR 3: Stephen Elledge, saelledg, saelledg@asu.edu
 */
import java.util.ArrayList;

public class H1_35 {

    // Default constructor
    public H1_35(){}

    // 	Public instance method named arrayListCreate
    public ArrayList<Integer> arrayListCreate(int pLen, int pInitValue) {

        // When pLen is 0, no list shall be created and the method shall return null
        if (pLen == 0){
            return null;
        }

        // If pLen is not 0, the list is created
        ArrayList<Integer> arr = new ArrayList<>();

        // Each element is initialized to pInitValue with exactly pLen elements
        for (int i = 0; i < pLen; i++){
            arr.add(pInitValue);
        }

        // Returns a reference to the ArrayList
        return arr;
    }
}