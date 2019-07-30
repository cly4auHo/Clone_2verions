package clone.correctclone;

public class TestApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        Simple simple = new Simple(100, 5.5, false);
        Simple clone = simple.clone();

        clone.setBool(true);
        simple.setA(50);
        System.out.println(clone);
        System.out.println(simple);
    }
}
