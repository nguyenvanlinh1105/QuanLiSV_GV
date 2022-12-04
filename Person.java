import java.util.Scanner;

public class Person implements IPerson{

    private int ID;
    private String name;
    private int age;
    private String address;

    public  Person(){

    }

    public Person(int ID, String name, int age, String address) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int getYearOfBirth() {
        return 0;
    }
    public void AddInformation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Please input information below---");
        System.out.println("Input ID: ");
        this.ID = scanner.nextInt();
        System.out.println("Input name: ");
        this.name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Input age: ");
        this.age = scanner.nextInt();
        System.out.println("Input address: ");
        this.address = scanner.nextLine();
    }

    public void Display(){
        System.out.println("Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}');
    }

    public void EditInformation1(){
        System.out.println("------Update student information:\n------- ");
        System.out.println("------Original student information:\n------- ");
        this.Display();
        System.out.println("------New student information (Keep id only):\n------- ");
        setID(getID());
        setName(getName());
        setAge(getAge());
        setAddress(getAddress());
    }

    public void EditInformation2(){
        System.out.println("------Update teacher information:\n------- ");
        System.out.println("------Original teacher information:\n------- ");
        this.Display();
        System.out.println("------New teacher information (Keep id only):\n------- ");
        setID(getID());
        setName(getName());
        setAge(getAge());
        setAddress(getAddress());
    }
}

