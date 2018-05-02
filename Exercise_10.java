package Chapter_11_a_10;

/*
Write a method removeOddLength that accepts a set of strings as a parameter and that removes all of the strings of
odd length from the set.
 */

import java.util.*;

public class Exercise_10
{
    public static void main(String[] args)
    {

        Set <String> set = new HashSet<>();

        set.add("Hej");
        set.add("Udadaa");
        set.add("løgsuppe");
        set.add("knæ");
        set.add("høj");
        set.add("karse");
        set.add("Okay");

        System.out.println(removeOddLength(set));

    }
    public static Set<String>  removeOddLength(Set<String> set)
    {
        Set<String> temp = new HashSet<>();
        temp.addAll(set);
        Iterator<String> a = temp.iterator();

        while (a.hasNext())
        {

            String b = a.next();

            if(b.length() % 2 != 0)
            {
                a.remove();
            }
        }
        return temp;
    }
}
