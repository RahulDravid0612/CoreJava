package CoreJava.Opps.ClassandObject;

public class Dogtest {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="max";
        d.age=6;
        d.breed="poodle";
        d.color="white";

        System.out.println(d.name+" : "+d.age+" : "+d.breed+" : " +d.color);
        d.bark();
        d.eat();
        d.wagtail();
    }
}
