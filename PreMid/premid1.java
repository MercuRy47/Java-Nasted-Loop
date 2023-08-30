import java.util.Scanner;

public class premid1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int pass = 0;
        int fail = 0;

        for(int i = 1; i <= n; i++){
            int score = kb.nextInt();

            if(score > 60){
                pass++;
            }else {
                fail++;
            }
        }
        System.out.println("Pass: " + pass);
        System.out.println("Fail: " + fail);
    }
}
