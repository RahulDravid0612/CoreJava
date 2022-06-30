package CoreJava.Arrays.Opps2.Polymorphism;


class parent1{
    public void m1(){
        System.out.println("parent :m1()");
    }
}
class child1 extends parent1{
    @Override
    public void m1(){
        System.out.println("child :m1()");
    }
    public void m2(){
        System.out.println("child :m2()");
    }
}

public class polymorphism1 {
    public static void main(String[] args) {
        Object obj=new child1();//Implicit Casting

        child1 c= (child1) obj;//Explicit Casting
        obj.toString();
//      obj.m1();
//      obj.m2();

        parent1 p1=new child1();
        obj.toString();
        p1.m1();
//        p1.m2();

        child1 c1=new child1();
        obj.toString();
        c1.m1();
        c1.m2();

    }
}
