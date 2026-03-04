
package pos2.model;

public class StudentModel {
    private int id;
    private String name;
    private String subject;
    private String email;
    private int cell;

    public StudentModel() {
    }

    public StudentModel(int id, String name, String subject, String email, int cell) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.email = email;
        this.cell = cell;
    }

    public StudentModel(String name, String subject, String email, int cell) {
        this.name = name;
        this.subject = subject;
        this.email = email;
        this.cell = cell;
    }

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }
    

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", subject=" + subject + ", email=" + email + ", cell=" + cell + '}';
    }
    
    
}
