import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;

public class GuestListFromFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of file: ");
        String fileName = scanner.nextLine();

        try {
            Scanner fileScanner = new Scanner(Paths.get(fileName + ".txt"));

            System.out.println("Enter names, an empty line quits.");

            while (true) {
                System.out.println("Enter a name: ");
                String name = scanner.nextLine().trim();

                if (name.isEmpty()) {
                    break; // Break the loop if an empty line is entered
                }

                boolean found = false;
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    if (line.equalsIgnoreCase(name)) {
                        found = true;
                        System.out.println("The name is on the list.");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("The name is not on the list.");
                }

                // Reset the file scanner to read from the beginning for each name
                fileScanner.close();
                fileScanner = new Scanner(Paths.get(fileName + ".txt"));
            }

            fileScanner.close(); // Close the file scanner after the loop
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
