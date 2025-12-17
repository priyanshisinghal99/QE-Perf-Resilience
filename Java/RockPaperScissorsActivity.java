import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsActivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randomNo = new Random();

        while(true){
            System.out.println("Choose between (R/P/S): ");
            String choice1 = sc.nextLine().toUpperCase();
            int compChoice = randomNo.nextInt(3);
            String choice2 = "R";
            if(compChoice == 1){
                choice2 = "P";
            }
            else if(compChoice == 2){
                choice2 = "S";
            }

            System.out.println("Player2's choice: "+ choice2);
            if((!choice1.equals("R") && !choice1.equals("P") && !choice1.equals("S")) || (!choice2.equals("R") && !choice2.equals("P") && !choice2.equals("S"))){
                System.out.println("Please input a valid choice!!");
                continue;
            }
            if(choice1.equals(choice2)){
                System.out.println("It's a Draw!");
            }
            else if(choice1.equals("R") && choice2.equals("P")){
                System.out.println("Player2 won!");
            }
            else if(choice1.equals("R") && choice2.equals("S")){
                System.out.println("Player1 won!");
            }
            else if(choice1.equals("P") && choice2.equals("R")){
                System.out.println("Player1 won!");
            }
            else if(choice1.equals("P") && choice2.equals("S")){
                System.out.println("Player2 won!");
            }
            else if(choice1.equals("S") && choice2.equals("R")){
                System.out.println("Player2 won!");
            }
            else if(choice1.equals("S") && choice2.equals("P")){
                System.out.println("Player1 won!");
            }
            System.out.println("Do you want to play another round? (Y/N)? ");
            String wish = sc.nextLine();

            if(!wish.equalsIgnoreCase("Y")){
                System.out.println("Game Over!!");
                break;
            }
        }
        sc.close();
    }
}
