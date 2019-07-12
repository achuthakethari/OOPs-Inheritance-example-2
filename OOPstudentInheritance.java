package oopstudentinheritance2;

public class OOPstudentInheritance {

    public static void main(String[] args) {

        Student akash = new Student(1, "Akash", 25);
        Student rohit = new Student();

        System.out.println(akash.getRollno() + " " + akash.getName() + " " + akash.getAge());

        rohit.setRollno(2);
        rohit.setName("Rohit");
        rohit.setAge(35);

        System.out.println(rohit.getRollno() + " " + rohit.getName() + " " + rohit.getAge());

        System.out.println("supervar of supercalss - " + rohit.supervar);

        Mtechstudent amit = new Mtechstudent(15, "Amitkumar", 20, 75, "Netwroking");


        System.out.println();
        System.out.println(amit.getRollno() + " " + amit.getName() + " " + amit.getAge() +
                " " + amit.getMarks() + " " + amit.getSpecilaisation());

        System.out.println();
        System.out.println("supervar of sublcasss - " + amit.supervar);
        System.out.println("supervar of superclass through subclass - " + amit.getSupervar());

        System.out.println();
        System.out.println("product of superlcasss - " + akash.product(5,10));
        System.out.println("product of sublcasss - " + amit.product(5,10));


    }
}
