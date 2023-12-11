import java.util.Scanner;
import java.util.ArrayList;
public class NumberOfStrings {
    public static void main(String[] args){
        //Declare scanner and arraylists
        Scanner s = new Scanner(System.in);
        ArrayList<String> sCount = new ArrayList<>();
        //Create a while loop to take repeat input from user
        while(true){
            System.out.println("Enter a string: ");
            String line = s.nextLine();
            if(line.trim().equalsIgnoreCase("end")){
                break; //Stop taking input if user enters 'end'
            } else sCount.add(line); //Store entered strings in the array
        }
        System.out.println(sCount.size()); //Print number of strings entered
    }
}
