package Arrays;

public class ForEachLoopExample1 {
    public static void main(String[] args) {

        int[] arr=new int[3];

//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=50;
//        }
        for (int x:arr) {
            arr[x]=50;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
