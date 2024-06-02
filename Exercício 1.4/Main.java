import java.lang.System;

public class Main{
    public static void main(String[] args){
        int n = 0;
        int f = 1;
        int j = 0;
        
        System.out.print(n + " " + f + " ");
        
        while (j <= 100) {
            j = n + f;
            if (j <= 100) {
                System.out.print(j + " ");
            }
            n = f;
            f = j;
        }
    }
}