import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int row = kb.nextInt();
        int column = kb.nextInt();

        int num = 1;

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                System.out.print(num + " ");
            }
            num++;
            System.out.println();
        }
    }
}

/* Input: 5 3
   Output
1 1 1 
2 2 2 
3 3 3 
4 4 4 
5 5 5 
 */