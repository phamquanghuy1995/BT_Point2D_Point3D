package com.huy;

public class Main {

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D=new Point2D(3,3);
        System.out.println(point2D);
        point2D.setX(20);
        System.out.println(point2D);
        // kiem thu poin 3d;
        Point3D point3D=new Point3D();
        System.out.println(point3D);
        point3D=new Point3D(1,2,4);
        System.out.println(point3D);
        point3D.setZ(100);
        System.out.println(point3D);
        float[] xyz=point3D.getXYZ();
        for (float element:xyz){
            System.out.println(element);
        }
    }
}
