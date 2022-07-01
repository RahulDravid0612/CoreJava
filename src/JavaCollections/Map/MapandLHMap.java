package JavaCollections.Map;

import java.util.HashMap;
import java.util.LinkedList;

public class MapandLHMap {
    public static void main(String[] args) {

        HashMap<Integer,String> hashmap=new HashMap<Integer,String>();//INSERTION ORDER IDS NOT PRESERVED
        hashmap.put(30,"Java");
        hashmap.put(29,"Python");
        hashmap.put(28,"SQL");
        System.out.println(hashmap);

        LinkedList<String> linkedList=new LinkedList<String>();//INSERTION ORDER IS PRESERVED WITH THE HELP OF LinkedList
        linkedList.push("Java");
        linkedList.push("Python");
        linkedList.push("SQL");

        System.out.println(linkedList);



    }


}
