package clone.correctclone;

public class Dificult implements Cloneable {

    StringBuilder sb = new StringBuilder("JV");
    int p = 8;

    @Override
    public Dificult clone() throws CloneNotSupportedException {
        Dificult clone = (Dificult) super.clone();
        clone.sb = new StringBuilder(sb);
        return clone;
    }

    @Override
    public String toString() {
        return "Dificult{" + "sb=" + sb + ", p=" + p + '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Dificult dif = new Dificult();
        Dificult clone = dif.clone();
        dif.sb = dif.sb.append(new StringBuilder("10"));
        System.out.println(clone);
    }
}
