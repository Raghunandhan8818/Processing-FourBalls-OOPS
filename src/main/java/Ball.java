import processing.core.PApplet;

public class Ball {

    private int height;
    private int speed;
    private int position = 0;
    private final int diameter = 10;


    public Ball(int height, int speed) {
        this.height = height;
        this.speed = speed;
    }


    public void start(PApplet pApplet) {
        pApplet.ellipse(position, height, diameter, diameter);
    }

    public void moveForward() {
        position = position + speed;
    }

}
