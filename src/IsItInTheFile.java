import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;
public class IsItInTheFile {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner s = new Scanner(System.in);
        System.out.println("Enter filename: ");
        //Ask user for filename and store this in file
        String file = s.nextLine();
        System.out.println("Enter string to find: ");
        //Ask user what string to find and store this in toFind
        String toFind = s.nextLine();
        try {
            //Create scanner to pass through each line of the file
            Scanner fileScanner = new Scanner(Paths.get(file + ".txt"));
            Boolean found = false;
            while(fileScanner.hasNextLine()) {
                String current = fileScanner.nextLine();
                //Check if the file contains the user defined string toFind
                if(toFind.equalsIgnoreCase(current)){
                    //If toFind is found, change found to true
                    found = true;
                }
            } if(found){
                System.out.println("Found");
            } else System.out.println("Not Found");
        } catch(IOException e){
            //If the file doesn't exist, throw an error
            System.out.println("Reading the file " + file + " failed");
        }
    }
}
