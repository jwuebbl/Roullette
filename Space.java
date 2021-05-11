public class Space {
    private int number;
    private int redBlk;     // 1 = red, 0 = black.
    private int oddEven;    // 1 = odd, 0 = even.
    private int block;      // 1-12 = 1, 13-24 = 2, 25 - 36 = 3
    private int row;        // 

    public Space(int number, int redBlk, int oddEven, int block, int row)
    {
        // Based on the number assign all the other values.
        this.number     = number;
        this.redBlk     = redBlk;
        this.oddEven    = oddEven;
        this.block      = block;
        this.row        = row;
    }
    
}
