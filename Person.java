package clone.correctclone;

public class Person extends TipoClone {

    public static void main(String[] args) {
        TipoClone p = new TipoClone();
        p.setName("Ivan");
        p.setSername("Pidrov");
        p.setAge(7);
        
        TipoClone clone = p.getCopy();
        
        p.setAge(14);
        System.out.println(p);
        System.out.println(clone);
    }
}
