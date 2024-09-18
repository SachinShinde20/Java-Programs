public class Emp implements Cloneable {
    int id;
    String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }

    // Default implementation of HashSet relies on the hashCode() and equals()
    // methods to determine if an object is a duplicate.
    /*
     * These methods must be Overriden
     * hashCode(): Returns a hash code value for the object. The default
     * implementation in the Object class is derived from the memory address of the
     * object.
     * equals(Object o): Compares the memory addresses of two objects, and returns
     * true only if the references are the same (not their content).
     */

    /*
     * hashCode(): This method generates a hash code based on the id and name. It
     * ensures that two Emp objects with the same id and name will have the same
     * hash code.
     * equals(): This method compares the id and name fields of two Emp objects. If
     * they are equal, the method returns true, indicating that the objects are the
     * same in terms of content.
     */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Emp other = (Emp) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
