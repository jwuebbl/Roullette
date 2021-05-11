public class Player {
    private String name;
    private int chips;
    private Space bet;

    Player(String name, int startingChips)
    {
        this.name = name;
        chips = startingChips;
    }

    public void placeBet(Space bet)
    {
        this.bet = bet;
    }

    public Space getBet()
    {
        return this.bet;
    }

    
}
