# The Example 1
```java
class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Rahim");
        emp.setSalary(50000);

        System.out.println(emp.getName() + " earns " + emp.getSalary());
    }
}
```
# The Example 2
```java
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
```
