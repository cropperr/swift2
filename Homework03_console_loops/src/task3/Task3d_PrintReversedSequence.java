
package task3;

import java.util.Scanner;
public class Task3d_PrintReversedSequence {
      public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int numberCount = sc.nextInt();
        String result = "";
        
        for(int i = 0; i < numberCount; i++) {
            int n = sc.nextInt();
            result = n + " " + result;
        }
        
        System.out.println(result);
    }
}
