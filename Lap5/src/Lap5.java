import java.util.Arrays;
public class Lap5 {
    static int sum(int[] numbers){
        System.out.println("numbers = "+ Arrays.toString(numbers));
        numbers[0] = 20;
        return 0;
    }
    public static void main(String[] args){
        int[] prices = {10,20,15};
        Lap5.sum(prices);
        System.out.println("prices = "+ Arrays.toString(prices));
    }
}
