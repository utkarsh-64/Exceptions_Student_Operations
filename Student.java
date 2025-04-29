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
}
