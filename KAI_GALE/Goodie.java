public class Goodie {
    private double xPosition;
    private double yPosition;
    
    private Ball Head = new Ball(250, 150, 50, "WHITE");
    private Rectangle Body = new Rectangle(230,173,40,100,"WHITE");
    private Line RArm = new Line(271,190,296,260,5,"WHITE",1);
    private Line LArm = new Line(230,190,205,260,5,"WHITE",1);
    private Line RLeg = new Line(259,275,266,345,5,"WHITE",1);
    private Line LLeg = new Line(242,275,235,345,5,"WHITE",1);

    public Goodie(double x, double y, double w, double h, String col) {
        this.xPosition = x;
		this.yPosition = y;
		//this.width = w;
		//this.height = h;
		this.colour = col;
		this.layer = 0;

        // Ball Head = new Ball(250, 150, 50, "WHITE");
        // Rectangle Body = new Rectangle(230,173,40,100,"WHITE");
        // Line RArm = new Line(271,190,296,260,5,"WHITE",1);
        // Line LArm = new Line(230,190,205,260,5,"WHITE",1);
        // Line RLeg = new Line(259,275,266,345,5,"WHITE",1);
        // Line LLeg = new Line(242,275,235,345,5,"WHITE",1);
            
        // arena.addBall(Head);
        // arena.addRectangle(Body);
        // arena.addLine(RArm);
        // arena.addLine(LArm);
        // arena.addLine(RLeg);
        // arena.addLine(LLeg);
    }

    public int getLayer()
	{
		return 1;
	}
}