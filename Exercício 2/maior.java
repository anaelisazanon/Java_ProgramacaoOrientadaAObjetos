import java.lang.System;
import java.util.Scanner;

public class maior {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite: "); 
        int x = teclado.nextInt();

        if(x>= 1 && x<=5){
            switch(x){
                case 1:
                    int num1 = teclado.nextInt();
                    if(num1 > 10){
                        System.out.println("MAIOR"); 
                    }else{
                        System.out.println("MENOR");
                    }
                    break;
        
                case 2:
                    int num = teclado.nextInt();
                    int resultado = 0;

                    if((num % 2 == 0) && (num % 3 != 0)){
                        resultado = num * 5;
                    }
                    if((num % 3 == 0) && (num % 2 != 0)){
                        resultado = num -1;
                    }
                    if((num % 3 == 0) && (num % 2 == 0)){
                        resultado = num * 5;
                        resultado = resultado -1;
                    }
                    if((num % 3 != 0) && (num % 2 != 0)){
                        System.out.println(num);
                        break;
                    }
                    System.out.println(resultado);
                    break;
        
                 case 3:
                    int num2 = teclado.nextInt();
                    String[] palavras = new String[num2];

                    teclado.nextLine(); //ignorar enter e ir p prox linha //buffer do teclado

                    for(int j=0; j<num2;j++){
                        palavras[j] = teclado.nextLine(); 
                    }

                    for(int i=num2-1; i>=0; i--){
                        System.out.println(palavras[i] + " "); 
                    }
                    System.out.println();
                    break;
        
                case 4:
                    // MDC
                    int num3 = teclado.nextInt();
                    int num4 = teclado.nextInt();

                    int resto;
                    int a = num3;
                    int b = num4;

                    while (b != 0) {
                        resto = a % b;
                        a = b;
                        b = resto;
                    }
                    System.out.println(a);

                 
                    break;
        
                case 5:
                    //Leia vários números inteiros até realizar a leitura de um não número.
                    //Calcule a soma de todos os números lidos.
                    int soma=0;
                    int n;

                    while (teclado.hasNextInt()){
                        n = teclado.nextInt();
                        soma = n + soma;
                    }
                    
                    System.out.println(soma); 
           
                    break;
            }
        }else{
            System.exit(0);
        }
    teclado.close();
    }
}
