/**
 * CLASS: H1_34 (H1_34.java)
 * GROUP Y
 * AUTHOR 1: Teodoro Salgado, tjsalgad, tsalgado96@gmail.com
 * AUTHOR 2: Isaac Pena, ipena5, ippenaisaac@gmail.com
 * AUTHOR 3: Stephen Elledge, saelledg, saelledg@asu.edu
 */
import java.util.ArrayList;

public class H1_34 {

    // Default constructor
    public H1_34(){}

    // Public instance method named arrayListSum
    public Integer arrayListSum(ArrayList <Integer> pList) {

        // Declare a new Integer object initialized to 0
        Integer sum = 0;

        // If pList is either null or empty, method will return
        // the intitialized sum, which is 0
        if (pList == null || pList.isEmpty() == true) {
            return sum;
        }

        // If pList has Integer elements, iterate through the
        // ArrayList and add each element to the Integer object sum
        else {
            for (Integer i : pList){
                sum += i;
            }
        }

        // Return the sum of all elements
        return sum;
    }
}