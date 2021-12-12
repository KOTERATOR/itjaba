package ru.mirea.it;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public Movable copy() {
        return new MovableCircle(center.x, center.y, center.xSpeed, center.ySpeed, radius);
    }

    @Override
    public String toString() {
        return String.format("MovableCircle -> center=(%s), radius=%d", center.toString(), radius);
    }
}
