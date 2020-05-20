package com.company;


public class Main {

    public static void main(String[] args) {
        Point p1 = new Point (1,0);
        Point p2 = new Point (0,1);
        Point p3 = new Point (-1,0);
        Point.distance(p1,p2);
        Point.distance(p2,p3);
        Point.distance(p1,p3);
        System.out.println(Point.distance(p1,p2));
        System.out.println(Point.distance(p1,p3));
        System.out.println(Point.distance(p2,p3));
        Point.findSquare(p1, p2, p3);
        System.out.println(Point.findSquare(p1,p2,p3));
        Vector v1 = new Vector(1,1);
        Vector.show(1,1);
        distancePointVector(p1,p2,p3,v1);
    }

    public static void distancePointVector(Point p1, Point p2, Point p3, Vector v1) {
        System.out.println("(" + (p1.x - v1.a) + "," + (p1.y - v1.b)+"," + "(" + (p2.x - v1.a) +"," + (p2.y - v1.b)+")" +
                "," + "(" + (p3.x - v1.a) +"," + (p3.y - v1.b)+")");
    }

}













