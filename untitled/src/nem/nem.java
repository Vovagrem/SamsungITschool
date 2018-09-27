package nem;

import java.util.Scanner;

public class nem {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        boolean even = false;
        int oddCount = 0;
        int evenProduct = 1;
        int digit;

        while (n != 0)
        {
            digit = n % 10;
            if (digit % 2 == 0)
            {
                even = true;
                evenProduct *= digit;
            }
            else
            {
                oddCount++;
            }

            n /= 10;
        }

        evenProduct = even ? evenProduct : 0;

        System.out.print(oddCount + " " + evenProduct);
    }
}
