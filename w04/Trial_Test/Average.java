package Trial_Test;

import java.util.ArrayList;

public class Average {

//Koosta funktsioon kolme arvu aritmeetilise keskmise leidmiseks. Katseta.*
// Koosta funktsioon massiivi libiseva keskmise leidmiseks.
// Väljundiks on massiiv, mis on sisendist kahe elemendi võrra lühem ning mille iga elemendi väärtuseks on sisendmassiivi
// vastava elemendi ning selle järgmise ja ülejärgmise elemendi keskmine.
//Koosta joonis, kus täppidega on tähistatud failist loetud sisendmassiivi väärtused ning ühendatud joontena algse massiivi 
//põhjalt arvutatud libiseva keskmise väärtused.


    public float average(int a, int b, int c){
        float sum = a + b + c;
        return sum/3;
    }

    public ArrayList<Integer> averageOfList(int[] numbers){
        int i0 = 0;
        int i1 = 1;
        int i2 = 2;
        ArrayList<Integer> nums = new ArrayList<>();

        while (numbers.length > i2 ){
            int sum = numbers[i0] + numbers[i1] + numbers[i2];
            nums.add(sum/3);
            i0 ++;
            i1 ++;
            i2 ++;
        }
        return nums;
    }

}
