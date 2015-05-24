package pee.actionbar.app;

/**
 * Created by pvu_asus on 23/05/2015.
 */
public class Employee {

    private String name;
    private String index;
    private int id;
    private String department;
    private String type;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("id: "+ id);
        out.append(", index: "+ index);
        out.append(", name: "+ name);
        out.append(", department: "+ department);
        out.append(", type: "+ type);
        out.append(", email: "+ email);
        return out.toString();
    }
}