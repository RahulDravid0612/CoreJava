package JavaCollections.Cursors;

import java.util.ArrayList;

public class Stackdemo {

    static void sol(int i1[]){

        ArrayList<Integer> str1=new ArrayList<Integer>();
        for (int i = 0; i <i1.length-1; i++) {
        str1.get(i1[i]);

        }

        System.out.println(str1);
    }
    public static void main(String[] args)
    {
        int i1[] = { 10, 34, 5, 10, 3, 5, 10 };

        sol(i1);

    }

}
