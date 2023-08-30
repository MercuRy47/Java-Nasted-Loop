import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int row = kb.nextInt();
        int amount_group = kb.nextInt();

        int num = 1;

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= amount_group; j++){
                for(int k = 1; k <= amount_group; k ++){
                    System.out.print(num);
                }
                System.out.print(" ");
            }
            num++;
            System.out.println();
        }
    }
}

/* Input: 5 3 
   Output
111 111 111 
222 222 222 
333 333 333 
444 444 444 
555 555 555 
 */