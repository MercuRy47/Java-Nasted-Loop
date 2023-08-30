import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int row = kb.nextInt();
        int column = kb.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || j == 1 || j == column){ // เช็คขอบ
                    System.out.print("+");
                }else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}

/* Input: 3 5  
   Output
+++++
+===+
+++++
 */