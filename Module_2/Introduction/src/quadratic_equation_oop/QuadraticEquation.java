package quadratic_equation_oop;

public class QuadraticEquation {
    private double aArgument;
    private double bArgument;
    private double cArgument;

    public QuadraticEquation(double aArgument, double bArgument, double cArgument) {
        this.aArgument = aArgument;
        this.bArgument = bArgument;
        this.cArgument = cArgument;
    }

    public double getA() {
        return aArgument;
    }

    public void setA(float aArgument) {
        this.aArgument = aArgument;
    }

    public double getB() {
        return bArgument;
    }

    public void setB(float bArgument) {
        this.bArgument = bArgument;
    }

    public double getC() {
        return cArgument;
    }

    public void setC(float cArgument) {
        this.cArgument = cArgument;
    }
    public double  getDiscriminant() {
        return Math.pow(bArgument, 2) - 4*aArgument*cArgument;
    }

    public double getRoot1(){
        return ((-bArgument + Math.pow(this.getDiscriminant(),0.5))/(2*aArgument));
    }
    public double getRoot2(){
        return ((-bArgument - Math.pow(this.getDiscriminant(),0.5))/(2*aArgument));
    }

    public void getResult(){
        if (aArgument != 0){
            if (this.getDiscriminant() > 0){
                System.out.println("The equation has two roots " + this.getRoot1() + "and " + this.getRoot2());
            }
            else if(this.getDiscriminant() == 0){
                System.out.println("The equation has one root " + this.getRoot1());
            }
            else {
                System.out.println("The equation has no roots");
            }
        }
        else {
            if (bArgument == 0 && cArgument == 0){
                System.out.println("The equation has infinitely many roots");
            }
            else if (bArgument == 0){
                System.out.println("The equation has no roots");
            }
            else {
                System.out.println("The equation has one root " + (-cArgument)/bArgument);
            }
        }
    }
}
