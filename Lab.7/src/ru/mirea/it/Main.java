package ru.mirea.it;

public class Main {

    public static void main(String[] args) {
	    MovablePoint p1 = new MovablePoint(1, 1, 1, 1);
        System.out.println(p1);

        p1.moveUp();
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveLeft();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);

        MovableCircle c1 = new MovableCircle(p1.x, p1.y, p1.xSpeed, p1.ySpeed, 10);
        System.out.println(c1);

        c1.moveUp();
        System.out.println(c1);
        Movable c2 = c1.copy();
        c1.moveDown();
        System.out.println(c1);
        c1.moveLeft();
        System.out.println(c1);
        c1.moveRight();
        System.out.println(c1);

        System.out.println(c2);
    }
}
