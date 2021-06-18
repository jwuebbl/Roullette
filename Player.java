import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    // Used to read in the interactions with the player. 
    private Scanner cin = new Scanner(System.in);

    // Player's characteristics.
    private String name;
    private int chips;
    private List<Bet> bets = new ArrayList<Bet>();    


    // Constructors
    Player()                                {this.name = "Sim"; this.chips = 100;}
    Player(String name, int startingChips)  {this.name = name; chips = startingChips;}

    // Getters
    public int getChips() {
        return chips;
    }

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

    // Allows the player to make their bet(s) on red or black.
    private void betRedOrBlack()
    {   
        System.out.print("\t\t(B)lack or (R)ed: ");
        String color = cin.next();
        int betAmount;
        
        if ( color.matches("B(.*)") || color.matches("b(.*)") ) {
            System.out.print("\t\t\tHow much do you want to bet on Black?: ");
            betAmount = cin.nextInt();
            chips -= betAmount;
            bets.add(new Bet("Black", betAmount));
            
        }
        else if ( color.matches("R(.*)") || color.matches("r(.*)") ) {
            System.out.print("\t\t\tHow much do you want to bet on Red?: ");
            betAmount = cin.nextInt();
            chips -= betAmount;
            bets.add(new Bet("Red", betAmount));
        }
        else {
            System.out.print("\t\t\tInvalid Selection, Do you wish to bet on Red or Black? (Y/N): ");
            String continueBetting = cin.next();
            if ( continueBetting.matches("Y(.*)") || continueBetting.matches("y(.*)") ) {
                betRedOrBlack();
            }
        }
    }

    // Allows the player to make their bet(s) on odd or even.
    private void betOddOrEven() {
        System.out.print("\t\t(O)dd or (E)ven: ");
        String oddEven = cin.next();
        int betAmount;
        
        if ( oddEven.matches("O(.*)") || oddEven.matches("o(.*)") ) {
            System.out.print("\t\t\tHow much do you want to bet on Odds?: ");
            betAmount = cin.nextInt();
            chips -= betAmount;
            bets.add(new Bet("Odd", betAmount));
        }
        else if ( oddEven.matches("E(.*)") || oddEven.matches("e(.*)") ) {
            System.out.print("\t\t\tHow much do you want to bet on Evens?: ");
            betAmount = cin.nextInt();
            chips -= betAmount;
            bets.add(new Bet("Even", betAmount));
        }
        else {
            System.out.print("\t\t\tInvalid Selection, Do you wish to bet on Odd or Even? (Y/N): ");
            String continueBetting = cin.next();
            if ( continueBetting.matches("Y(.*)") || continueBetting.matches("y(.*)") ) {
                betOddOrEven();
            }
        }
    }

    private void betThirds() {
        System.out.print("\t\tWhich Thirds?: #1-12 (1), #12-24 (2), #24-36 (3): ");
        String thirdSelected = cin.next();
        int playerBetAmount;

        if ( thirdSelected.matches("1(.*)") ) {
            System.out.print("\t\t\tHow much do you want to bet on the first third? (1-12): ");
            playerBetAmount = cin.nextInt();
            chips -= playerBetAmount;
            bets.add(new Bet("First Third", playerBetAmount));
        }
        else if ( thirdSelected.matches("2(.*)") ) {
            System.out.print("\t\t\tHow much do you want to bet on the second third? (13-24): ");
            playerBetAmount = cin.nextInt();
            chips -= playerBetAmount;
            bets.add(new Bet("Second Third", playerBetAmount));
        }
        else if ( thirdSelected.matches("3(.*)") ) {
            System.out.print("\t\t\tHow much do you want to bet on the third third? (25-36): ");
            playerBetAmount = cin.nextInt();
            chips -= playerBetAmount;
            bets.add(new Bet("Third Third", playerBetAmount));
        }
        else {
            System.out.print("\t\t\tInvalid Selection, Do you wish to bet on Thirds? (Y/N): ");
            String continueBetting = cin.next();
            if ( continueBetting.matches("Y(.*)") || continueBetting.matches("y(.*)") ) {
                betThirds();
            }
        } 
    }

    private void betRows() {
        System.out.print("\t\tWhich Row? (1), (2), (3): ");
        String thirdSelected = cin.next();
        int playerBetAmount;

        if ( thirdSelected.matches("1(.*)") ) {
            System.out.print("\t\t\tHow much do you want to bet on the first row?: ");
            playerBetAmount = cin.nextInt();
            chips -= playerBetAmount;
            bets.add(new Bet("Row One", playerBetAmount));
        }
        else if ( thirdSelected.matches("2(.*)") ) {
            System.out.print("\t\t\tHow much do you want to bet on the second row?: ");
            playerBetAmount = cin.nextInt();
            chips -= playerBetAmount;
            bets.add(new Bet("Row Two", playerBetAmount));
        }
        else if ( thirdSelected.matches("3(.*)") ) {
            System.out.print("\t\t\tHow much do you want to bet on the third row?: ");
            playerBetAmount = cin.nextInt();
            chips -= playerBetAmount;
            bets.add(new Bet("Row Three", playerBetAmount));
        }
        else {
            System.out.print("\t\t\tInvalid Selection, Do you wish to bet on Thirds? (Y/N): ");
            String continueBetting = cin.next();
            if ( continueBetting.matches("Y(.*)") || continueBetting.matches("y(.*)") ) {
                betRows();
            }
        } 
    }

    private void betIndividualNumbers() {
        System.out.print("\t\tWhich Number? 1-36: ");
        int numberSelected = cin.nextInt();
        int playerBetAmount;
        
        if ( numberSelected < 1 || numberSelected > 36 ) {
            System.out.print("\t\t\tInvalid Selection, Do you wish to bet on individual numbers? (Y/N): ");
            String continueBetting = cin.next();
            if ( continueBetting.matches("Y(.*)") || continueBetting.matches("y(.*)") ) {
                betRows();
            }
        }
        else {
            System.out.print("\t\t\tHow much do you want to bet on " + numberSelected + "?: ");
            playerBetAmount = cin.nextInt();
            chips -= playerBetAmount;
            bets.add(new Bet(String.valueOf(numberSelected), playerBetAmount));
        }

    }


    // How the Player decides what he wants to bet on.
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

            // Player's bet selection.
            System.out.print("\tUser Selected: Option ");
            betSelection = cin.nextInt();

            // Player placing bets.
            switch (betSelection) {
                // Red or Black
                case 1:
                    betRedOrBlack();
                    continueBetting = setContinueBettingFlag();
                    break;
                
                // Odd or Even
                case 2:
                    betOddOrEven();
                    continueBetting = setContinueBettingFlag();
                    break;

                // Thirds
                case 3:
                    betThirds();
                    continueBetting = setContinueBettingFlag();
                    break;

                // Rows
                case 4:
                    betRows();
                    continueBetting = setContinueBettingFlag();
                    break;
                
                // Individual Numbers
                case 5:
                    betIndividualNumbers();
                    continueBetting = setContinueBettingFlag();
                    break;
            }            
        }
        cin.close();
    }




    // Loops through all the players bets and compares them to the winning space.
    public void checkBets(Space winningSpace) {
        System.out.println("The winning space is: " + winningSpace.toString());
        
        // Check Red or Black
        for (int i = 0; i < bets.size(); i++ ) { 
            if ( winningSpace.getColor().matches(bets.get(i).betType) ) {
                payoutColorBet(bets.get(i));
            }
        }

        // Check Odd or Even
        for (int i = 0; i <bets.size(); i++ ) {
            if (winningSpace.getOddOrEven().matches(bets.get(i).betType)) {
                payoutColorBet(bets.get(i));
            }
        }

        // Check Thirds
        for (int i = 0; i < bets.size(); i++ ) {
            if ( winningSpace.getThird().matches(bets.get(i).betType) ) {
                payoutThirdBet(bets.get(i));
            }
        }

        // Check Rows
        for (int i = 0; i < bets.size(); i++ ) {
            if ( winningSpace.getRow().matches(bets.get(i).betType) ) {
                payoutThirdBet(bets.get(i));
            }
        }

        // Check Numbers
        for (int i = 0; i < bets.size(); i++ ) {
            try { 
                int playerBetNumber = Integer.parseInt(bets.get(i).betType);
                if ( winningSpace.getNumber() == playerBetNumber ) {
                    payoutNumberBet(bets.get(i));
                }
            } catch ( Exception e) {}
        }
    }

    // Just prints all the Player's bets.
    public void printBets() {
        for (int i = 0; i < bets.size(); i++) {
            System.out.println(bets.get(i).toString());
        }
    }

    // Payout for winning a Red or Black bet.
    // Payout for winning Odd or Even bet.
    public void payoutColorBet(Bet bet) {
        chips += (2 * bet.betAmount);
    }

    // Payout for winning a Third bet.
    // Payout for winning a Row bet.
    public void payoutThirdBet(Bet bet) {
        chips += (3 * bet.betAmount);
    }

    public void payoutNumberBet(Bet bet) {
        chips += (bet.betAmount * 36);
    }
}

