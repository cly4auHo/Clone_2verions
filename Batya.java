package clone.correctclone;

public class Batya implements Cloneable {

    private Simple s1;
    private StringBuilder sb = new StringBuilder("Batya");
    private int b = 1;

    Batya() {

    }

    @Override
    public Batya clone() throws CloneNotSupportedException {
        Batya clone = (Batya) super.clone();
        Simple simpleclone = s1.clone();
        clone.setS1(simpleclone);
        clone.setSb(new StringBuilder(sb));
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Simple simple = new Simple(7, 7.7, true);
        Batya batya = new Batya(simple);
        Batya clone = batya.clone();
        System.out.println(clone);
        System.out.println(batya);
    }

    @Override
    public String toString() {
        return "Batya{" + "s1=" + s1 + ", sb=" + sb + ", b=" + b + '}';
    }

    public Batya(Simple s1) {
        this.s1 = s1;
    }

    public StringBuilder getSb() {
        return sb;
    }

    public void setSb(StringBuilder sb) {
        this.sb = sb;
    }

    public Simple getS1() {
        return s1;
    }

    public void setS1(Simple s1) {
        this.s1 = s1;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
