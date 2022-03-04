import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        ArrayList<Integer> fibo = new ArrayList<>();

        Scanner inp = new Scanner(System.in);
        int inpValue = inp.nextInt();


        for (int i = 0; i < inpValue; i++) {
            if (i == 0) {
                fibo.add(1);
            }else if(i == 1){
                fibo.add(i);
            }else {
                int result = fibo.get(i-1) + fibo.get(i-2);
                fibo.add(result);
            }
        }
        System.out.println(fibo);
    }
}
