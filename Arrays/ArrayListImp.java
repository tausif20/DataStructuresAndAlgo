import java.util.*;
public class ArrayListImp {
    public static void main(String[] args) {

        ArrayList<Integer> a= new ArrayList<Integer>();
        a.add(10);
        a.add(20);
        a.add(10);
        a.add(30);
        System.out.println(a.get(1));
        a.set(1,40);
        System.out.println(a.get(1));
        System.out.println(a.indexOf(10));
        System.out.println(a.lastIndexOf(10));
        System.out.println(a.indexOf(50));

        System.out.println();

        ArrayList<Integer> al= new ArrayList<>(100);
        for(int i=1;i<=100;i++)
        {
            al.add(i);
        }
        Iterator it = al.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}
