public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;
    public Date birthday;

    public Person(String name) {
        Date tempDate = new Date(0);
        this(name, 0, 0, 0, tempDate);
    }

    public Person(String name, int age, int height, int weight, Date birthday) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.birthday = birthday;
    }

    // other constructors and methods

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
    public void twins(Object compared) {
        if(this == compared) {
            System.out.println("They aren't twins!");
            return;
        }
        if (!(compared instanceof Person)) {
            System.out.println("Thats not a person!");
            return;
        }
        Person comPerson = (Person) compared;
        if (comPerson.birthday == this.birthday) {
            System.out.println("Twins!");
        } else {
            System.out.println("Nope");
        }

    }
    public static void main(String[] args) {
        System.out.println("Wrong fiel, run it form the main file");
    }
}