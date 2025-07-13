class Student {
    private String name;
    private int id;
    private double[] grades;

    public Student(String name, int id, int numSubjects) {
        this.name = name;
        this.id = id;
        this.grades = new double[numSubjects];
    }

    public String getName() { return name; }
    public int getId() { return id; }

    public void setGrade(int subjectIndex, double grade) {
        if (subjectIndex >= 0 && subjectIndex < grades.length) {
            grades[subjectIndex] = grade;
        }
    }

    public double getGrade(int subjectIndex) {
        if (subjectIndex >= 0 && subjectIndex < grades.length) {
            return grades[subjectIndex];
        }
        return -1;
    }

    public double getAverage() {
        double sum = 0;
        for (double grade : grades) sum += grade;
        return sum / grades.length;
    }

    public void displayReport(String[] subjectNames) {
        System.out.printf("Student: %s (ID: %d)\n", name, id);
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("%s: %.1f\n", subjectNames[i], grades[i]);
        }
        System.out.printf("Average: %.1f\n\n", getAverage());
    }
}
