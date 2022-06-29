package Opps2.Polymorphism;


  class parent{
    public void m1(){
        System.out.println("parent :m1()");
    }
}
 class child extends parent{
     @Override
    public void m1(){
        System.out.println("child :m1()");
    }
}
public class polymorphism {
    public static void main(String[] args) {
    parent p1=new parent();
    p1.m1();
    child c1=new child();
    c1.m1();

    p1=c1;
    p1.m1();
    }

}
