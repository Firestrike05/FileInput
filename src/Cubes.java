import java.util.Scanner;
public class Cubes {
    public static void main(String[] args){
        //Declare scanner and arraylists
        Scanner s = new Scanner(System.in);
        //Create a while loop to take repeat input from user
        while(true){
            System.out.println("Enter a number to find the cube value: ");
            String line = s.nextLine();
            if(line.trim().equalsIgnoreCase("end")){
                break; //Stop taking input if user enters 'end'
            }
            int num = Integer.valueOf(line); //Store integers to num
            System.out.println(num * num * num); //Print out cube value of num
        }
    }
}
