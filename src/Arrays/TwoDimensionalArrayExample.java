package Arrays;

public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        int [][] arr=new int[3][2];

//        arr[0]=new int[2];
//        arr[1]=new int[2];
//        arr[2]=new int[2];

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println("-----------------------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("aar[" + i +"][" + j +"]:" + arr[i][j]);
            }
        }

    }
}