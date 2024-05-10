package ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class HasNext {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30));
        ListIterator<Integer> li = list.listIterator();
        while(li.hasNext())
        {
            System.out.print(li.next()+" ");
        }
    }
}
