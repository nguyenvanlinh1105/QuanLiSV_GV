import java.util.Scanner;

public class Student extends Person implements IPerson {
    private float math;
    private float physics;
    private float chemistry;

    public Student(){

    }

    public Student(int ID, String name, int age, String address, float math, float physics, float chemistry) {
        super(ID, name, age, address);
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getPhysics() {
        return physics;
    }

    public void setPhysics(float physics) {
        this.physics = physics;
    }

    public float getChemistry() {
        return chemistry;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }

    public float getAverage() {
        return (getChemistry() + getMath() + getPhysics()) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + super.getID() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", address='" + super.getAddress() + '\'' +
                ", math'" + math + '\'' +
                ", physics='" + physics + '\'' +
                ", chemistry='" + chemistry + '\'' +
                '}';
    }

    public void AddInformation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Display information Student--");
        super.AddInformation();
        scanner.nextLine();
        System.out.println("Input Maths");
        this.math = scanner.nextFloat();
        System.out.println("Input Physics");
        this.physics = scanner.nextFloat();
        System.out.println("Input Chemistry");
        this.chemistry = scanner.nextFloat();
    }
    public void Display(){
        System.out.println("Person{" +
                "ID=" + super.getID() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", address='" + super.getAddress() + '\'' +
                ", math'" + math + '\'' +
                ", physics='" + physics + '\'' +
                ", chemistry='" + chemistry + '\'' +
                '}');
    }



}
