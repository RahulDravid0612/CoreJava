package Arrays;

public class ForEachLoopExample2 {
    public static void main(String[] args) {

        char[][] arr={{'a','A'},{'e','E'},{'i','I'},{'o','O'},{'u','U'},};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
            System.out.println("/--------------------------------/");
        for (char [] i : arr) {
            for (char j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
