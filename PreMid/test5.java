import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int amount = kb.nextInt();

        for(int i = amount; i >= 1; i--){ // จำนวนบรรทัด
            for(int k = 1; k <= (i * 2)-1; k++){ // จำนวน *
                System.out.print("*");
            }
            System.out.println();
            for(int j = amount; j >= i; j--){ // จำนวนช่องว่าง
                System.out.print(" "); 
            }
        }
    }
}

/* Output
 *********
  *******
   *****
    ***
     *
 */