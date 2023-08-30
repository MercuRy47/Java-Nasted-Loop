import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int amount = kb.nextInt();

        for(int i = 1; i <= amount; i++){ // จำนวนบรรทัด
            for(int j = amount; j >= i; j--){ // จำนวน *
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* Output
   *****
   ****
   ***
   **
   *
 */