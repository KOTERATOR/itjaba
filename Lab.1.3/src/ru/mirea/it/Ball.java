package ru.mirea.it;

public class Ball {
    enum BallType {
        Unknown,
        Football,
        Tennis,
        Baseball
    }

    private float radius;
    private String color;
    private BallType type;


    public Ball(BallType type) {
        switch (type) {
            case Football -> {
                radius = 25.0f;
                color = "black and white";
            }
            case Tennis -> {
                radius = 6.0f;
                color = "green";
            }
            case Baseball -> {
                radius = 6.5f;
                color = "white";
            }
            case Unknown -> {
                radius = 0.0f;
                color = "undefined";
            }
        }
        this.type = type;
    }

    public Ball(float radius, String color) {
        this(radius, color, BallType.Unknown);
    }

    public Ball(float radius, String color, BallType type) {
        this.radius = radius;
        this.color = color;
        this.type = type;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BallType getType() {
        return type;
    }

    public void setType(BallType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Ball { radius: %f, color: \"%s\", type: %s }", radius, color, type);
    }
}
