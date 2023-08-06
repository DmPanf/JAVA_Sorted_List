import java.util.Arrays;

public class Main2 {

    static class Student implements Comparable<Student> {
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

        @Override
        public int compareTo(Student other) {
            return Double.compare(this.grade, other.grade);
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', grade=" + grade + "}";
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("John", 86.0),
                new Student("Jane", 92.5),
                new Student("Bill", 76.7),
                new Student("Emma", 93.5),
                new Student("Adam", 95.0)
        };

        Arrays.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
