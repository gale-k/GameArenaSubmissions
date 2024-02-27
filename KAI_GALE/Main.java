public class Main {
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(500, 400);
        //Ball b = new Ball(250, 150, 20, "GREEN");
        //arena.addBall(b);

        Goodie test = new Goodie(225, 160, arena, 10);
        
        while(true)
        {
            arena.pause();
        }
    }
}