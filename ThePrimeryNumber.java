
package the.primery.number;

import java.util.Scanner;


public class ThePrimeryNumber {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
System.out.println("enter the number : ");
int n=input.nextInt();
for(int i=1;i<=n;i++){
    if(i%2==1){
        System.out.println(i);
    }
}
    }
    
}
