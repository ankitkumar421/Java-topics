package intro.collection;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 1; i<=5; i++)
        {
            al.add(i);
        }
        System.out.println(al);

        al.remove(0);

        System.out.println(al);

        for (int i=0; i<al.size(); i++)
            System.out.println(al.get(i));
    }
}

