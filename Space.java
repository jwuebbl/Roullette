
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

    // Building a constructor that just takes in the number
    // to decide the different fields.
    //      This will mean the logic is only done 1 term per tile built.
    //      Which it already is in the Wheel class, but having it here centralizes
    //      all of the attribute of the Space class.
    public Space(int spaceNumber) {
        // Assigns the number attribute for checking against individual spaces.
        this.number = spaceNumber;
        // Setting the redBlk flag.
        if (spaceNumber < 11)
        {   
            if ((spaceNumber%2) == 0) {redBlk = "Black";} else {redBlk = "Red";}
        }
        else if (spaceNumber > 10 && spaceNumber < 19)
        {
            if ((spaceNumber%2) == 0) {redBlk = "Red";} else {redBlk = "Black";}
        }
        else if (spaceNumber > 18 && spaceNumber < 29)
        {
            if ((spaceNumber%2) == 0) {redBlk = "Black";} else {redBlk = "Red";}
        }
        else
        {
            if ((spaceNumber%2) == 0) {redBlk = "Red";} else {redBlk = "Black";}
        }

        // Setting the row flag.
        if ((spaceNumber%3) == 1) {this.row = "Row One";}
        else if ((spaceNumber%3) == 2) {this.row = "Row Two";}
        else {this.row = "Row Three";}
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

    public int getNumber() {
        return number;
    }
    
    public String toString() {
        return redBlk + " " + number;
    }
}
