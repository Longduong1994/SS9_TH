package th4;

public class Teacher extends Person {
    public Teacher(){}
    public Teacher(String name, int age){
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("teacher{Name:  " + this.getName() + "--Age :" + this.getAge() + "}");
    }

}
