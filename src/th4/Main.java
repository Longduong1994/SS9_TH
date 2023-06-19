package th4;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Hung",20);
        Student student2 = new Student("Hieu",23);
        Student student3 = new Student("Giang",27);


        Teacher teacher1 = new Teacher("Phu",25);
        Teacher teacher2 = new Teacher("Cuong",28);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        teacher1.displayInfo();
        teacher2.displayInfo();

    }
}
