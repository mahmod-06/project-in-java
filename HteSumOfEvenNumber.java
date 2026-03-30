
package hte.sum.of.even.number;

import java.util.Scanner;


public class HteSumOfEvenNumber {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the x : ");
        int x=input.nextInt();
        System.out.print("enter the y : ");
        int y=input.nextInt();
        int sum=0;
        for(int i=x;i<=y;i++){
            if(i%2==0){
                 sum=sum+i;
               
            }
            
        }
         System.out.println(sum);
        
        
    }
    
}
