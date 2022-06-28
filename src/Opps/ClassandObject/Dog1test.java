package Opps.ClassandObject;

public class Dog1test {
    public static void main(String[] args) {
        System.out.println("Main methods starts...............");
        Dog1 d=new Dog1();
        d.name="max";
        d.age=6;
        d.breed="poodle";
        d.color="white";
        System.out.println(d.name+" : "+d.age+" : "+d.breed+" : " +d.color);

        Dog1 d1=new Dog1();
        System.out.println(d1.name+" : "+d1.age+" : "+d1.breed+" : " +d1.color);

        Dog1 d2=new Dog1("resell",7,"Chizu","white");
        System.out.println(d2.name+" : "+d2.age+" : "+d2.breed+" : " +d2.color);


        System.out.println("Main methods ends...............");
    }
}
