package com.company;

public class Point {
    double x;
    double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
    }

    public static double findSquare(Point p1, Point p2, Point p3) {
        double p = distance(p1, p2) * 0.5 + distance(p2, p3) * 0.5 + distance(p1, p3) * 0.5;
        System.out.println(p);
        Math.sqrt((p * (p - distance(p1, p2)) * (p - distance(p1, p3)) * (p - distance(p3, p2))));
        return  Math.sqrt((p*(p- Point.distance(p1,p2))*(p- Point.distance(p1,p3))*(p- Point.distance(p3,p2))));

    }


}