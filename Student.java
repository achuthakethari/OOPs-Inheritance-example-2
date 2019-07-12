package oopstudentinheritance2;

public class Student {
    private int rollno;
    private String name;
    private int age;

    public int supervar = 100;

    public Student() {
    }

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int product(int a, int b)
    {
        return(a*b);
    }

    //never add code in getter and setters

    // even adding methods is not good practice bcos all logic should be in another class/place where business req is satisifed
}
