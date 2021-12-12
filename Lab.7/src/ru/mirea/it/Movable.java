package ru.mirea.it;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();

    Movable copy();
}
