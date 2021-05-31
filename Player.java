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

    public void placeBets()
    {
        Scanner cin = new Scanner(System.in);
        int userInput;
        
        while (true)
        {
            System.out.println("Select your bet:\n1. Red or Black\n2. Odd or Even\n3. Block\n4. Row\n5. Individual Space\n6. Save your money and quit");
            try {
                userInput = cin.nextInt();
                if (userInput > 0 && userInput < 7) { break; }
                else                                { System.out.println("Invalid input, please enter a number between 1-6."); }
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a number between 1-6.");
            }
        }

        boolean continueBettingFlag = true;
        while (continueBettingFlag)
        {
            switch ( userInput ) {
                case 1:
                    System.out.println("\tWould you like to bet Red or Black:\n1. Red\n2. Black");
                    try {
                        int userPickRedOrBlack = cin.nextInt();
                        if (userPickRedOrBlack == 1) {
                            bet_RedOrBlack = 1;
                            continueBettingFlag = setContinueBettingFlag(cin);
                        }
                        else if (userPickRedOrBlack == 2) {
                            bet_RedOrBlack = 0; 
                            continueBettingFlag = setContinueBettingFlag(cin); 
                        }
                        else { 
                            bet_RedOrBlack = 3; 
                            System.out.println("Invalid selection, no bet made."); 
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input, please select 1 or 2. No bet was made.");
                    }

            }
        }
    }

    private boolean setContinueBettingFlag(Scanner cin)
    {
        System.out.println("\t\tWould you like to make more bets?\n1. Yes\n2. No");
        try {
            int userSelection = cin.nextInt();
            if (userSelection == 1)        { return true;}
            else if (userSelection == 2)   { return false; }
            else                                { System.out.println("Invalid selection."); return setContinueBettingFlag(cin); }
        } catch (Exception e) {
            System.out.println("Invalid input, please select 1 or 2.");
            return setContinueBettingFlag(cin);
        }
    }
}
