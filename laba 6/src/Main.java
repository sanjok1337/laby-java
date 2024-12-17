import java.util.*;

class Student {
    private String name;
    private String surname;
    private int age;
    private int course;
    private double averageMark;

    public Student(String name, String surname, int age, int course, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", averageMark=" + averageMark +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // ArrayList реалізація
        System.out.println("--- ArrayList реалізація ---");
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", 20, 2, 88.5));
        studentList.add(new Student("Jane", "Smith", 21, 3, 91.2));
        studentList.add(new Student("Alice", "Johnson", 19, 1, 75.8));

        System.out.println("Список студентів:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // LinkedList реалізація
        System.out.println("\n--- LinkedList реалізація ---");
        LinkedList<Student> studentLinkedList = new LinkedList<>(studentList);
        studentLinkedList.addFirst(new Student("Bob", "Brown", 22, 4, 85.6));
        studentLinkedList.addLast(new Student("Chris", "Green", 23, 5, 78.3));

        System.out.println("Список студентів (з LinkedList):");
        for (Student student : studentLinkedList) {
            System.out.println(student);
        }

        System.out.println("\nВидалення першого та останнього студента з LinkedList");
        studentLinkedList.removeFirst();
        studentLinkedList.removeLast();
        for (Student student : studentLinkedList) {
            System.out.println(student);
        }

        // HashMap реалізація
        System.out.println("\n--- HashMap реалізація ---");
        HashMap<String, Student> studentMap = new HashMap<>();
        for (Student student : studentList) {
            studentMap.put(student.getSurname(), student);
        }

        System.out.println("Пошук студента за прізвищем 'Smith':");
        Student foundStudent = studentMap.get("Smith");
        if (foundStudent != null) {
            System.out.println(foundStudent);
        } else {
            System.out.println("Студента з таким прізвищем не знайдено.");
        }

        System.out.println("\nСписок студентів у HashMap:");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("Прізвище: " + entry.getKey() + ", Студент: " + entry.getValue());
        }
    }
}
