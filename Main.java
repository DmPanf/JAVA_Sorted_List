import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static class Student {
        private String name;
        private double grade;

        public Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public double getGrade() {
            return grade;
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("John", 86.0));
        students.add(new Student("Jane", 92.5));
        students.add(new Student("Bill", 76.7));
        students.add(new Student("Emma", 93.5));
        students.add(new Student("Adam", 95.0));

        List<Student> sortedStudents = students.stream()
                .filter(s -> s.getGrade() > 85.0)
                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .collect(Collectors.toList());

        sortedStudents.forEach(s -> System.out.println(s.getName() + " : " + s.getGrade()));
    }
}
