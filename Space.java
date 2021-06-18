
public class Space {
    private int number;
    private String redBlk;     // "Red or Black"
    private String row;

    public Space(int number, String redBlk, String row)
    {
        // Based on the number assign all the other values.
        this.number     = number;
        this.redBlk     = redBlk;
        this.row        = row;
    }

        public int getNumber()
    {
        return number;
    }


    public String getRow()
    {

        // The rows are the remainder of the space number divided by 3.
        return row;
        
    }
    public String getThird()
    {
        // Take the difference of the numbers 1-12 subtracted by 1 and divide by 12 to all ways get the product of 0. 
        // Take the difference of the numbers 13-24 subtracted by 1 and divide by 12 to all ways get the product of 1. 
        // Take the difference of the numbers 25-36 subtracted by 1 and divide by 12 to all ways get the product of 2. 
        int whichThird = ( number - 1 ) / 12;
        
        // TODO: Put validation input in when the user bets
        // so you know for sure that they picked a valid number
        // or this method may not work correctly.
        if ( whichThird == 0 ) {
            return "First Third";
        }
        else if ( whichThird == 1) {
            return "Second Third";
        }
        else {
            return "Third Third";
        }

    }

    public String getOddOrEven() {
        if ( (number % 2) == 1  ) {
            return "Odd";
        }
        else {
            return "Even";
        }
    }

    public String getColor() {
        return redBlk;
    }
    
    public String toString() {
        return redBlk + " " + number;
    }
}
