package module_2.inheritance_bai_3;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    MoveablePoint(){};

    MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    };

    MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] speed = {xSpeed, ySpeed};
        return speed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + this.getX() +", " + this.getY() + "),speed = (" + xSpeed +", " + ySpeed +")";
    }

    public MoveablePoint move(){
        float x = this.getX() + this.xSpeed;
        float y = this.getY() + this.ySpeed;
        this.setX(x);
        this.setY(y);
        return this;
    }
}
