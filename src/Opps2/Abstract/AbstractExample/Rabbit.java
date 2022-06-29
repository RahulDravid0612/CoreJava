package Opps2.Abstract.AbstractExample;

public class Rabbit extends Animals{
    @Override
    public void eat(){
        System.out.println(" Rabbits eats carrot");
    }

    @Override
    public void sleep(){
        System.out.println(" Rabbits sleeps underground in burrow");
    }

    public double getPrice(){
        return 7700;
    }
}
