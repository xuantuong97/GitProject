package module_2.inheritance.inheritance_bai_2;

public class Point3D extends Point2D{
    private float z = 0.0f;

    Point3D (){};

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arrXYZ = {this.getX(), this.getY(), z};
        return arrXYZ;
    }

    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "; " + this.getY() + "; " + z + ")";
    }
}
