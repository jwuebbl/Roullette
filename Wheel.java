public class Wheel {
    Space [] wheel = new Space[38]; // 38 spaces including 0 and 00.

    Wheel()
    {
        int redBlk;
        int oddEven;
        int block;
        int row;

        // Creates all the spaces that are not green.
        for (int i = 1; i <= wheel.length - 2; i++)
        {
            // Setting the redBlk flag.
            if (i < 11)
            {   
                if ((i%2) == 0) {redBlk = 0;} else {redBlk = 1;}
            }
            else if (i > 10 && i < 19)
            {
                if ((i%2) == 0) {redBlk = 1;} else {redBlk = 0;}
            }
            else if (i > 18 && i < 29)
            {
                if ((i%2) == 0) {redBlk = 0;} else {redBlk = 1;}
            }
            else
            {
                if ((i%2) == 0) {redBlk = 1;} else {redBlk = 0;}
            }

            // Setting the oddEven flag.
            if ((i%2) == 0) {oddEven = 0;} else {oddEven = 1;}

            // Setting the block flag.
            if (i < 13) {block = 1;}
            else if (i > 12 && i < 25) {block = 2;}
            else {block = 3;}

            // Setting the row flag.
            if ((i%3) == 1) {row = 1;}
            else if ((i%3) == 2) {row = 2;}
            else {row = 3;}

            Space newSpace = new Space(i, redBlk, oddEven, block, row);
            wheel[i-1] = newSpace;
        }

        // Last 2 are the greenNumbers 0 and 00
        wheel[36] = new Space(37, 0, 0, 0, 0);
        wheel[37] = new Space(38, 0, 0, 0, 0);

        System.out.println("Wheel Successfully Created.");
    }
}
