public class Goodie {
    private Rectangle[] rectangles;
    //private Rectangle hitbox;

    // public Rectangle getHitbox() {
    //     return hitbox;
    // }
    
    public void render(GameArena arena) {
        for (int i = 0; i < rectangles.length; i++) {
            arena.addRectangle(rectangles[i]);
        }
        //arena.addRectangle(hitbox);
    }

    public void remove(GameArena arena) {
        for (int i = 0; i < rectangles.length; i++) {
            arena.removeRectangle(rectangles[i]);
        }
        //arena.removeRectangle(hitbox);
    }
    public Goodie(double x, double y, GameArena arena, int size) {
        rectangles = new Rectangle[7]; 
        rectangles[0] = new Rectangle(x, y, size, size, "WHITE");
        rectangles[1] = new Rectangle(x+size*2, y, size, size, "WHITE");
        rectangles[2] = new Rectangle(x-size, y+size*2, size, size, "WHITE");
        rectangles[3] = new Rectangle(x, y+size*3, size, size, "WHITE");
        rectangles[4] = new Rectangle(x+size, y+size*3, size, size, "WHITE");
        rectangles[5] = new Rectangle(x+size*2, y+size*3, size, size, "WHITE");
        rectangles[6] = new Rectangle(x+size*3, y+size*2, size, size, "WHITE");

        //hitbox = new Rectangle(x, y, size * 21, size * 20, "BLACK", -10);

        render(arena);
    }
}