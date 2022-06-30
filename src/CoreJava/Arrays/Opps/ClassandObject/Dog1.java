package CoreJava.Arrays.Opps.ClassandObject;

public class Dog1 {
    public String name;
    public int age;
    public String breed;
    public  String color;

    public Dog1()
    {
        System.out.println("constructor1 starts................... ");
        name="Hunter";
        age=4;
        breed="BullDog";
        color="Brown";
        System.out.println("constructor1 ends................... ");

    }

    public Dog1(String dname,int dage,String dbreed,String dcolor)
    {
        System.out.println("constructor2 starts................... ");
        name=dname;
        age=dage;
        breed=dbreed;
        color=dcolor;
        System.out.println("constructor2 ends................... ");

    }
    public void bark()
    {
        System.out.println(name+" is Barking");
    }
    public void eat()
    {
        System.out.println(name+" is eating");
    }
    public void wagtail()
    {
        System.out.println(name+" is wagging tail");
    }
}
