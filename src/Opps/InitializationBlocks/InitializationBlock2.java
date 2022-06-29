package Opps.InitializationBlocks;

public class InitializationBlock2 {
    public int x=0;
    public static int y=2017;

    public InitializationBlock2(){
        System.out.println("no args constructor");
    }
    public InitializationBlock2(int x){
        System.out.println("pars constructor");
    }

    static {
        System.out.println("1st static InitializationBlock");
    }
     {
        System.out.println("1st non-static InitializationBlock");
    }
    static {
        System.out.println("2st static InitializationBlock");
    }
    {
        System.out.println("2st non-static InitializationBlock");
    }

    public static void main(String[] args) {
        InitializationBlock2 b1=new InitializationBlock2();
        InitializationBlock2 b2=new InitializationBlock2(10);
    }


}
