
public class Space {
    private int number;
    private String redBlk;     
    private String oddEven;
    private String row;
    private String third;

    
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

        if ( (spaceNumber % 2) == 1  ) {
            oddEven = "Odd";
        }
        else {
            oddEven =  "Even";
        }

        // Setting the Third flag.
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

        // Setting the row flag.
        if ((spaceNumber%3) == 1) {this.row = "Row One";}
        else if ((spaceNumber%3) == 2) {this.row = "Row Two";}
        else {this.row = "Row Three";}

        if ( spaceNumber > 36 ) {
            redBlk = "Green";
        }
    }

    public String getRow()
    {

        // The rows are the remainder of the space number divided by 3.
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
    
    public String toString() {
        return redBlk + " " + number;
    }
}
