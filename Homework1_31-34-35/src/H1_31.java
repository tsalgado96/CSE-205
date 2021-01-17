/**
 * CLASS: H1_31 (H1_31.java)
 * GROUP Y
 * AUTHOR 1: Teodoro Salgado, tjsalgad, tsalgado96@gmail.com
 * AUTHOR 2: Isaac Pena, ipena5, ippenaisaac@gmail.com
 * AUTHOR 3: Stephen Elledge, saelledg, saelledg@asu.edu
 */
import java.util.ArrayList;

public class H1_31 {

    // Default constructor
    public H1_31(){}

    // Public instance method named arrayListInit
    public ArrayList<Integer> arrayListInit() {

        // Creates the ArrayList to return
        ArrayList<Integer> list = new ArrayList<>();

        // Adds numbers 0 - 4 into the ArrayList
        for (int i = 0; i <= 4; i++){
            list.add(i);
        }

        // Adds numbers 0 - 4 into the ArrayList again
        for (int i = 0; i <= 4; i++){
            list.add(i);
        }

        // Returns a reference to the ArrayList object list
        // which now contains {0, 1, 2, 3, 4, 0, 1, 2, 3, 4}
        return list;
    }
}