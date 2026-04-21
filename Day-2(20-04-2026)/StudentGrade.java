class Student {
    private String studentId;
    private char grade;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            this.grade = grade;
        } else {
            System.out.println("Invalid Grade");
        }
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId("ICT-101");
        s1.setGrade('A');

        System.out.println("Student: " + s1.getStudentId());
        System.out.println("Grade: " + s1.getGrade());
    }
}
