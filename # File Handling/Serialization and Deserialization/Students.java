import java.io.Serializable;

enum Dept {
    CSE, CIVIL, ELECTRIC, MECH
}

public class Students implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private Dept department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(Dept department) {
        this.department = department;
    }

    public Dept getDept() {
        return department;
    }
}