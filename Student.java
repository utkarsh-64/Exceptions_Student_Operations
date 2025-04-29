// Student.java
import java.time.LocalDate;
public class Student {
    private String prn;
    private String name;
    private LocalDate dob;
    private double marks;
    public Student(String prn, String name, LocalDate dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    public String getPrn() { return prn; }
    public String getName() { return name; }
    public LocalDate getDob() { return dob; }
    public double getMarks() { return marks; }
    public void setName(String name) { this.name = name; }
    public void setDob(LocalDate dob) { this.dob = dob; }
    public void setMarks(double marks) { this.marks = marks; }
    @Override
    public String toString() {
        return "PRN: " + prn + ", Name: " + name + ", DOB: " + dob + ", Marks: " + marks;
    }
}
