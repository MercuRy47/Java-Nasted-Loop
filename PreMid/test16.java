import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int m = kb.nextInt();
        int n = kb.nextInt();

        int num1 = 1;
        int num2 = 1;

        for(int i = 1; i <= m; i++){
            for(int j =1; j <= n; j++){
                System.out.printf("%d  %d\n", num1, num2);
                num2++;
            }
            num1++;
            num2 = 1;
        }
    }
}

/* Input: 3 5
   Output
1  1
1  2
1  3
1  4
1  5
2  1
2  2
2  3
2  4
2  5
3  1
3  2
3  3
3  4
3  5
 */