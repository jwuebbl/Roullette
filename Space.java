public class Space {
    private int number;
    private String redBlk;     // 1 = red, 0 = black.
    private String oddEven;    // 1 = odd, 0 = even.
    private String block;      // 1-12 = 1, 13-24 = 2, 25 - 36 = 3
    private String row;        // 1, 2 , 3.

    public Space(int number, String redBlk, String oddEven, String block, String row)
    {
        // Based on the number assign all the other values.
        this.number     = number;
        this.redBlk     = redBlk;
        this.oddEven    = oddEven;
        this.block      = block;
        this.row        = row;
    }

    public int getNumber()
    {
        return number;
    }

    public String getColor() {
        return redBlk;
    }
    
    public String toString() {
        return redBlk + " " + number;
    }
}
