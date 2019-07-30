package clone.correctclone;

public class Son extends Batya implements Cloneable {

    private Simple s2 = new Simple(9, 9.9, false);
    private double d = 1.12;

    @Override
    public String toString() {
        return super.toString() + "Arthas{" + "s2=" + s2 + ", d=" + d + '}';
    }

    @Override
    public Son clone() throws CloneNotSupportedException {
        Son clone = (Son) super.clone();
        Simple simpleclone = s2.clone();
        clone.s2 = simpleclone;
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Son evil = new Son();
        evil.setSb(new StringBuilder("Jopa"));
        evil.setS1(new Simple(6, 7.6, false));

        Son clone = evil.clone();
        System.out.println(clone);
        System.out.println(evil);
        evil.d = 6; // ничего не поменяет
    }

    public Simple getS2() {
        return s2;
    }

    public void setS2(Simple s2) {
        this.s2 = s2;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

}
