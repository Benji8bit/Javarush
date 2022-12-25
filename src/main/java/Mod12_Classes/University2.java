package Mod12_Classes;

/*
Составляем список студентов
*/

public class University2 {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        University2 u2 = new University2();
        u2.addStudent("Максим Федоренко");
        u2.addStudent("Олег Кесарчук");
        u2.printStudents();
    }
}

