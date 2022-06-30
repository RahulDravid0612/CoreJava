package CoreJava.Arrays.ControlFlow;

public class ContinueExample2
{
    public static void main(String[] args)
    {
        int searchfornum=24;
        int count=0;
        outer:
        for (int row = 1; row <= 100; row++)
        {
         inner:
         for (int col = 1; col <= 10 ; col++)
         {
             int num =row*col;
             System.out.print(num+"\t");
             if(num == searchfornum) {
                 count++;
                 if (col==1){
                     break outer;
                 }
             }
         }
         System.out.println();
         }
        System.out.println(searchfornum+ " appears " +count+ " times");
    }
}
