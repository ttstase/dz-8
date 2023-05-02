import java.util.ArrayList;
import java.util.List;

public class GroupStudent {
    private Student leader;
    private List<Student> students = new ArrayList<>();

    public GroupStudent(Student leader) {
        this.leader = leader;
    }
    public Student getLeader() {
        return leader;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
    public void renameStudent(Student student, String firstName, String lastName) {
        student.setFirstName(firstName);
        student.setLastName(lastName);
    }

    public void changeLeader(Student changeLeader) {
    }
}





