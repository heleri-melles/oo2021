
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

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

    }
    //HashMap - salvestab value ja key
    // lists - salvestab indeksitega, järjekorras, muudetavad, saab dubleerida
    //HashSet - unikaalsed objektid, (ei kordu)
    
}