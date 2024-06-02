import java.lang.System;

public class Main{
    public static void main(String[] args){
        int x;
        int y;
        int z;
        for(x=0;x<2;x++){
            for(y=0;y<2;y++){
                for(z=0;z<2;z++){
                    System.out.printf("%b %s %b %s %b %s", x==1, "e", y==1, "ou", z==1, " = ");
                    System.out.print( ((x*y) + z) >=1);
                    System.out.println();
                }
            }
        }   
    }
}