//import java.io.*;
import java.util.*;

class Learning{
    public static void main(String[] args) {
        //size of ArrayList
        int n = 5;
        
        List<Integer> arrli = new ArrayList<Integer>(n);

        for (int i = 1; i<= n; i++)
            arrli.add(i);
        System.out.println(arrli);

        arrli.remove(3);
        System.out.println(arrli);

        //Printing elements one by one
        for (int i = 0; i< arrli.size(); i++)
            System.out.println(arrli.get(i) + " ");
    }
    
}