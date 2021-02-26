package Trial_Test;

public class Main {
    public static void main(String[] args) {
        Average av = new Average();
        int[] numbers = {1,2,3,4,5,6};
        System.out.println(av.average(5,6,7));
        System.out.println(av.averageOfList(numbers));
    }
}
