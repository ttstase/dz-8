import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupStudent {
    private Student leader;
    private List<Student> students = new ArrayList<>();
    private Map<String, Boolean> tasks = new HashMap<>();

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





