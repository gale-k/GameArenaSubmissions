public class Program {
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(750, 500);

        //GOODIE:
        
        // Goodie character = new Goodie();
        // arena.addGoodie(character);
        
        Ball Head = new Ball(250, 150, 50, "WHITE");
        Rectangle Body = new Rectangle(230,173,40,100,"WHITE");
        Line RArm = new Line(271,190,296,260,5,"WHITE",1);
        Line LArm = new Line(230,190,205,260,5,"WHITE",1);
        Line RLeg = new Line(259,275,266,345,5,"WHITE",1);
        Line LLeg = new Line(242,275,235,345,5,"WHITE",1);
            
        arena.addBall(Head);
        arena.addRectangle(Body);
        arena.addLine(RArm);
        arena.addLine(LArm);
        arena.addLine(RLeg);
        arena.addLine(LLeg);

        while(true)
        {
            arena.pause();
        }
    }
}