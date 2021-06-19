package Roullette;

public class Space {
    private int number;
    private String redBlk;     
    private String oddEven;
    private String row;
    private String third;


    public Space(int spaceNumber) {
        // Setting the space's number attribute.
        this.number = spaceNumber;

        // Setting the redBlk String.
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

        if ( (spaceNumber % 2) == 1  ) {
            oddEven = "Odd";
        }
        else {
            oddEven =  "Even";
        }

        // Setting the third String.
        int whichThird = ( spaceNumber - 1 ) / 12;
        if ( whichThird == 0 ) {
            this.third =  "First Third";
        }
        else if ( whichThird == 1) {
            this.third =  "Second Third";
        }
        else {
            this.third = "Third Third";
        }

        // Setting the row String.
        if ((spaceNumber%3) == 1) {this.row = "Row One";}
        else if ((spaceNumber%3) == 2) {this.row = "Row Two";}
        else {this.row = "Row Three";}

        // Setting the Green Spaces.
        if ( spaceNumber > 36 || spaceNumber < 1 ) {
            redBlk = "Green";
        }
    }

    // Getters
    public String getRow()
    {
        return row;
    }

    public String getThird()
    {
        return third;
    }

    public String getOddOrEven() {
        return oddEven;
    }

    public String getColor() {
        return redBlk;
    }

    public int getNumber() {
        return number;
    }
    

    // toString
    public String toString() {
        return redBlk + " " + number;
    }
}
