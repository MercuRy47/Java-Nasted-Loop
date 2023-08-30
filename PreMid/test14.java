import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int amount = kb.nextInt();

        for(int i = 1; i <= amount; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i <= amount-2; i++){
            System.out.print("*");
        }
        System.out.println();
        if(amount > 4){
            for(int i = 1; i <= amount-4; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* Input: 9 
   Output
*********
*******
*****
 */