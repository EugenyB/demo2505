package demo2505.logic;

public class Student {
    private String firstName;
    private String lastName;
    private double mark;
    private int age;

    public Student(String firstName, String lastName, double mark, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
