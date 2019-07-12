package oopstudentinheritance2;


public class Mtechstudent extends Student {

    private int marks;
    private String specilaisation;

    public int supervar = 50;

    public Mtechstudent() {
    }

    public Mtechstudent(int rollno, String name, int age, int marks, String specilaisation) {
        super(rollno, name, age);
        this.marks = marks;
        this.specilaisation = specilaisation;
    }

    @Override
    public int getRollno() {
        return (super.getRollno() * 10);
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSpecilaisation() {
        return specilaisation;
    }

    public void setSpecilaisation(String specilaisation) {
        this.specilaisation = specilaisation;
    }

    public int getSupervar() {
        return super.supervar;
    }

    @Override
    public int product(int a, int b) {
        return (a * b * 100);
    }

}
