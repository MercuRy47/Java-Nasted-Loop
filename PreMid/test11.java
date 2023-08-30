import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int amount = kb.nextInt();

        for(int i = 1; i <= amount; i++){
            for(int j = 1; j <= amount*2 - 1; j++){
                if(j <= i-1 || j >= amount*2-i+1){  
                    System.out.print("=");
                }else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}

/* Input: 6 
   Output
+++++++++++
=+++++++++=
==+++++++==
===+++++===
====+++====
=====+=====
 */