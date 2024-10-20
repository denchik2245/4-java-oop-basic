package com.example.task01;


public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    public double distance(Point point){
        double d = Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
        return d;
    }

    public String toString() {
        String result = String.format("(%d, %d)", this.x, this.y);
        return result;
    }
}