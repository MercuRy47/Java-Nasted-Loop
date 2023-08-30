import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int amount = kb.nextInt();

        for(int i = 1; i <= amount; i++){ // จำนวนบรรทัด
            for(int j = 1; j <= i; j++){ // จำนวน *
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* Output
   *
   **
   ***
   ****
   *****
 */