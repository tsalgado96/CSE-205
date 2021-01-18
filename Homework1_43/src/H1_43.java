/**
 * CLASS: H1_43 (H1_43.java)
 * GROUP Y
 * AUTHOR 1: Teodoro Salgado, tjsalgad, tsalgado96@gmail.com
 * AUTHOR 2: Isaac Pena, ipena5, ippenaisaac@gmail.com
 * AUTHOR 3: Stephen Elledge, saelledg, saelledg@asu.edu
 */
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class H1_43 {
    public static void main(String[] pArgs) {

        new H1_43().run(); // Instantiate an object of this class and then call run() on the object

    }

    public H1_43() {}

    private void run() {
        // Scanner object to collect the user input
        Scanner input = new Scanner(System.in);

        // Collection of the file name given by the user
        System.out.print("Enter the file name: ");
        String fileName = input.next();

        try {
            // Opens the file for reading
            Scanner scanner = new Scanner(new File(fileName));
            // Opens the file for writing, with a .txt extension
            PrintWriter out = new PrintWriter(new File(fileName + ".txt"));

            // Counts the line the file is on, for formatting
            int lineCounter = 1;
            // Declares a String object to store the content of the file
            String currentLine;

            // Loops until the end of the file where there are no more lines
            while (scanner.hasNextLine()) {
                // Stores the content of the current line
                currentLine = scanner.nextLine();
                // Prints the current line with the formatted number line
                out.printf("[%03d] %s\n",lineCounter, currentLine);

                // Increment the line number
                lineCounter++;

            }

            // Close read and write files
            scanner.close();
            out.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found");
        }

    }
}
