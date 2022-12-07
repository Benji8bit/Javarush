package Mod11_Objects;

/*
Зарплата
*/

public class Programmer {
    private int salary = 1000;

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary < this.salary ? this.salary : salary;
    }

}