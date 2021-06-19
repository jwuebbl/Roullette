import java.util.Random;


public class Wheel {
    Space [] spaces = new Space[38]; // 38 spaces including 0 and 00.

    Wheel()
    {
        for (int i = 0; i < spaces.length; i++)
        {
            Space newSpace = new Space(i);
            spaces[i] = newSpace;
        }
    }

    public Space spin()
    {
        Random rand = new Random(); // No argument constructor pulls the current time for Random().
        int temp = rand.nextInt(39);
        return spaces[temp];
    }

    public void printWheel() {
        for (int i = 0; i < spaces.length; i++ ) {
            System.out.println(spaces[i].toString());
        }
    }
}
