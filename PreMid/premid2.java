import java.util.Scanner;

public class premid2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int topScore = Integer.MIN_VALUE;
        int secondScore = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++){
            int score = kb.nextInt();

            if(score > topScore){
                secondScore = topScore;
                topScore = score;
            }else if(score > secondScore && score < topScore){
                secondScore = score;
            }
        }
        if(secondScore == Integer.MIN_VALUE){
            System.out.println("ERROR");
        }else {
            System.out.println("Secound is: " + secondScore);
        }
    }
}
