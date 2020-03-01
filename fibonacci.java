
package fibonacci;

import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) 
    {
         Scanner input  = new Scanner(System.in);
         
         
        int range = input.nextInt();
        if ( range == 1 ) 
            System.out.println("0");
        else if ( range == 2) 
            System.out.println("0 1");
        else {
            System.out.print("0 1 ");
            printfb(range- 2,0,1);
        }
    }
    public static void printfb(int i,int a,int b) {
        int fibo ;
        
        if ( i == 0) 
        {
            System.out.println("");
            return ;
        }
        else 
        {
            fibo = a + b ;
            System.out.print(fibo + " ");
            a = b ;
            b = fibo ;
            printfb(i-1,a,b);
        }
    }
    }
    

