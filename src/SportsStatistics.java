import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;

public class SportsStatistics {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the filename: ");
        //Take user input for the filename
        String fileName = s.nextLine();
        System.out.println("Enter the teamname: ");
        String teamName = s.nextLine();
        //Call the fileReader method with fileName as the argument
        fileReader(fileName, teamName);
    }


    public static void fileReader(String fileName, String teamName) {
        //Try to get the file the user inputted
        try (Scanner fileScanner = new Scanner(Paths.get(fileName + ".csv"))) {
            //While the file has a next line, continue loop
            String team = teamName;

            int gameCount = 0;
            int wins = 0;
            int losses = 0;

            while (fileScanner.hasNextLine()) {
                //Store the current line in variable line
                String line = fileScanner.nextLine();
                //If the line is empty, move to the next line
                if (line.trim().isEmpty()) {
                    continue;
                }
                //Split the current line into an array
                String[] parts = line.split(",");
                //Check if the team name is the same the user entered
                if(parts[0].equalsIgnoreCase(team)){
                    //Increase games played by 1
                    gameCount++;
                    //Check if the team won or lost and update wins/losses
                    if(Integer.parseInt(parts[2]) > Integer.parseInt(parts[3])){
                        wins++;
                    } else losses++;
                }else if(parts[1].equalsIgnoreCase(team)){
                    gameCount++;
                    if(Integer.parseInt(parts[3]) > Integer.parseInt(parts[2])){
                        wins++;
                    } else losses++;
            }
        }   //Print games played and win/loss stats
            System.out.println("Games played: " + gameCount);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        //If the file doesn't exist, throw an error
    } catch (IOException e) {
            System.out.println(e);
        }
    }
}
