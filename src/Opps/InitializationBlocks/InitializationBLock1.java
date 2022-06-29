package Opps.InitializationBlocks;

import java.security.SecureRandom;

public class InitializationBLock1 {

    public int x;

    public static int y;

    public InitializationBLock1(){
        SecureRandom random=new SecureRandom();
      int temp = random.nextInt();
      System.out.println(temp);
        x=temp;

    }
    public InitializationBLock1(int x){
        this.x=x;
    }

    static {
        SecureRandom random=new SecureRandom();
        int temp = random.nextInt();
        System.out.println(temp);
        y=temp;
    }
    {
        x=20;
        System.out.println(x);
    }

}
