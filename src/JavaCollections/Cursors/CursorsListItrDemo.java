package JavaCollections.Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorsListItrDemo {
    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();

        data.add("Rahul");
        data.add("Dravid");
        data.add("evolsaayid");

    System.out.println(data);
        ListIterator li=data.listIterator();
        while(li.hasNext()){
            String item=(String)li.next();

            if(item.equals("Rahul")){
                li.add("Deepali");
            }
            if(item.equals("Dravid")){
                li.remove();
            }
            if(item.equals("evolsaayid")){
                li.set("evolsluhar");
            }
        }
        System.out.println(data);

    }
}
