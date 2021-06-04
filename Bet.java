public class Bet {
    String color = null;
    int    betAmount = 0;

    
    // For betting Red or Black
    Bet(String color, int amount){
        this.color = color;
        this.betAmount = amount;
    }





    public String toString() {
        return color + " Bet Amount: " + betAmount;
    }
}
