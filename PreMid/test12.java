import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int row = kb.nextInt();
        int amount = kb.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= amount; j++){
                if(j <= amount/2){
                    System.out.print(">");
                }else {
                    System.out.print("<");
                }
            }
            System.out.println();
        }
    }
}

/* Input: 3 6 
   Output
>>><<<
>>><<<
>>><<<
 */