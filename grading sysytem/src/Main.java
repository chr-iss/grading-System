
public class Main{
    public  void Main(String[] args) {
        String[] subjects = {"Math", "Science", "History", "English"};
        GradebookSystem gradebook = new GradebookSystem(subjects, 10);

        Student alice = new Student("Alice Johnson", 1001, subjects.length);
        alice.setGrade(0, 95.5);
        alice.setGrade(1, 88.0);
        alice.setGrade(2, 92.5);
        alice.setGrade(3, 90.0);

        Student bob = new Student("Bob Smith", 1002, subjects.length);
        bob.setGrade(0, 85.0);
        bob.setGrade(1, 82.5);
        bob.setGrade(2, 78.0);
        bob.setGrade(3, 88.5);

        gradebook.addStudent(alice);
        gradebook.addStudent(bob);

        gradebook.displayAllReports();
    }
}