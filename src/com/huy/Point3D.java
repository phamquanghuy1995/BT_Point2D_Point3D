package com.huy;

public class Point3D extends Point2D{
    private float z=0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        super.setX(x);
        super.setY(y);
        this.setZ(z);
    }
    public float[]getXYZ(){
        float[]xyz={super.getX(),super.getY(),getZ()};
        return xyz;
    }

    @Override
    public String toString() {
        return "(" + this.getXYZ()[0] + ","+ this.getXYZ()[1] + ","+ this.getXYZ()[2] +")";
    }
}
