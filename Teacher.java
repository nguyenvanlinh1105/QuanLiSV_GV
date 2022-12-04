import java.util.Scanner;

public class Teacher extends Person implements IPerson {
    private int experience;

    public Teacher() {
    }

    public Teacher(int ID, String name, int age, String address, int experience) {
        super(ID, name, age, address);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "ID=" + super.getID() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", address='" + super.getAddress() + '\'' +
                ",experience=" + experience +
                '}';
    }

    public void AddInformation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Display information Teacher");
        super.AddInformation();
        scanner.nextLine();
        System.out.println("Input experience");
        this.experience = scanner.nextInt();
    }

    public void Display(){
        System.out.println("Teacher{" +
                "ID=" + super.getID() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", address='" + super.getAddress() + '\'' +
                ",experience=" + experience +
                '}');
    }
}
