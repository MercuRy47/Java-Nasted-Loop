import java.util.Scanner;

public class test18 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int row_column = kb.nextInt();

        int num = 1;

        for(int i = 1; i <= row_column; i++){
            for(int j = 1; j <= row_column; j++){
                if(i == 1 || i == row_column || j == 1 || j == row_column){
                    System.out.print(num);
                }else {
                    System.out.print("=");
                }
            }
            num++;
            System.out.println();
        }
    }
}

/* Input: 5
   Output
11111
2===2
3===3
4===4
55555
 */