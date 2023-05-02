public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Boris", "Johnson");
        Student student2 = new Student(2, "Joseph", "Biden");
        Student student3 = new Student(3, "Michael", "Podoliak");

        GroupStudent group = new GroupStudent(student1);

        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);

        System.out.println("Students:");
        for (Student student : group.getStudents()) {
            System.out.println("№: " + student.getId() +
            System.lineSeparator() + "First Name: " + student.getFirstName() +
            System.lineSeparator() + "Last Name: " + student.getLastName());
        }

        Student newLeader = new Student(4, "Kim", "Chen");

        group.changeLeader(newLeader);
        System.out.println("Starosta: ");
        System.out.println("№: " + newLeader.getId() +
                System.lineSeparator() + "First Name: " + newLeader.getFirstName() +
                System.lineSeparator() + "Last Name: "+ newLeader.getLastName());
    }
}
