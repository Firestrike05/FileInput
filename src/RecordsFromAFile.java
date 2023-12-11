import java.util.Scanner;
import java.nio.file.Paths;
import java.io.IOException;
//Method to read names and ages from a given file
public class RecordsFromAFile {
    //Declare method as void
    public static void pullData(String fileName){
        //Create a scanner object to read each line of the file
        try{Scanner file = new Scanner(Paths.get(fileName + ".txt"));
            //Check that the file has a next line
            while(file.hasNextLine()){
                String line = file.nextLine();
                //Check if the line is empty, if it is, continue to the next line if there is one
                if(line.trim().isEmpty()){
                    continue; }
                //Create a String array to store data
                String[] parts = line.split(",");
                //Only two bits of data are taken and so will be stored in index 0 and 1 of the array
                String name = parts[0];
                String age = parts[1];
                //Print the data on the screen, continue while loop until no more lines in the given file
                System.out.println(name + ", age " + age); }
        }
        //Throw an exception if file doesn't exist
        catch(IOException e){System.out.println(e);}
    }
    public static void main(String[] args){
        //Take user input for the filename
        Scanner s = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = s.nextLine();
        //Call the pullData method to check the file and list all the data on a separate line
        pullData(fileName);
    }
}
