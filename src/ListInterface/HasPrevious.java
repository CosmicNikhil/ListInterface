package ListInterface;

import java.util.*;

public class HasPrevious {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30));
        ListIterator<Integer> li = list.listIterator(list.size());
        while(li.hasPrevious())
        {
            System.out.print(li.previous()+" ");
        }

    }
}
