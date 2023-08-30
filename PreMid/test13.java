import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int amount = kb.nextInt();

        for(int i = 1; i <= amount; i++){
            for(int j = 1; j <= amount; j++){
                if(i%2 == 1){
                    System.out.print(">");
                }else {
                    System.out.print("<");
                }
            }
            System.out.print(" ");
            for(int j = 1; j <= amount; j++){
                if(i%2 == 1){
                    System.out.print("<");
                }else {
                    System.out.print(">");
                }
            }
            System.out.println();
        }
    }
}

/* Input: 6 
   Output
>>>>>> <<<<<<
<<<<<< >>>>>>
>>>>>> <<<<<<
<<<<<< >>>>>>
>>>>>> <<<<<<
<<<<<< >>>>>>
 */