package Opps2.Abstract.AbstractExample;

public class Horse extends Animals {
    @Override
    public void eat(){
        System.out.println(" horse eats hay");
    }

    @Override
    public void sleep(){
        System.out.println(" horse sleeps standing up");
    }

    public double getPrice(){
        return 150000;
    }
    public void addRider(String name){
        System.out.println(name+" is riding a horse ");
    }
}
