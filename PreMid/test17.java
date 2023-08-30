import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int row = kb.nextInt();
        int group = kb.nextInt();
        int column = kb.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= group; j++){
                for(int k =1; k <= column; k++){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}

/* Input: 3 5 2
   Output
** ** ** ** ** 
** ** ** ** ** 
** ** ** ** ** 
 */