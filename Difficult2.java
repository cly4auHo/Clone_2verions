package clone.correctclone;

public class Difficult2 implements Cloneable {

    private Simple s1;
    private Simple s2;
    private int a = 1;

    public Difficult2(Simple s1, Simple s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public Difficult2 clone() throws CloneNotSupportedException {
        Difficult2 clone = (Difficult2) super.clone();
        Simple simpleclone1 = s1.clone();
        Simple simpleclone2 = s2.clone();

        clone.s1 = simpleclone1;
        clone.s2 = simpleclone2;
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Simple s1 = new Simple(5, 7.7, false);
        Simple s2 = new Simple(6, 8.0, true);

        Difficult2 dif2 = new Difficult2(s1, s2);
        Difficult2 clone = dif2.clone();
        System.out.println(dif2);
        System.out.println(clone);
    }

    @Override
    public String toString() {
        return "Difficult2{" + "s1=" + s1 + ", s2=" + s2 + ", a=" + a + '}';
    }

    public Simple getS2() {
        return s2;
    }

    public void setS2(Simple s2) {
        this.s2 = s2;
    }

    public Simple getS1() {
        return s1;
    }

    public void setS1(Simple s1) {
        this.s1 = s1;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
