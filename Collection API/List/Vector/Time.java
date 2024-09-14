import java.util.List;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Collections;

class Time {
    public static void main(String[] args) {

        int count = 1000000;
        long Start, End;

        /*
         * ---------------
         * ArrayList
         * ---------------
         */
        List<Integer> l = new ArrayList<>();
        Start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            l.add(i);
        }
        End = System.currentTimeMillis();
        System.out.println("\nTime Required For ArrayList: " + (End - Start) + "ms");

        /*
         * ---------------
         * Syncronized ArrayList
         * ---------------
         */
        List<Integer> l2 = Collections.synchronizedList(new ArrayList<>());
        Start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            l2.add(i);
        }
        End = System.currentTimeMillis();
        System.out.println("Time Required For Syncronized ArrayList: " + (End -
                Start) + "ms");

        /*
         * ---------------
         * Vector
         * ---------------
         */
        Vector<Integer> v = new Vector<>();
        Start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            v.add(i);
        }
        End = System.currentTimeMillis();
        System.out.println("Time Required for Vector: " + (End - Start) + "ms");

        /*
         * ---------------
         * Hash Set
         * ---------------
         */
        Set<Integer> s = new HashSet<>();
        Start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            s.add(i);
        }
        End = System.currentTimeMillis();
        System.out.println("Time Required for (Hash Set): " + (End - Start) + "ms");

        /*
         * ---------------
         * TreeSet
         * ---------------
         */
        Set<Integer> s2 = new HashSet<>();
        Start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            s2.add(i);
        }
        End = System.currentTimeMillis();
        System.out.println("Time Required for (TreeSet): " + (End - Start) + "ms");

        /*
         * ---------------
         * LinkedHashSet
         * ---------------
         */
        Set<Integer> s3 = new LinkedHashSet<>();
        Start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            s3.add(i);
        }
        End = System.currentTimeMillis();
        System.out.println("Time Required for (LinkedHashSet): " + (End - Start) + "ms");
    }
}