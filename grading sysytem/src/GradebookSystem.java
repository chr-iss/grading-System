
public class GradebookSystem {
    private Student[] students;
    private String[] subjects;
    private int studentCount;

    public GradebookSystem(String[] subjects, int capacity) {
        this.subjects = subjects;
        students = new Student[capacity];
        studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        }
    }

    public void displayAllReports() {
        for (int i = 0; i < studentCount; i++) {
            students[i].displayReport(subjects);
        }
    }