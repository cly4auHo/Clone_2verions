package clone.correctclone;

public class Simple implements Cloneable {

    private int a;
    private double d;
    private boolean bool;

    @Override
    public String toString() {
        return "Simple{" + "a=" + a + ", d=" + d + ", bool=" + bool + '}';
    }

    @Override
    public Simple clone() throws CloneNotSupportedException {
        return (Simple) super.clone();
    }

    public Simple(int a, double d, boolean bool) {
        this.a = a;
        this.d = d;
        this.bool = bool;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }
}
