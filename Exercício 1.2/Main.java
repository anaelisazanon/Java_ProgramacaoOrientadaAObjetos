import java.lang.System;

public class Main{
    public static void main(String[] args){
        int i,j;
        for(i=1; i<=10; i++){
             for(j=1; j<=10; j++){
                System.out.print(i + " x " + j + " = " + i*j + "\n");
             }
            System.out.print("\n");  
        }
    }
}