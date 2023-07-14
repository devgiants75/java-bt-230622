package Chapter07.B_List;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private int grade;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", grade=" + grade +
            '}';
    }
}

public class Z_Practice02_Code {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 85));
        students.add(new Student(2, "Bob", 90));
        students.add(new Student(3, "Charlie", 80));

        printStudents(students);

        updateGrade(students, 1, 95);
        
        printHighGradeStudents(students, 85);
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void updateGrade(List<Student> students, int id, int newGrade) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setGrade(newGrade);
                System.out.println("Updated: " + student);
                return;
            }
        }
        System.out.println("Student with id " + id + " not found.");
    }

    public static void printHighGradeStudents(List<Student> students, int minGrade) {
        for (Student student : students) {
            if (student.getGrade() >= minGrade) {
                System.out.println(student);
            }
        }
    }
}
