package Opps2.Abstract;

abstract class A extends Object{
    public A(){
        super();
    }
    public abstract void m1();
}

abstract class B extends A{
    public B(){
        super();
    }
}


class C extends A{
    public C(){
        super();
    }
    public void m1(){
        System.out.println("C :m1()");
    }
}


public class TestAbstraction {
    public static void main(String[] args) {
//        A[] arr=new A[5];
        A a1=new C();
        a1.m1();
    }
}
