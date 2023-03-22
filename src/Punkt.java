public class Punkt {
    double x;
    double y;
    double z;

    public Punkt(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double berechneAbstand(){
        return Math.sqrt(x*x+y*y+z*z);
    }


    @Override
    public String toString(){
        return "a="+ x + ",b=" + y + ",c=" + z;
    }





    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
