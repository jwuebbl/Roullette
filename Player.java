import java.util.Scanner;
import java.util.regex.Pattern;

public class Player {
    // Used to read in the interactions with the player. 
    private Scanner cin = new Scanner(System.in);

    // A Player's key characteristics.
    private String name;
    private int chips;


    // Constructors
    Player()                                {this.name = "Sim"; this.chips = 100;}
    Player(String name, int startingChips)  {this.name = name; chips = startingChips;}

    // Used to fill the array that prints the bet options.
    private String [] initializeBettingOptions()
    {
        String [] betOptions = new String[6];
        betOptions[0] = "1. Red Or Black";
        betOptions[1] = "2. Odds Or Evens";
        betOptions[2] = "3. Thirds";
        betOptions[3] = "4. Rows";
        betOptions[4] = "5. Indivdual Numbers";
        betOptions[5] = "6. Quit and Cashout";
        return betOptions;
    }

    // Used to set the boolean that controls the placing bets 'while' loop.
    private boolean setContinueBettingFlag()
    {
        String playAgain;
        System.out.print("\t\tEnter \"S\" to stop placing bets, or enter any other key to continue: ");
        playAgain = cin.next();

        // Only the first character needs to be "S" or "s"
        if ( playAgain.matches("S(.*)") || playAgain.matches("s(.*)") ) {
            System.out.println("User is no longer making bets.");
            return false;
        }
        return true;
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
            System.out.print("\tUser Selected: ");
            betSelection = cin.nextInt();

            // Bet
            // Each print will start with atleast 2 tabs.
            // Stubout actions for each case.
            switch (betSelection) {
                case 1:
                    System.out.println("\t\tBetting Red or Black:");
                    //TODO: Create method to bet on red or black.
                        // 1. User selects to bet Red or Black.
                        // 2. User selects how much they want to bet on Red or Black.
                        // 3. The bet is placed.
                    continueBetting = setContinueBettingFlag();
            }
            
        }
        cin.close();
    }
}
