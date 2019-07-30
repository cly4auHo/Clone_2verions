package clone.correctclone;

public class TipoClone {

    private String name;
    private int age;
    private String sername;

    public TipoClone getCopy() {
        TipoClone copy = new TipoClone();
        copy.setName(new String(name));
        copy.setSername(new String(sername));
        copy.setAge(age);
        return copy;
    }

    @Override
    public String toString() {
        return "TipoClone{" + "name=" + name + ", age=" + age + ", sername=" + sername + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

}
