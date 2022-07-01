package CoreJava.Opps2.Encapsulation;

public class Student {
    public int id;
    public String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        check(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        check(age);
    }

    public void check(int age)
    {
        if (age > 15 && age < 40) {
            this.age = age;
        } else {
            System.out.println("Age should be between 15 and 40");
            System.out.println("Exiting program.........");
            System.exit(-1);
        }
    }

        public void printdetails() {
            System.out.println(id + " " + name + " " + age);
        }

}
