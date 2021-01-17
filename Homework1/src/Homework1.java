import java.util.ArrayList;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("|      HOMEWORK 1 DRIVER      |");
        System.out.println("-------------------------------");
        System.out.println();


        /****************************
         *          Ex. 3.1         *
         ****************************/
        System.out.print("Ex. 3.1) ");
        H1_31 obj31 = new H1_31();
        ArrayList<Integer> arr31 = obj31.arrayListInit();

        for (Integer i : arr31){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();


        /****************************
         *          Ex. 3.4         *
         ****************************/
        System.out.print("Ex. 3.4) ");
        H1_34 obj34 = new H1_34();
        ArrayList<Integer> arr34 = new ArrayList<>();
        for (int i = 1; i <= 5; i++){
            arr34.add(i);
        }
        System.out.println(obj34.arrayListSum(arr34));
        System.out.println();


        /***************************
         *          Ex. 3.5         *
         ****************************/
        System.out.print("Ex. 3.5) ");
        H1_35 obj35 = new H1_35();
        ArrayList<Integer> arr35 = obj35.arrayListCreate(5, 1);
        for (Integer i : arr35){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();


        /***************************
         *          Ex. 4.3         *
         ****************************/
        System.out.print("Ex. 4.3) ");



    } // end main(String[] args)
} // end Main

