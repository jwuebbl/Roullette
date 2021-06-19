import java.util.Random;


public class Wheel {
    Space [] spaces = new Space[38]; // 38 spaces including 0 and 00.

    Wheel()
    {
        String redBlk;
        String row;

        // Creates all the spaces that are not green.
        for (int i = 1; i <= spaces.length - 2; i++)
        {


            // // Setting the row flag.
            // if ((i%3) == 1) {row = "Row One";}
            // else if ((i%3) == 2) {row = "Row Two";}
            // else {row = "Row Three";}

            Space newSpace = new Space(i);
            spaces[i-1] = newSpace;
        }

        // Last 2 are the greenNumbers 0 and 00
        spaces[36] = new Space(37, "Green", "Green");
        spaces[37] = new Space(37, "Green", "Green");

        System.out.println("Wheel Successfully Created.");
    }

    public Space spin()
    {
        Random rand = new Random(); // No argument constructor pulls the current time for Random().
        int temp = rand.nextInt(39);
        return spaces[temp];
    }
}
