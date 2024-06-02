import java.lang.System;
public class Main{
    public static void main(String[] args){
        int i;
        int dividir;
        boolean PRIMO = false; 
        System.out.print(2 + " ");
        
        for(i=0;i<=100;i++){
            for(dividir=2; dividir<i;dividir++){
                PRIMO = true;
                if(i%dividir == 0){
                    PRIMO = false;
                    break;
                }
            }
            if(PRIMO){
                System.out.print(i + " ");
            }
        }
    }
}

