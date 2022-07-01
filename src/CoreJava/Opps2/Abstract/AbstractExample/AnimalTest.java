package CoreJava.Opps2.Abstract.AbstractExample;

public class AnimalTest {
    private static void checkanimals(Animals animals){
        animals.eat();
        animals.sleep();

        if (animals instanceof Horse){
            Horse horse=(Horse)animals;
            System.out.println(horse.getPrice());
            horse.addRider("Annuuss");
        }else if(animals instanceof Rabbit){
            Rabbit rabbit=(Rabbit) animals;
            System.out.println(rabbit.getPrice());
        }
    }

    public static void main(String[] args) {
        Animals a=new Rabbit();
        checkanimals(a);

    }
}
