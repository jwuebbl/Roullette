import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    // Used to read in the interactions with the player. 
    private Scanner cin = new Scanner(System.in);

    // A Player's key characteristics.
    private String name;
    private int chips;
    private List<Bet> bets = new ArrayList<Bet>();    


    // Constructors
    Player()                                {this.name = "Sim"; this.chips = 100;}
    Player(String name, int startingChips)  {this.name = name; chips = startingChips;}

    // Used to fill the array that prints the bet options.
    private String [] initializeBettingOptions()
    {
        String [] betOptions = new String[7];
        betOptions[0] = "1. Red Or Black";
        betOptions[1] = "2. Odds Or Evens";
        betOptions[2] = "3. Thirds";
        betOptions[3] = "4. Rows";
        betOptions[4] = "5. Indivdual Numbers";
        betOptions[5] = "6. Stop Making Bets";
        betOptions[6] = "7. Quit and Cashout";
        return betOptions;
    }

    // Used to set the boolean that controls the placing bets 'while' loop.
    private boolean setContinueBettingFlag()
    {
        String playAgain;
        System.out.print("\t\tEnter \"S\" to stop placing bets, or enter any other key to continue making bets: ");
        playAgain = cin.next();

        // Only the first character needs to be "S" or "s"
        if ( playAgain.matches("S(.*)") || playAgain.matches("s(.*)") ) {
            System.out.println("User is no longer making bets.");
            return false;
        }
        return true;
    }

    private void betRedOrBlack()
    {   
        System.out.print("\t\t(B)lack or (R)ed: ");
        String color = cin.next();

        if ( color.matches("B(.*)") || color.matches("b(.*)") ) {
            System.out.print("\t\t\tHow much do you want to bet on Black?: ");
            bets.add(new Bet("Black", cin.nextInt()));
        }
        else if ( color.matches("R(.*)") || color.matches("r(.*)") ) {
            System.out.print("\t\t\tHow much do you want to bet on Red?: ");
            bets.add(new Bet("Red", cin.nextInt()));
        }
        else {
            System.out.print("\t\t\tInvalid Selection, Do you wish to bet on Red or Black? (Y/N): ");
            String continueBetting = cin.next();
            if ( continueBetting.matches("Y(.*)") || continueBetting.matches("y(.*)") ) {
                betRedOrBlack();
            }
        }
        // If the user doesn't make a bet or doesn't select 'Y' or 'y' after being reminded the function should exit.
    }

    public void placeBets()
    {
        // Declaring and Initializing Variables
        String []   betOptions      = initializeBettingOptions();
        boolean     continueBetting = true;
        int         betSelection;

        // Betting Actions Begin Here
        System.out.println("Player " + this.name + ", Place your bets.");
        while ( continueBetting ) 
        {
            // Prints the Betting Options
            for (int i = 0; i < betOptions.length; i++) {
                System.out.println(betOptions[i]);
            }

            // User Selection
            System.out.print("\tUser Selected: Option ");
            betSelection = cin.nextInt();

            // Bet
            // Each print will start with atleast 2 tabs.
            switch (betSelection) {
                case 1:
                    // Red or Black
                    betRedOrBlack();
                    continueBetting = setContinueBettingFlag();
            }            
        }
        cin.close();
    }

    public void printBets() {
        for (int i = 0; i < bets.size(); i++) {
            System.out.println(bets.get(i));
        }
    }
}
