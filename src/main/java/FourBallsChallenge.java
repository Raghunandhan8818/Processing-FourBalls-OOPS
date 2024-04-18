import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {
    private static final int HEIGHT = 500;
    private static final int WIDTH = 800;
    private static final int NO_OF_BALLS = 4;
    Ball[] balls = new Ball[NO_OF_BALLS];

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int i = 0; i < NO_OF_BALLS; i++) {
            Ball ball = new Ball((i + 1) * (HEIGHT / 5), i + 1);
            balls[i] = ball;
        }
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            ball.start(this);
            ball.moveForward();
        }
    }

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge", args);

    }

}
