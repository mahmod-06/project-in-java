
package loop.hello;

import java.util.Scanner;


public class LoopHello {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
System.out.print("enter number : ");
int n=input.nextInt();
for(int i=0;i<=n;i++){
    System.out.println("Hello");
}
    }
    
}
