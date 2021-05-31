import java.util.Scanner;

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

        // Betting Actions Begin Here
        System.out.println("Player " + this.name + ", Place your bets.");
        while ( continueBetting ) 
        {
            // Prints the Betting Options
            for (int i = 0; i < betOptions.length; i++) {
                System.out.println(betOptions[i]);
            }

            System.out.print("\tUser Selected: ");
            betSelection = cin.nextInt();
        }
        cin.close();
    }
}
