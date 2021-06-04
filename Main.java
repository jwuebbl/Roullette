public class Main{
    public static void main(String Args[])
    {
        Wheel wheel = new Wheel();
        Player player = new Player();


        // Game Here
        System.out.println("Player has " + player.getChips() + " chips.");
        player.placeBets();
        System.out.println("Player has " + player.getChips() + " chips.");


        Space winningSpace = wheel.spin();
        player.checkBets( winningSpace );
        System.out.println("Player has " + player.getChips() + " chips.");


    }
}