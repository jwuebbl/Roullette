import java.util.Scanner;
import java.util.regex.Pattern;

public class Player {
    private String name;
    private int chips;
    private int bet_RedOrBlack = 2;
    private int bet_OddOrEven = 2;
    private int block = 0;
    private int row = 0;


    Player()                                {this.name = "Sim"; this.chips = 100;}
    Player(String name, int startingChips)  {this.name = name; chips = startingChips;}

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

    public void placeBets()
    {
        // Declaring and Initializing Variables
        Scanner cin = new Scanner(System.in);
        String [] betOptions = initializeBettingOptions();
        boolean continueBetting = true;
        int     betSelection;
        String    playAgain;

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
                    //TODO: Insert Red or Black
                    System.out.print("\t\tPress Y/y to place more bets: ");
                    playAgain = cin.next();
                    if ( playAgain == "Y" || playAgain == "y" )
                        placeBets();
                    else
                        break;
                    break;

                
            
                default:
                    break;
            }
        }
        cin.close();
    }
}
