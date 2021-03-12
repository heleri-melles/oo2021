public class Binary {


    public boolean chekIfBinary(int num) { 
        String number = String.valueOf(num);

        for (int index = 0; index < number.length(); index++ ) {
            
            if (number.charAt(index) != '1' && number.charAt(index) != '0') {
                return false;
            }
        }
        System.out.println("This number is binary");
        System.out.println(toDec(number));

        return true;
    }

    public int toDec(String num) {
        int k = 1;
        int sum = 0;

        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) == '1'){
                System.out.println(k + " " );
            }
            sum += k*Character.getNumericValue(num.charAt(i));
            k = k*2;
        }
        System.out.println("<=> ");
        return sum;
    }
}
