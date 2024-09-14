public class Details {
    int id;
    String name;

    public Details(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + id + ", " + name + "]";
    }

}