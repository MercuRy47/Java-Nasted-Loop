public class test9 {
    public static void main(String[] args) {
        for(int hour = 0; hour < 24; hour++){
            for(int minute = 0; minute < 60; minute++){
                for(int second = 0; second < 60; second++){
                    System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
                }
            }
        }
    }
}

/* 
00:00:00
00:00:01
    :
23:59:59
*/