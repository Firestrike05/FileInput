import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;
public class NumbersFromAFile {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); //Declare scanner
        System.out.println("Enter the filename: ");
        String file = s.nextLine(); //Store input from user for the filename
        System.out.println("Enter the smallest number: ");
        int small = Integer.valueOf(s.nextLine()); //Store user input for start of range
        System.out.println("Enter the largest number: ");
        int large = Integer.valueOf(s.nextLine()); //Store user input for end of range
        int count = 0; //Store the amount of numbers within the given range
        try{
            Scanner fileScanner = new Scanner(Paths.get(file + ".txt")); //Read the file the user defined
            while(fileScanner.hasNextLine()){ //Repeat the look while the file as another line
                int num = Integer.valueOf(fileScanner.nextLine()); //Store a number from the file
                if(num >= small & num <= large){ //Check if the number in the file is within the user defined range
                    count++; //Increase the count if the number is within the defined range
                }
            }
        } catch(IOException e){
            System.out.println("Error " + e);
        } System.out.println(count);
    }
}