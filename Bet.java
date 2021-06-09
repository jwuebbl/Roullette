public class Bet {
    String betType;
    int    betAmount = 0;

    
    // For betting Red/Black or Odd
    Bet(String betType, int amount){
        this.betType = betType;
        this.betAmount = amount;
    }





    public String toString() {
        return betType + " Bet Amount: " + betAmount;
    }
}
