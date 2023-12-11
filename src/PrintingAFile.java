import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingAFile {
    public static void main(String[] args){
        //Create a scanner object
        Scanner u = new Scanner(System.in);
        System.out.println("Enter the filename: ");
        //User input for the filename
        String user = u.nextLine();
        try(Scanner s = new Scanner(Paths.get(user + ".txt"))){
            //Check if the file exists and has a next line
            while(s.hasNextLine()){
                String row = s.nextLine();
                //Store the next line of the file in row, and print
                System.out.println(row);
            }
        } catch(Exception e){
            //If the file doesn't exist, throw an error
            System.out.println("Error " + e.getMessage());
        }
    }
}
