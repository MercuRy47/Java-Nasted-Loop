import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int amount = kb.nextInt();

        for(int i = 1; i <= amount; i++){ // จำนวนบรรทัด
            for(int k = 1; k <= (amount * 2)-1; k++){ // จำนวน *
                if(k <= i-1 || k >= 2*amount-i+1){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
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