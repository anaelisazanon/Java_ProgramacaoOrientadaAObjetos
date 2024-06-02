
/*Criar um programa em Java com blocos independentes de código (switch case). O programa deve obedecer a seguinte ordem para cada opção numérica fornecida como entrada:


2. Construção de Matriz
Leia dois números inteiros positivos, n e m. 
Em seguida leia uma quantidade de n × m números. 
Considere esses números como elementos de uma matriz:
n representa as linhas de uma matriz.
m representa as colunas de uma matriz.
Imprima a matriz de forma convencional:
Os números da mesma linha devem estar separados por espaços. 
Ao imprimir o último número de uma linha, faça uma quebra de linha.

4. Soma de Matrizes
Faça a leitura de duas matrizes:
Matriz An×m.
Matriz Bn×m.
Some as matrizes A e B.
Imprima a matriz resultante C da soma.

5. Multiplicação de Matrizes
Faça a leitura de duas matrizes:
Inicialmente leia um número m e n.
Depois leia a Matriz An×m.
Depois leia a Matriz Bm×n.
Multiplique as matrizes A e B.
Imprima a matriz resultante C da multiplicação.

Observações:Todas as impressões devem pular linha. O código deve priorizar a utilização de tipos orientadas a objetos (obs: Integer ao invés de int, contudo em algumas situações a utilização de tipos primitidos é permitida, usando-os dentro de laços de repetição por exemplo). O não cumprimento dessa regra resultará em descontos na nota final, mesmo que o sistema avalie seu código com nota 10 (dez).  Caso um número seja informado ao switch case fora do intervalo permitido, o programa deve simplesmente encerrar a execução.  */

import java.lang.System;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class matriz {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor: "); 
        int x = teclado.nextInt(); //scanf

        int N,i,j,M,k;
        int dPrincipal=0;
        int dSecundaria=0;
        int Determinante=0;
        int multiplica;
        int soma=0;


        if(x>= 1 && x<=5){
            switch(x){
               case 1: /* Leia um número inteiro positivo n. 
                Em seguida, leia uma sequência de n números inteiros. 
                Imprima os números em ordem crescente, com um espaçamento simples entre cada número. */
                    System.out.print("Digite N: "); 
                    N = teclado.nextInt();
    
                    ArrayList<Integer> numeros = new ArrayList<>();
                    System.out.println("Digite os números:");
                    for (i = 0; i < N; i++) {
                        int numero = teclado.nextInt();
                        numeros.add(numero);
                    }

                    int[] arrayNumeros = new int[numeros.size()];
                    for (i = 0; i < numeros.size(); i++) {
                        arrayNumeros[i] = numeros.get(i);
                    }

                    Arrays.sort(arrayNumeros);

                    System.out.println("Números em ordem crescente:");
                    for (int elemento : arrayNumeros) {
                        System.out.print(elemento + " ");
                    }

                    break;

                case 2:
                   
                    System.out.print("Digite o número de linhas (n): ");
                    int n = teclado.nextInt();
                    System.out.print("Digite o número de colunas (m): ");
                    int m = teclado.nextInt();
        
        
                    int[][] matriz = new int[n][m];
                    System.out.println("Digite os elementos da matriz:");
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < m; j++) {
                            matriz[i][j] = teclado.nextInt();
                        }
                    }
        

                    System.out.println("Matriz:");
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < m; j++) {
                            System.out.print(matriz[i][j]);
            
                            if (j < m - 1) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
            
                    break;
        

                 case 3: //3. Determinante da Matriz OK
                    System.out.print("Digite N: "); 
                    N = teclado.nextInt();

                    Integer[][] quadrada = new Integer[N][N];

                    for(i=0;i<N;i++){
                        for(j=0;j<N;j++){
                            quadrada[i][j] = teclado.nextInt();
                        }
                    }

                    //quadrada[0][0] * quadrada[1][1] * quadrada[2][2]
                    //quadrada[0][1] * quadrada[1][2] * quadrada[2][0]
                    //quadrada[0][2] * quadrada[1][0] * quadrada[2][1]
                    System.out.println();
                    for(i=0;i<N;i++){
                        multiplica=1;
                        for(j=0;j<N;j++){
                            //System.out.printf("[%d][%d] \t", j, (i+j)%N); //n extrapola limite do N
                            multiplica = multiplica * quadrada[j][(i+j)%N];
                        }
                        //System.out.println();
                        dPrincipal = dPrincipal + multiplica;
                    }

                
                    ////quadrada[0][2] * quadrada[1][1] * quadrada[2][0]
                    //quadrada[0][1] * quadrada[1][0] * quadrada[2][2]
                    //quadrada[0][0] * quadrada[1][2] * quadrada[2][1]
                    for(i=0;i<N;i++){
                        multiplica=1;
                        for(j=0;j<N;j++){
                            //System.out.printf("[%d][%d] \t", j, N-1-j-i); 
                            multiplica = multiplica * quadrada[j][((((N-1-j-i)%N) + N) % N)]; //para n ficar negativo


                        }
                        dSecundaria = dSecundaria + multiplica;
                    }
                        //System.out.println();
                    Determinante = dPrincipal - dSecundaria;
                    System.out.println(Determinante); 

                
                    break;



        
                case 4:
                          
                    System.out.print("Digite o número de linhas (n): ");
                    n = teclado.nextInt();
                    System.out.print("Digite o número de colunas (m): ");
                    m = teclado.nextInt();

      
                    System.out.println("Digite os elementos da matriz A:");
                    int[][] matrizA = new int[n][m];
                    System.out.println("Digite os elementos da matriz:");
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < m; j++) {
                            matrizA[i][j] = teclado.nextInt();
                        }
                    }
            
                
                    System.out.println("Digite os elementos da matriz B:");
                    int[][] matrizB = new int[n][m];
                    System.out.println("Digite os elementos da matriz:");
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < m; j++) {
                            matrizB[i][j] = teclado.nextInt();
                        }
                    }
            
           
                    int[][] matrizC = new int[n][m];
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < m; j++) {
                            matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                        }
                    }
            
                 
                    System.out.println("Matriz resultante da soma (C):");
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < m; j++) {
                            System.out.print(matrizC[i][j] + " ");
                        }
                        System.out.println(); 
                    }
                    break;
        

                case 5: //5. Multiplicação de Matrizes OK
                    System.out.print ("N: ");
                    N = teclado.nextInt();
                    System.out.print ("M: ");
                    M = teclado.nextInt();

                    int[][] A = new int[N][M];
                    int[][] B = new int[M][N];
                    int[][] C = new int[N][N];

                    System.out.println("Matriz A:");
                    for(i = 0; i < N; i++){
                        for(j = 0; j < M; j++){
                            A[i][j] = teclado.nextInt();
                        }
                    }

                    System.out.println("Matriz B:");
                    for(i = 0; i < M; i++){
                        for(j = 0; j < N; j++){
                            B[i][j] = teclado.nextInt();
                        }
                    }

                    for(i = 0; i < N; i++){
                        for(j = 0; j < N; j++){
                            soma = 0;
                            for(k = 0; k < M; k++){
                                soma += A[i][k] * B[k][j];
                            }
                            C[i][j] = soma;
                        }
                    }

                    System.out.println("Resultado da multiplicação das matrizes:");
                    for(i = 0; i < N; i++){
                        for(j = 0; j < N; j++){
                            System.out.print(C[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

            }
        }else{
            System.exit(0);
        }
    teclado.close();
    }
}