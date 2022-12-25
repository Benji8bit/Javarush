package Mod12_Classes;

/*
Составляем список студентов
*/

public class University {
    private static final String[] students = new String[30];

    public static void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public static void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        addStudent("Максим Федоренко");
        addStudent("Олег Кесарчук");
        printStudents();
    }
}

