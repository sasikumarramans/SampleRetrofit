import android.util.Log;

import java.util.Scanner;

public class Prime {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int i,c, num = scanner.nextInt();
/*
        for (i = 2; i <= num; i++) {
            System.out.println(num%i);
            if (num%i == 0){
                break;
            }
        }*/

        for (i = 1,c=0; i <= num; i++) {
            System.out.println(num%i);
            if (num%i == 0){
                c++;

            }
        }
        /*if (num == i)*/
        if (c==2){
            System.out.println("The number is prime");

        } else
            System.out.println("Not a prime");
    }
}
