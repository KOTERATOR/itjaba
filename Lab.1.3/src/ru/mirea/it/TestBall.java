package ru.mirea.it;

public class TestBall {
    public static void test() {
        Ball ball1 = new Ball(10.0f, "red", Ball.BallType.Football);
        System.out.println(ball1);

        Ball ball2 = new Ball(5.0f, "magenta");
        System.out.println(ball2);

        Ball ball3 = new Ball(Ball.BallType.Baseball);
        System.out.println(ball3);
        ball3.setColor("black");
        ball3.setRadius(100.0f);
        ball3.setType(Ball.BallType.Unknown);

        System.out.printf("Updated ball: radius=%f, color=\"%s\", type=%s%n", ball3.getRadius(), ball3.getColor(), ball3.getType());
        System.out.println(ball3);
    }
}
